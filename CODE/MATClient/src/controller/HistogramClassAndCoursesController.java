package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import communication.Message;
import entities.TeacherWithGrade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import utils.Handler;

public class HistogramClassAndCoursesController implements Initializable, Handler {
	
	private ArrayList<CourseWithGrade> arrToDisplay;

	
    public ArrayList<CourseWithGrade> getArrToDisplay() {
		return arrToDisplay;
	}

	public void setArrToDisplay(ArrayList<CourseWithGrade> arrToDisplay) {
		this.arrToDisplay = arrToDisplay;
	}
	
	static int count = arrToDisplay.size();
	private int i = 0;
	
	
	@FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;

    @FXML
    private BarChart<?, ?> CourseChart;



	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		
		XYChart<x,y>.Series set1 = new XYChart.Series<>();
		for(int i=0; i<count;i++){
		set1.getData().add(new XYChart.Data)();
		}
		CourseChart.getData().addAll(set1);
		
		
		
		}

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		
		
	}
 
	
	
	
}

