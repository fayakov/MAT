
package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ResponseChangeTeacherController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> requestNumber;

    @FXML
    private TableColumn<?, ?> userId;

    @FXML
    private TableColumn<?, ?> classNumber;

    @FXML
    private TableColumn<?, ?> courseId;

    @FXML
    private TableView<?> table;

    @FXML
    void confirm(ActionEvent event) {

    }

    @FXML
    void decline(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }
}
