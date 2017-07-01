package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import communication.GetPendingRequestsResponse;
import communication.MATClientController;
import communication.Message;
import communication.PrincipalDecisionRequest;
import entities.Request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import utils.Handler;

public class ResponseRemoveStudentFromCourseController implements Initializable, Handler{

	private ArrayList<Request> allRequests;
	
	
    public void initData(ArrayList<Request> allRequests) {
    	data.clear();
		
		for (Request request : allRequests) {
			data.add(request);
		}
	}


        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TableColumn<Request, Integer> userId;


        @FXML
        private TableColumn<Request, Integer> requestNumber;

        @FXML
        private TableColumn<Request, Integer> classNumber;

        @FXML
        private TableColumn<Request, Integer> courseId;

        @FXML
        private TableView<Request> table;

        @FXML
        private Button btnDecline;


        @FXML
        private Button btnConfirm;
        
        
        @FXML 
        ObservableList<Request> data= FXCollections.observableArrayList();
        		

        @FXML
        void confirm(ActionEvent event) {
        	
        	Request req = table.getSelectionModel().getSelectedItem();
        	PrincipalDecisionRequest msg = new PrincipalDecisionRequest(req, true);
        	
        	MATClientController.getInstance().sendRequestToServer(msg);
        	
        	data.remove(req);
        
        }

        @FXML
        void decline(ActionEvent event) {
        	
        	Request req = table.getSelectionModel().getSelectedItem();
        	PrincipalDecisionRequest msg = new PrincipalDecisionRequest(req, false);
        	
        	MATClientController.getInstance().sendRequestToServer(msg);
        	    	
        	data.remove(req);
        }


    	@Override
    	public void handle(Message msg, Object obj) {
    		// TODO Auto-generated method stub
    		
    		if (msg instanceof GetPendingRequestsResponse) {
    		
    		}
    	}	
    	

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
		
	    	requestNumber.setCellValueFactory(new PropertyValueFactory<Request, Integer>("requestNumber"));
	    	userId.setCellValueFactory(new PropertyValueFactory<Request, Integer>("userId"));
	    	classNumber.setCellValueFactory(new PropertyValueFactory<Request, Integer>("classNumber"));
	    	courseId.setCellValueFactory(new PropertyValueFactory<Request, Integer>("courseId"));

	    	table.setItems(data);
			
		}
    }
