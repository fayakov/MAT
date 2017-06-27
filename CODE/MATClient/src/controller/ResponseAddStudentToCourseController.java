package controller;

import java.net.URL;
import java.util.ResourceBundle;
import communication.Dispatcher;
import communication.MATClientController;
import communication.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import utils.Handler;
import entities.ERequestType;
import javafx.fxml.FXML;

public class ResponseAddStudentToCourseController {



	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TableColumn<?, ?> studentId;

	    @FXML
	    private TableColumn<?, ?> requestNumber;

	    @FXML
	    private TableColumn<?, ?> isHandeled;

	    @FXML
	    private TableColumn<?, ?> classNumber;

	    @FXML
	    private TableColumn<?, ?> courseId;

	    @FXML
	    private TableView<?> table;

	    @FXML
	    void initialize() {
	    }
	}


