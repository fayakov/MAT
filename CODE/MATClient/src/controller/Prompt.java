package controller;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 * The Class Prompt.
 */
public class Prompt {
	
	/**
	 * Alert.
	 *
	 * @param type the type
	 * @param msg the msg
	 */
	/*
	 *  1 - Information
	 *  2 - Confirmation
	 *  3 - Eror
	*/		
		public static void alert(int type, String msg) {
		    
	    	Alert alert;
	    	switch(type) {
	    	case 1: alert = new Alert(AlertType.INFORMATION);
	    			break;
	    	case 2: alert = new Alert(AlertType.CONFIRMATION);
	    			break;
	    	case 3: alert = new Alert(AlertType.ERROR);
	    			break;
	    	default: alert = new Alert(AlertType.INFORMATION);
	    			break;
	    	}
	    	alert.setHeaderText(msg);
			alert.show();
	    }
}


