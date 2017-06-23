package controller;

import java.util.ArrayList;

import entities.Semester;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class OpenSemesterController {
	
	ArrayList<Semester> semester = new ArrayList<Semester>();
	
		ObservableList<String> list;
		private int year;
		
	
	 	@FXML
	    private TextField textYear;
	 	
	 	@FXML
	    private ComboBox<String> semesterCombo;
	    
	    @FXML
	    private Button btnClose;

	    @FXML
	    void createSemester(ActionEvent event)	{
	    	
	    	if(!textYear.getText().isEmpty())
	    		year = Integer.parseInt(textYear.getText());
	    	// get button value
	    	/*
	    	 * send to server
	    	 * create semester
	    	*/
	    	if(textYear.getText().isEmpty() || semesterCombo.getSelectionModel().isEmpty()) {
	    	Alert alert = new Alert(AlertType.ERROR);
	    	alert.setHeaderText("one or more of the fields is empty");
	    	alert.show();
	    	}
	    	else {
	    		semester.add(new Semester(1, year, semesterCombo.getValue()));
	    		Alert alert = new Alert(AlertType.INFORMATION);
		    	alert.setHeaderText("semester was added succesfully");
		    	alert.show();
	    	}
	    	//System.out.println("semester " + semester.get(0).getSemester() +
	    	//"\n" + semester.get(0).getSemesterYear() + "\n" + semester.get(0).getSemesterNumber());
	    
	    }
	    
	    @FXML
	    void closeSemester(ActionEvent event) {	
		    Stage stage = (Stage) btnClose.getScene().getWindow();
		    stage.close();
	    }
	    
	    @FXML
	    void initialize() {
	    	ArrayList<String> options = new ArrayList<String>();	    	
	    	options.add("A");
	    	options.add("B");
	    	
	    	list = FXCollections.observableArrayList(options);
	    	semesterCombo.setItems(list);   
	    }
	    
}
