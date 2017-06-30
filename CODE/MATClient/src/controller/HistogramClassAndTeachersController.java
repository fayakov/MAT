package controller;

import java.util.ArrayList;

import entities.TeacherWithGrade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HistogramClassAndTeachersController {


	private ArrayList<TeacherWithGrade> arrToDisplay;
	
	
	
    public ArrayList<TeacherWithGrade> getArrToDisplay() {
		return arrToDisplay;
	}

	public void setArrToDisplay(ArrayList<TeacherWithGrade> arrToDisplay) {
		this.arrToDisplay = arrToDisplay;
	}

	@FXML
    private Button closebtn;

    @FXML
    void Close(ActionEvent event) {

	    Stage stage = (Stage) closebtn.getScene().getWindow();
	    stage.close();
    }

}
