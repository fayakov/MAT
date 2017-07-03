
package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


import entities.TeacherWithGrade;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;


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
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
        	
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
		
		XYChart.Series set1 = new XYChart.Series<>();
		
		for (TeacherWithGrade teacherWithGrade : arr)
			set1.getData().add(new XYChart.Data(teacherWithGrade.getName(), teacherWithGrade.getGrade()));
		
		TeacherChart.getData().addAll(set1);
	}
}