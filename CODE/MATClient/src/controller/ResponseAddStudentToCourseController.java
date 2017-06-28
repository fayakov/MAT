
package controller;

import java.net.URL;
import java.util.ResourceBundle;

import entities.Table;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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

    final ObservableList<Table> data = FXCollections.observableArrayList();
    
    @FXML
    void initialize() {

    }
}

