package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import communication.Dispatcher;
import communication.GetClassTeachersStatsResponse;
import communication.Message;
import entities.ClassWithGrade;
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
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;

/**
 * The Class HistogramTeacherAndClassesController.
 */
public class HistogramTeacherAndClassesController implements  Initializable, Handler{
	
	/**
	 * Instantiates a new histogram teacher and classes controller.
	 */
	public HistogramTeacherAndClassesController(){
	//	Dispatcher.addHandler(GetClassTeachersStatsResponse.class.getCanonicalName(), this);
	}
	
	
	
	 /** The Class chart. */
 	@FXML
	 private BarChart<String, Number> ClassChart;
	
	/** The x. */
	@FXML
    private CategoryAxis x;

    /** The y. */
    @FXML
    private NumberAxis y;
    
	/** The arr to display. */
	private ArrayList<ClassWithGrade> arrToDisplay;

	
    /**
     * Gets the arr to display.
     *
     * @return the arr to display
     */
    public ArrayList<ClassWithGrade> getArrToDisplay() {
		return arrToDisplay;
	}

	/**
	 * Sets the arr to display.
	 *
	 * @param arrToDisplay the new arr to display
	 */
	public void setArrToDisplay(ArrayList<ClassWithGrade> arrToDisplay) {
		this.arrToDisplay = arrToDisplay;
	}
	
	//static int count = arrToDisplay.size();
	//private int i = 0;
	
	
	
	
	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	@Override
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		
		
		
		//XYChart<x,y>.Series set1 = new XYChart.Series<>();
		//for(int i=0; i<count;i++){
	//	set1.getData().add(new XYChart.Data)();
		}
		
	//CourseChart.getData().addAll(set1);
		

	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		 
		
		ClassWithGrade c1 = new ClassWithGrade(7, "a1");
		ClassWithGrade c2 = new ClassWithGrade(77, "a3");
		ClassWithGrade c3 = new ClassWithGrade(26, "a4");
		ClassWithGrade c4 = new ClassWithGrade(19, "a5");
		
		arrToDisplay.add(c1);
		arrToDisplay.add(c2);
		arrToDisplay.add(c3);
		arrToDisplay.add(c4);
		
		XYChart.Series<String, Number> set1 = new XYChart.Series<>();
		
		
		for (ClassWithGrade classWithGrade : arrToDisplay) {
			set1.getData().add(new XYChart.Data(classWithGrade.getName(), classWithGrade.getGrade()));
		}
		
	//set1.getData().add(new XYChart.Data(arrToDisplay.get(58),arrToDisplay.getClass()));
	//	set1.getData().add(new XYChart.Data(arrToDisplay.get(28),arrToDisplay.getClass()));
		
		
		ClassChart.getData().add(set1);
	}
}
