package controller;



import java.sql.Date;
import java.time.LocalDate;

import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import communication.OpenSemesterRequest;
import communication.OpenSemesterResponse;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.Handler;

/**
 * The Class OpenSemesterController.
 */
public class OpenSemesterController implements Handler {
	
	/**
	 * Instantiates a new open semester controller.
	 */
	public OpenSemesterController(){
		Dispatcher.addHandler(OpenSemesterResponse.class.getCanonicalName(), this);
	}
	
		/** The list. */
		//ArrayList<Semester> semester = new ArrayList<Semester>();
		ObservableList<String> list;
		
		/** The e date. */
		private Date sDate, eDate;
	    
		/** The end date. */
		@FXML
		private DatePicker endDate;

		/** The start date. */
		@FXML
		private DatePicker startDate;
	    
	    /** The btn close. */
    	@FXML
	    private Button btnClose;

	    /**
    	 * Creates the semester.
    	 *
    	 * @param event the event
    	 */
    	@FXML
	    void createSemester(ActionEvent event)	{
	    	
	    	if(false)
	    	 // + date check empty
	    		Prompt.alert(3, "one or more of the fields is empty");    	    	
	    	else { 		
	    			sDate = Date.valueOf(startDate.getValue());
	    			eDate = Date.valueOf(endDate.getValue());
	    			System.out.println(sDate + "\n" + eDate);
	    		 }
		 			
	    		OpenSemesterRequest openSemesterReq = new OpenSemesterRequest(sDate, eDate);
		        MATClientController.getInstance().sendRequestToServer(openSemesterReq);
	    		   	
	    	}	    		    		
	    		    
	  	    
	    /**
    	 * Close semester.
    	 *
    	 * @param event the event
    	 */
    	@FXML
	    void closeSemester(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }


		/* (non-Javadoc)
		 * @see utils.Handler#handle(communication.Message, java.lang.Object)
		 */
		public void handle(Message msg, Object obj) {
			// TODO Auto-generated method stub
			if (msg instanceof OpenSemesterResponse) {
				OpenSemesterResponse res = (OpenSemesterResponse)msg;
				
				localPrompt(res.isSucceeded());
			}
			
		}
		
		/**
		 * Local prompt.
		 *
		 * @param succ the succ
		 */
		public void localPrompt(final boolean succ)  {
			
			Platform.runLater(new Runnable() {
				boolean success = succ;
				public void run() {
					if(success)
						Prompt.alert(1, "the semester added succesfully");	
					else
						Prompt.alert(3, "cannot create semester, check the details again");
				}
			} );
		}
}
