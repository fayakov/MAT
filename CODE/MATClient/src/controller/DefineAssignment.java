package controller;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import communication.AddAssignmentForStudentRequest;
import communication.CreateAssignmentResponse;
import communication.DefineAssignmentRequest;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import utils.Handler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

/**
 * The Class DefineAssignment.
 */
public class DefineAssignment implements Initializable, Handler
{
	
	/** The format file. */
	String formatFile; //save format file
	
	/**
	 * Instantiates a new define assignment.
	 */
	public DefineAssignment()
	{
		Dispatcher.addHandler(CreateAssignmentResponse.class.getCanonicalName(), this);
	}
	
	/** The coid. */
	int clid, coid;  // class id, course id
	
	 /** The label define ass. */
 	@FXML
	    private Label labelDefineAss;
	    
    	/** The label upload. */
    	@FXML
	    private Label labelUpload;
	    
    	/** The label insert class. */
    	@FXML
	    private Label labelInsertClass;
	    
    	/** The label insert course. */
    	@FXML
	    private Label labelInsertCourse;
	    
    	/** The date picker define date. */
    	@FXML
	    private DatePicker datePickerDefineDate;
	    
    	/** The text field insert class. */
    	@FXML
	    private TextField textFieldInsertClass;
	    
    	/** The text field insert couse. */
    	@FXML
	    private TextField textFieldInsertCouse;
	    
    	/** The button send define ass. */
    	@FXML
	    private Button buttonSendDefineAss;
	    
    	/** The label define date. */
    	@FXML
	    private Label labelDefineDate;
	    
    	/** The button upload. */
    	@FXML
	    private Button buttonUpload;
    	
    	@FXML
        private TextField txtFieldChoosen;

		private int userId;

		private File selectedFile;

	    
	    
	    /**
    	 * Press upload.
    	 *
    	 * @param event the event
    	 */
    	@FXML
	    void pressUpload(ActionEvent event) 
	    {    		
    		FileChooser chooser = new FileChooser();
    	    chooser.setTitle("Open File");
    	    this.selectedFile = chooser.showOpenDialog(new Stage());
    	    
    	    if (selectedFile == null) return;
			txtFieldChoosen.setText(selectedFile.getName());
			
	    }
	    
	    
	    /**
    	 * Send define assignment.
    	 *
    	 * @param event the event
    	 */
    	@FXML
	    void sendDefineAssignment(ActionEvent event) 
	    {
    		if (this.selectedFile == null)
    		{
    			Alert alert = new Alert(AlertType.INFORMATION);
    			alert.setTitle("Error");
    			alert.setHeaderText(null);
    			alert.setContentText("לא נבחר קובץ להעלאה");
    			alert.showAndWait();
    			return;
    		}
    	    
    		if (this.textFieldInsertCouse.getText().isEmpty()) {
    			Alert alert = new Alert(AlertType.INFORMATION);
    			alert.setTitle("Error");
    			alert.setHeaderText(null);
    			alert.setContentText("חובה להכניס מספר קורס");
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
	    			    
	    		LocalDate localDate = this.datePickerDefineDate.getValue();
	    		Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
	    		Date date = Date.from(instant);
	    		
	    		DefineAssignmentRequest newAssignment = new DefineAssignmentRequest(
	    					new java.sql.Date(date.getTime()),
	    					selectedFile.getName(),
	    					fileBytes,
	    					this.userId,
	    					Integer.parseInt(this.textFieldInsertCouse.getText()));
	    		
	    		MATClientController.getInstance().sendRequestToServer(newAssignment);
	    		
			} catch (IOException e) {
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
		if (msg instanceof CreateAssignmentResponse) 
		{
			CreateAssignmentResponse res = (CreateAssignmentResponse)msg;
			
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
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}


	public void initData(int userId) {
		// TODO Auto-generated method stub
		this.userId = userId;
	}
	
	
}

















    

