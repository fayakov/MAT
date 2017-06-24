package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EvaluationFormController 
{

	 @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TextField textFieldGrade;

	    @FXML
	    private Label labelFinalGrade;

	    @FXML
	    private Label labelStep2;

	    @FXML
	    private TextArea textAreaComment;

	    @FXML
	    private Button buttonSendForm;

	    @FXML
	    private Label labelComment;

	    
	    @FXML
	    void sendEvaluationForm(ActionEvent event) 
	    {
	    	
	    	if(textFieldGrade.getText().isEmpty() || textAreaComment.getText().isEmpty()) 
	    		Prompt.alert(3,"one or more of the fields is empty");
	    	
	    	else { // add 
	    		try {
	    			int grade = Integer.parseInt(textFieldGrade.getText()); //need to save the grade...
	    	    	} catch(NumberFormatException e){
	    	    	Prompt.alert(3,"please enter numerical value");
	    	    	return;
	    	    	}  		
	        	Prompt.alert(1,"Checked file and evaluation form were added successfully ");
	    	}
	    }

	    
	    @FXML
	    void initialize() 
	    {
	    	
	    }
}





   
        

