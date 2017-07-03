package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import entities.CourseWithGrade;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * The Class HistogramClassAndCoursesController.
 */
public class HistogramClassAndCoursesController implements Initializable {
	
	/**
	 * Instantiates a new histogram class and courses controller.
	 */
	public HistogramClassAndCoursesController(){
	}
	
	/** The i. */
	private int i = 0;
		
	/** The x. */
	@FXML
    private CategoryAxis x;

    /** The y. */
    @FXML
    private NumberAxis y;

    /** The Course chart. */
    @FXML
    private BarChart<String, Number> CourseChart;

	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}

	/**
	 * Inits the data.
	 *
	 * @param arr the arr
	 */
	public void initData(ArrayList<CourseWithGrade> arr) {
		// TODO Auto-generated method stub
		XYChart.Series set1 = new XYChart.Series<>();
		
		for (CourseWithGrade courseWithGrade : arr)
			set1.getData().add(new XYChart.Data(courseWithGrade.getName(), courseWithGrade.getGrade()));
		
		CourseChart.getData().addAll(set1);
		
	}
}

