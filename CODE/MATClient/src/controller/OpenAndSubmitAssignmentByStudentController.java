package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import communication.AddAssignmentForResponse;
import communication.Dispatcher;
import communication.Message;
import entities.Assignment;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import utils.Handler;

/**
 * The Class OpenAndSubmitAssignmentByStudentController.
 */
public class OpenAndSubmitAssignmentByStudentController implements Initializable, Handler
{
	
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

	    public void initData(Assignment assignment) {
	    	this.assignment = assignment;
			textFieldAssNum.setText(Integer.toString(assignment.getAssignmentNumber()));
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
    			// Yinon: Save the file to Documents folder of current user.
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
    		
    		
    		/*
	    	 String line;
	         BufferedReader in;

	         in = new BufferedReader(new FileReader("testFile"));
	         line = in.readLine();

	         while(line != null)
	         {
	                System.out.println(line);
	                line = in.readLine();
	         }

	         System.out.println(line);
	    	
	    	*/
	    }

	    
	    /**
    	 * Press upload.
    	 *
    	 * @param event the event
    	 */
    	@FXML
	    void pressUpload(ActionEvent event) 
	    {
//	    	JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
//
//			int returnValue = jfc.showOpenDialog(null);
//			// int returnValue = jfc.showSaveDialog(null);
//
//			if (returnValue == JFileChooser.APPROVE_OPTION) {
//				File selectedFile = jfc.getSelectedFile();
//				System.out.println(selectedFile.getAbsolutePath());
//			}
//			
//			
//			//check format file:
//	    	 String fileName= selectedFile.getName();
//	    	    int dotIndex = fileName.lastIndexOf('.');
//	    	    String format= (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);
//	    	 if ((Objects.equals(format, new String("word"))) ||
//	    	    (Objects.equals(format, new String("PDF"))) ||
//	    		(Objects.equals(format, new String("Excel")))  )
//	    		        Prompt.alert(3,"please upload a file with valid format");
	    }
    

	    
    /**
     * Send submission.
     *
     * @param event the event
     */
    @FXML
    void sendSubmission(ActionEvent event) 
    {
//    	//get date of today:
//    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//		LocalDate todayDate = LocalDate.now();
//		System.out.println(dtf.format(todayDate)); //2017/06/29 FORMAT
//		
//		//check if late the submission
//		if(todayDate.compareTo(todayDate)>0){
//            System.out.println("Date1 is after Date2");
//        }else if(todayDate.compareTo(todayDate)<0){
//            System.out.println("Date1 is before Date2");
//        //if late-send sign....?
//		
//		
//    	AddAssignmentForResponse addAssignmentForReq = new AddAssignmentForResponse(fileName, file,assignment.teacherId, assignment.courseName, todayDate,assignment.assignmentNumber, studentId);
//    	MATClientController.getInstance().sendRequestToServer(addAssignmentForReq);
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
	
 
    /**
     * Initialize.
     */
    @FXML
    void initialize() {
         
    }
    
   
}





    








    

