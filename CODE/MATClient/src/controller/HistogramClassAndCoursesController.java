package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import communication.Dispatcher;
import communication.GetClassTeachersStatsResponse;
import communication.Message;
import entities.CourseWithGrade;
import entities.TeacherWithGrade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import utils.Handler;

/**
 * The Class HistogramClassAndCoursesController.
 */
public class HistogramClassAndCoursesController implements Initializable{
	
	/**
	 * Instantiates a new histogram class and courses controller.
	 */
	public HistogramClassAndCoursesController(){
		//Dispatcher.addHandler(GetClassCoursesStatsResponse.class.getCanonicalName(), this);
	}
	
	
	/** The arr to display. */
	private ArrayList<CourseWithGrade> arrToDisplay;

	
    /**
     * Gets the arr to display.
     *
     * @return the arr to display
     */
    public ArrayList<CourseWithGrade> getArrToDisplay() {
		return arrToDisplay;
	}

	
	/** The x. */
	@FXML
    private CategoryAxis x;

    /** The y. */
    @FXML
    private NumberAxis y;

    /** The Course chart. */
    @FXML
    private BarChart<Number, String> CourseChart;




	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	public void initialize(URL location, ResourceBundle resources){
		// TODO Auto-generated method stub
		
		
		
	}

	/**
	 * Inits the data.
	 *
	 * @param arr the arr
	 */
	
	public void initData(ArrayList<CourseWithGrade> arr){
		// TODO Auto-generated method stub
	 
	       
			XYChart.Series series1 = new XYChart.Series();
	        series1.setName("2003");
	        
	        for (CourseWithGrade coursewithgrade : arr) 
	        	series1.getData().add(new XYChart.Data(coursewithgrade.getName(), coursewithgrade.getGrade()));
	        	        
	     CourseChart.getData().add(series1);
		}
		// TODO Auto-generated method stub

	
	}
		
		


