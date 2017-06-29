package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HistogramTeacherAndClassesController {

    @FXML
    private Button btnckose;

    @FXML
    void Close(ActionEvent event) {

	    Stage stage = (Stage) btnckose.getScene().getWindow();
	    stage.close();
    }

}
