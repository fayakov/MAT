package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import entities.Request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;


public class ResponseAddStudentToCourseController implements Initializable//, Handler
{
	
	private ArrayList<Request> allRequests;
	
	/*
	 * public ResponseAddStudentToCourseController()
	 
	{
		Dispatcher.addHandler(GetPendingRequestsResponse.class.getCanonicalName(), this);
	}
*/
	
	
	
    @FXML
    private ResourceBundle resources;

    public void initData(ArrayList<Request> allRequests) {
    	data.clear();
		
		for (Request request : allRequests) {
			data.add(request);
		}
	}
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
    void confirm(ActionEvent event) {
    	
    	Prompt.alert(1,"This request is confirmed");
        table.requestFocus();
        table.getSelectionModel().select(0);
        table.getFocusModel().focus(0);

    }

    @FXML
    void decline(ActionEvent event) {
    	
    	Prompt.alert(1,"This request is declined");
        table.requestFocus();
        table.getSelectionModel().select(0);
        table.getFocusModel().focus(0);

    }
    @FXML 
    ObservableList<Request> data= FXCollections.observableArrayList(
    		new Request(1,22,333,5555,true,true),
    		new Request(1,22,333,6666,true,true),
    		new Request(1,22,333,4444,true,true));



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		//GetPendingRequestsRequest pendigreq= new GetPendingRequestsRequest(ERequestType.addStudent);
		//MATClientController.getInstance().sendRequestToServer(pendigreq); 
		
		
		
    	requestNumber.setCellValueFactory(new PropertyValueFactory<Request, Integer>("requestNumber"));
    	userId.setCellValueFactory(new PropertyValueFactory<Request, Integer>("userId"));
    	classNumber.setCellValueFactory(new PropertyValueFactory<Request, Integer>("classNumber"));
    	courseId.setCellValueFactory(new PropertyValueFactory<Request, Integer>("courseId"));

    	table.setItems(data);
		
	}


/*	@Override
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		
		if (msg instanceof GetPendingRequestsResponse) {
			GetPendingRequestsResponse res = (GetPendingRequestsResponse)msg;
	
			ArrayList<Request> requests = res.getPendingRequests();
			for( Request req : requests)
			{
				data =FXCollections.observableArrayList(req);
			
			}	
		
		}
	}
	*/	
	

}
