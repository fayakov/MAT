package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CheckAssignmentController 
{

	 @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private Label labelSubNum;

	    @FXML
	    private Button buttonDownload;

	    @FXML
	    private Label labelStep1;

	    @FXML
	    private Label labelUpload;

	    @FXML
	    private Button buttonNext;

	    @FXML
	    private Label labelDownload;

	    @FXML
	    private Label labelCheckAss;

	    @FXML
	    private TextField textFieldSubNum;

	    @FXML
	    private Button buttonApload;

	    
	    @FXML
	    void downloadSubmission(ActionEvent event) 
	    {

	    }

	    @FXML
	    void uploadSubmission(ActionEvent event) 
	    {

	    }

	    @FXML
	    void nextToStep2(ActionEvent event) throws Exception 
	    {
	    	Pane root = FXMLLoader.load(getClass().getResource("/gui/EvaluationForm.fxml"));
			Scene scene = new Scene(root);
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.show();
	    }

	    
	    @FXML
	    void initialize() 
	    {
	        
	    }

}






   






    


