package controller;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import communication.AddAssignmentForResponse;
import communication.AddAssignmentForStudentRequest;
import communication.DefineAssignmentRequest;
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
		
		
		/**
		 * Instantiates a new open and submit assignment by student controller.
		 */
		public OpenAndSubmitAssignmentByStudentController()
		{
			Dispatcher.addHandler(AddAssignmentForResponse.class.getCanonicalName(), this);
		}

		
	    public void initData(Assignment assignment, int userId) {
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
    	    if (selectedFile == null) return;

    	    textFieldChoosen.setText(selectedFile.getName());
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
    		

    		//check format file:
      	 String fileName= selectedFile.getName();
       	    int dotIndex = fileName.lastIndexOf('.');
       	    String format= (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);
       	 if ((Objects.equals(format, new String("word"))) ||
       	    (Objects.equals(format, new String("PDF"))) ||
       		(Objects.equals(format, new String("Excel")))  )
       		        Prompt.alert(3,"please upload a file with valid format");
    		
    		
//        	//get date of today:
        	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    		LocalDate todayDate = LocalDate.now();
    		System.out.println(dtf.format(todayDate)); //2017/06/29 FORMAT
//    		//check if late the submission
    		Date s= assignment.getDate();
    		if(todayDate.compareTo(todayDate)>0){
                System.out.println("Date1 is after Date2");
            }else if(todayDate.compareTo(todayDate)<0){
                System.out.println("Date1 is before Date2");
//            //if late-send sign....?


    		

    		AddAssignmentForStudentRequest newAssignment = new AddAssignmentForStudentRequest(
					new java.sql.Date(Calendar.getInstance().getTime().getTime()),
					selectedFile.getName(),
					fileBytes,
					assignment.getAssignmentNumber(),
					this.userId);
		
		MATClientController.getInstance().sendRequestToServer(newAssignment);
            }
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	

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
 
}





    








    

