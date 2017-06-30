package controller;

import java.net.URL;
import java.util.ResourceBundle;

import entities.ERequestType;
import entities.Request;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ResponseAddStudentToCourseController implements Initializable
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Request, Integer> userId;

    @FXML
    private TableColumn<Request, Boolean> isConfirmed;

    @FXML
    private TableColumn<Request, Integer> requestNunber;

    @FXML
    private TableColumn<Request, Integer> classNumber;

    @FXML
    private TableColumn<Request, Integer> courseId;

    @FXML
    private TableView<Request> table;

    @FXML
    private TableColumn<Request, Boolean> isHandled;

    @FXML
    
    final ObservableList<Request> data= FXCollections.observableArrayList(
    		new Request(1,22,333,3333,true,true),
    		new Request(2,222,555,66666,true,true));


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
    	requestNunber.setCellValueFactory(new PropertyValueFactory<Request, Integer>("requestNumber"));
    	userId.setCellValueFactory(new PropertyValueFactory<Request, Integer>("userId"));
    	classNumber.setCellValueFactory(new PropertyValueFactory<Request, Integer>("classNumber"));
    	courseId.setCellValueFactory(new PropertyValueFactory<Request, Integer>("courseId"));
    	isConfirmed.setCellValueFactory(new PropertyValueFactory<Request, Boolean>("isConfirmed"));
    	isHandled.setCellValueFactory(new PropertyValueFactory<Request, Boolean>("isHandled"));


    	table.setItems(data);
		
	}
}
