
package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


import entities.TeacherWithGrade;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


/**
 * The Class HistogramClassAndTeachersController.
 */
public class HistogramClassAndTeachersController implements  Initializable {


	/**
	 * Instantiates a new histogram class and teachers controller.
	 */
	public HistogramClassAndTeachersController(){
	}

	@FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;

    @FXML
    private BarChart<String, Number> TeacherChart;
    
	
   // public static ObservableList<TeacherWithGrade> statArg;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
//        	
//		XYChart.Series set1 = new XYChart.Series<>();
//		set1.getData().add(new XYChart.Data("sapir", 90));
//		set1.getData().add(new XYChart.Data("tal", 80));
//		set1.getData().add(new XYChart.Data("yaron", 70));
//		
//		TeacherChart.getData().addAll(set1);
		
	}
	
	/**
	 * Inits the data.
	 *
	 * @param arr the arr
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void initData(ArrayList<TeacherWithGrade> arr) {
		// TODO Auto-generated method stub
	 
	       
			XYChart.Series series1 = new XYChart.Series();
	        series1.setName("2003");
	        
	        for (TeacherWithGrade teacherWithGrade : arr) 
	        	series1.getData().add(new XYChart.Data(teacherWithGrade.getName(), teacherWithGrade.getGrade()));
	        	        
	     TeacherChart.getData().add(series1);
		}
		
	}