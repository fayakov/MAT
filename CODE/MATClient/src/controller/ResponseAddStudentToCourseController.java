package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import communication.AddStudentToCourseResponse;
import communication.DeleteStudentFromCourseRequest;
import communication.DeleteStudentFromCourseResponse;
import communication.Dispatcher;
import communication.GetPendingRequestsRequest;
import communication.GetPendingRequestsResponse;
import entities.Request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import communication.MATClientController;
import communication.Message;
import entities.ERequestType;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.Handler;

public class ResponseAddStudentToCourseController implements Initializable, Handler{
	
	
	
	public ResponseAddStudentToCourseController()
	{
		Dispatcher.addHandler(GetPendingRequestsResponse.class.getCanonicalName(), this);
	}

	//public ERequestType requestType;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Request, Integer> userId;

    @FXML
    private TableColumn<Request, Boolean> isConfirmed;

    @FXML
    private TableColumn<Request, Integer> requestNumber;

    @FXML
    private TableColumn<Request, Integer> classNumber;

    @FXML
    private TableColumn<Request, Integer> courseId;

    @FXML
    private TableView<Request> table;

    @FXML
    private TableColumn<Request, Boolean> isHandled;

    @FXML 
    ObservableList<Request> data= FXCollections.observableArrayList(
    		new Request(1,22,333,3333,true,true),
    		new Request(2,222,555,66666,true,true));

    ArrayList<Request> data1 = new ArrayList<Request>();
 
    @FXML
    void confirm(ActionEvent event) {

    }

    @FXML
    void decline(ActionEvent event) {

    }
    

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		GetPendingRequestsRequest pendigreq= new GetPendingRequestsRequest(ERequestType.addStudent);
		MATClientController.getInstance().sendRequestToServer(pendigreq); 
		
    	requestNumber.setCellValueFactory(new PropertyValueFactory<Request, Integer>("requestNumber"));
    	userId.setCellValueFactory(new PropertyValueFactory<Request, Integer>("userId"));
    	classNumber.setCellValueFactory(new PropertyValueFactory<Request, Integer>("classNumber"));
    	courseId.setCellValueFactory(new PropertyValueFactory<Request, Integer>("courseId"));
    	isConfirmed.setCellValueFactory(new PropertyValueFactory<Request, Boolean>("isConfirmed"));
    	isHandled.setCellValueFactory(new PropertyValueFactory<Request, Boolean>("isHandled"));
        

    	table.setItems(data);
		
	}





	@SuppressWarnings("unchecked")
	@Override
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		

		/// להמשיך את הפונקציה 
		if (msg instanceof GetPendingRequestsResponse) {
			GetPendingRequestsResponse res = (GetPendingRequestsResponse)msg;
			
			int len =res.getPendingRequests().size();
			for (int i = 0; i< len; i++)
			{
				data1 = (res.getPendingRequests().get(i).getRequestNumber(),res.getPendingRequests().get(i).getUserId(),res.getPendingRequests().get(i).getClassNumber(),
						res.getPendingRequests().get(i).getCourseId(),res.getPendingRequests().get(i).isConfirmed(),res.getPendingRequests().get(i).isHandeled(),data.set(i, ERequestType.addStudent));
				
			}
			
		
		}
	}
		
	

}
