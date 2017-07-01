
package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetClassTeachersStatsResponse;
import communication.GetStudentDataResponse;
import communication.LoginResponseMsg;
import communication.Message;
import entities.TeacherWithGrade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import utils.Handler;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;


public class HistogramClassAndTeachersController implements  Initializable, Handler {


	public HistogramClassAndTeachersController(){
		Dispatcher.addHandler(GetClassTeachersStatsResponse.class.getCanonicalName(), this);
	}
	
	private ArrayList<TeacherWithGrade> arrToDisplay;
	static int count = arrToDisplay.size();
	private int i = 0;
	
    public ArrayList<TeacherWithGrade> getArrToDisplay() {
		return arrToDisplay;
	}

	public void setArrToDisplay(ArrayList<TeacherWithGrade> arrToDisplay) {
		this.arrToDisplay = arrToDisplay;
	}

	@FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;

    @FXML
    private BarChart<?, ?> TeacherChart;


	@Override
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		//if (msg instanceof GetClassTeachersStatsResponse) {
			//GetClassTeachersStatsResponse res = (GetClassTeachersStatsResponse)msg;
			//ArrayList<TeacherWithGrade> arr = res.getStats();
		
		XYChart<x,y>.Series set1 = new XYChart.Series<>();
		for(int i=0; i<count;i++){
		set1.getData().add(new XYChart.Data)();
		}
		Coursehart.getData().addAll(set1);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		XYChart<x,y>.Series set1 = new XYChart.Series<>();
		set1.getData().add(new XYChart.Data(arrToDisplay);
		
	}

}
