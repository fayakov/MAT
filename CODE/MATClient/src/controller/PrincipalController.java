package controller;



import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * The Class PrincipalController.
 */
public class PrincipalController {

	/** The list. */
	ObservableList<String> list ;
	
	/** The option. */
	String option;

    /** The resources. */
    @FXML
    private ResourceBundle resources;

    /** The location. */
    @FXML
    private URL location;

    
    /** The principal combo box. */
    @FXML
    private ComboBox<String> principalComboBox;
    
    /** The btn close. */
    @FXML
    private Button btnClose;

 
  
    /**
     * Statistics.
     *
     * @throws Exception the exception
     */
    void statistics() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/StatisticsData.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    /**
     * Show student data.
     *
     * @throws Exception the exception
     */
    void ShowStudentData() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/SearchStudent.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    /**
     * Block parent.
     *
     * @throws Exception the exception
     */
    void BlockParent() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/BlockParent.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
	
	
	
    /**
     * Request.
     *
     * @throws Exception the exception
     */
    void request() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/RequestPrincipal.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    
    /**
     * Start.
     *
     * @param primaryStage the primary stage
     * @throws Exception the exception
     */
    public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/PrincipalMenu.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
    
    
    /**
     * Send.
     *
     * @param event the event
     * @throws Exception the exception
     */
    @FXML
    public void send(ActionEvent event) throws Exception {
    	
    	try{
    	
    		option = principalComboBox.getValue().toString(); }
    	catch(Exception e){
    		Prompt.alert(3, "please choose option");
    	}
    	
    	if(option.equalsIgnoreCase("Get Statistics"))
    		statistics();	
    	if(option.equalsIgnoreCase("Show Student Data"))
    		ShowStudentData();
    	if(option.equalsIgnoreCase("Block Parent"))
    		BlockParent();
    	if(option.equalsIgnoreCase("Request"))
    		request();
    	//if(principalComboBox.getValue().isEmpty())		
    }
    
    /**
     * Close.
     *
     * @param event the event
     */
    @FXML
    void close(ActionEvent event) {	
	    Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();
    }
    
    /**
     * Initialize.
     */
    @FXML
    void initialize() {
    	ArrayList<String> options = new ArrayList<String>();
    	
    	options.add("Get Statistics");
      	options.add("Show Student Data"); 
      	options.add("Block Parent"); 
      	options.add("Request");
		
		list = FXCollections.observableArrayList(options);
		principalComboBox.setItems(list);
	}	

    
}
