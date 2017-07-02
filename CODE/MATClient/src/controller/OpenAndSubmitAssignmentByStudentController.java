package controller;

import java.io.BufferedReader;
import java.io.FileReader;
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

public class OpenAndSubmitAssignmentByStudentController implements Initializable, Handler
{
	
	public OpenAndSubmitAssignmentByStudentController()
	{
		Dispatcher.addHandler(AddAssignmentForResponse.class.getCanonicalName(), this);
	}
	
	    @FXML
	    private TextField textFieldAssNum;
	    @FXML
	    private Button buttonDownload;
	    @FXML
	    private Label labelUpload;
	    @FXML
	    private Label labelAssNum;
	    @FXML
	    private Button buttonUpload;
	    @FXML
	    private Label labelDownload;
	    @FXML
	    private Button buttonSendSub;

	    public void initData(Assignment assignment) {

			textFieldAssNum.setText(Integer.toString(assignment.getAssignmentNumber()));
	    }
	    
	    
	    @FXML
	    void pressDownload(ActionEvent event) throws Exception 
	    {
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
	    	
	    	
	    }

	    
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
//    	AddAssignmentForResponse addAssignmentForReq = new AddAssignmentForResponse(fileName, file, teacher, course, todayDate,assignmentNumber, studentId);
//    	MATClientController.getInstance().sendRequestToServer(addAssignmentForReq);
    }
   


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




	public void initialize(URL location, ResourceBundle resources) 
	{
		// TODO Auto-generated method stub
		
	}
	
 
    @FXML
    void initialize() {
         
    }
    
   
}





    








    

