package controller;


import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.ResourceBundle;
import communication.AddAssignmentForResponse;
import communication.AddAssignmentForStudentRequest;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import entities.Assignment;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import utils.Handler;

/**
 * The Class OpenAndSubmitAssignmentByStudentController.
 */

public class OpenAndSubmitAssignmentByStudentController implements Initializable, Handler
{

		public OpenAndSubmitAssignmentByStudentController(File selectedFile)
		{
			super();
			this.selectedFile = selectedFile;
		}


		public OpenAndSubmitAssignmentByStudentController(Boolean isFormatValid) 
		{
			super();
			this.isFormatValid = isFormatValid;
		}
		
		/**
		 * Instantiates a new open and submit assignment by student controller.
		 */
		public OpenAndSubmitAssignmentByStudentController()
		{
			Dispatcher.addHandler(AddAssignmentForResponse.class.getCanonicalName(), this);
			
		}


		/** The text field ass num. */
    	@FXML
	    private TextField textFieldAssNum;
	    
    	/** The button download. */
    	@FXML
	    private Button buttonDownload;
	    
    	/** The label upload. */
    	@FXML
	    private Label labelUpload;
	    
    	/** The label ass num. */
    	@FXML
	    private Label labelAssNum;
	    
    	/** The button upload. */
    	@FXML
	    private Button buttonUpload;
	    
    	/** The label download. */
    	@FXML
	    private Label labelDownload;
	    
    	/** The button send sub. */
    	@FXML
	    private Button buttonSendSub;

		private Assignment assignment;
		
		@FXML
	    private TextField textFieldChoosen;

		private int userId;
		private File selectedFile;
		private String format;
		private String fileName;
		private Boolean isFormatValid;
		private Boolean isDateLate;
		private Boolean isSelectedFile;
		private Date submission;

		
	    public void initData(Assignment assignment, int userId) 
	    {
	    	this.assignment = assignment;
			textFieldAssNum.setText(Integer.toString(assignment.getAssignmentNumber()));
			this.userId = userId;
	    }
	    
	    
	    /**
    	 * Press download.
    	 *
    	 * @param event the event
    	 * @throws Exception the exception
    	 */
    	@FXML
	    void pressDownload(ActionEvent event) throws Exception 
	    {
    		try {
    			//Save the file to Documents folder of current user.
    			String fileDirectory = System.getProperty("user.home") + File.separator + "Documents" + File.separator;
    			String outputFile = fileDirectory + assignment.getFileName();
    			
    			if (!new File(fileDirectory).exists()) {
    				new File(fileDirectory).mkdirs();
    			}
    			
	    		File dstFile = new File(outputFile);
	    		FileOutputStream fileOutputStream = new FileOutputStream(dstFile);
	    		fileOutputStream.write(assignment.getFileData());
	    		fileOutputStream.flush();
	    		fileOutputStream.close();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		
	    }

	    
	    /**
    	 * Press upload.
    	 *
    	 * @param event the event
    	 */
    	@FXML
	    public void pressUpload(ActionEvent event) 
	    {
    		FileChooser chooser = new FileChooser();
    	    chooser.setTitle("Open File");
    	    this.selectedFile = chooser.showOpenDialog(new Stage());
    	    isSelectedFile = selectedFile(selectedFile);
    	    if (!(isSelectedFile)) return;

    	    textFieldChoosen.setText(selectedFile.getName());
		} 
    	
    	public boolean selectedFile(File selectedFile)
    	{
    		 if (selectedFile == null) return false;
    		 else return true;
    	}

	    
    /**
     * Send submission.
     *
     * @param event the event
     */
    @FXML
    public void sendSubmission(ActionEvent event) 
    {
    	if (this.selectedFile == null)
		{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Error");
			alert.setHeaderText(null);
			alert.setContentText("No upload file selected");
			alert.showAndWait();
			return;
		}
	    
    	System.out.println(selectedFile.getAbsolutePath());
    	
    	
    	DataInputStream diStream;
		try {
			diStream = new DataInputStream(new FileInputStream(selectedFile));
			long len = (int) selectedFile.length();
    		byte[] fileBytes = new byte[(int) len];
    		int read = 0;
    		int numRead = 0;
    		while (read < fileBytes.length && (numRead = diStream.read(fileBytes, read, fileBytes.length - read)) >= 0) {
    			read = read + numRead;
    		}
    		

    		isFormatValid=checkFormat(selectedFile);
    		if (isFormatValid == false)
    			Prompt.alert(3,"please upload a file with valid format");
    		
    		
    		submission = assignment.getDate();
    		isDateLate = DateLate(submission);
    		if (isDateLate == false)
    			Prompt.alert(3,"date of submission passed");

    		
    		AddAssignmentForStudentRequest newAssignment = new AddAssignmentForStudentRequest(
					new java.sql.Date(Calendar.getInstance().getTime().getTime()),
					selectedFile.getName(),
					fileBytes,
					assignment.getAssignmentNumber(),
					this.userId);
		
		MATClientController.getInstance().sendRequestToServer(newAssignment);
            
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	

    }
   

   public Boolean checkFormat(File selectedFile)
   {
	 //check format file:
    	 fileName= selectedFile.getName();
     	    int dotIndex = fileName.lastIndexOf('.');
     	    format= (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);
     	 
     	
		if (!((Objects.equals(format, new String("docx"))) ||
	     	    (Objects.equals(format, new String("pdf"))) ||
	     		(Objects.equals(format, new String("xlsx")))  ))
			return false;
		else 
			return true;
   }
   
   
public Boolean DateLate(Date submission)
{
	//get date of today:
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDate todayDate = LocalDate.now();
	System.out.println(dtf.format(todayDate)); //2017/06/29 FORMAT
	
	//check if late the submission
	
	LocalDate date = submission.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	
	if((todayDate.compareTo(date))<=0)
	{
       System.out.println("Date1 is after Date2");
       return true;
	}
	else 
		return false;
	
//   //if late-send sign....?

   
}
	
   
	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) 
	{
		// TODO Auto-generated method stub
		if (msg instanceof AddAssignmentForResponse) 
		{
			AddAssignmentForResponse res = (AddAssignmentForResponse)msg;
			
			if (res.isRequestSecceded()) 
			{
				System.out.println("Server response: Success");
				
			} else {
				System.out.println("Server response:" + res.getErrText());
			}
		}
		
		}




	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	public void initialize(URL location, ResourceBundle resources) 
	{
		// TODO Auto-generated method stub
		
	}


	public File getSelectedFile() {
		return selectedFile;
	}


	public void setSelectedFile(File selectedFile) {
		this.selectedFile = selectedFile;
	}


	public String getFormat() {
		return format;
	}


	public void setFormat(String format) {
		this.format = format;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
 
}





    








    

