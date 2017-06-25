package controller;



import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class PrincipalController {

	ObservableList<String> list ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    
    @FXML
    private ComboBox<String> principalComboBox;
    
    @FXML
    private Button btnClose;

 
  
    void statistics() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/StatisticsData.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    void ShowStudentData() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/SearchStudent.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    void BlockParent() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/BlockParent.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
	
	
	
    void request() throws Exception {
    	
    	Pane root = FXMLLoader.load(getClass().getResource("/gui/RequestPrincipal.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    
    
    public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/PrincipalMenu.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
    
    
    @FXML
    public void send(ActionEvent event) throws Exception {
    	
    	String option = principalComboBox.getValue().toString();
    	if(option.equalsIgnoreCase("Get Statistics"))
    		statistics();	
    	if(option.equalsIgnoreCase("Show Student Data"))
    		ShowStudentData();
    	if(option.equalsIgnoreCase("Block Parent"))
    		BlockParent();
	if(option.equalsIgnoreCase("Request"))
    		request();
    }
    
    @FXML
    void close(ActionEvent event) {	
	    Stage stage = (Stage) btnClose.getScene().getWindow();
	    stage.close();
    }
    
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
