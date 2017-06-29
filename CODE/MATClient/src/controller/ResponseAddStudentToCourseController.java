
package controller;

import java.net.URL;
import java.util.ResourceBundle;

import entities.Table;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ResponseAddStudentToCourseController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    
    @FXML
    private TableView<Table> table;
    
    @FXML
    private TableColumn<Table, Integer> requestNunber;
    
    
    @FXML
    private TableColumn<Table, Integer> studentId;



    @FXML
    private TableColumn<Table, Integer> classNumber;

    
    @FXML
    private TableColumn<Table, Integer> courseId;


    @FXML
    private TableColumn<Table, Boolean> isHandled;
    
    @FXML
    private TableColumn<Table, Boolean> isConfirmed;

    
    final ObservableList<Table> data = FXCollections.observableArrayList(
    		new Table(1,123,22,333,true,true));
    
    @FXML
    void initialize() {
    	
    	requestNunber.setCellValueFactory(new PropertyValueFactory<Table,Integer>("requestNunber"));
    	studentId.setCellValueFactory(new PropertyValueFactory<Table,Integer>("studentId"));
    	classNumber.setCellValueFactory(new PropertyValueFactory<Table,Integer>("classNumber"));
    	courseId.setCellValueFactory(new PropertyValueFactory<Table,Integer>("courseId"));
    	isHandled.setCellValueFactory(new PropertyValueFactory<Table,Boolean>("isHandled"));
    	isConfirmed.setCellValueFactory(new PropertyValueFactory<Table,Boolean>("isConfirmed"));

    	new Table(1,123,22,333,true,true);
    	table.setItems(data);


    }
}

