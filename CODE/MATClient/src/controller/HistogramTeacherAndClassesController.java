package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import entities.ClassWithGrade;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * The Class HistogramTeacherAndClassesController.
 */
public class HistogramTeacherAndClassesController implements  Initializable{
	
	/**
	 * Instantiates a new histogram teacher and classes controller.
	 */
	public HistogramTeacherAndClassesController(){
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
    
	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */

	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Inits the data.
	 *
	 * @param arr the arr
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void initData(ArrayList<ClassWithGrade> arr) {
		
		XYChart.Series set1 = new XYChart.Series<>();
		
		for (ClassWithGrade classWithGrade : arr)
			set1.getData().add(new XYChart.Data(classWithGrade.getName(), classWithGrade.getGrade()));
		
		ClassChart.getData().addAll(set1);
	}
}
