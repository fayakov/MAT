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
public class HistogramClassAndCoursesController implements Initializable{
	
	/**
	 * Instantiates a new histogram class and courses controller.
	 */
	public HistogramClassAndCoursesController(){
	}
	
<<<<<<< HEAD
=======
	
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

	
>>>>>>> f732568c13c052f98afbf853ee2c29183798f80e
	/** The x. */
	@FXML
    private CategoryAxis x;

    /** The y. */
    @FXML
    private NumberAxis y;

    /** The Course chart. */
    @FXML
<<<<<<< HEAD

    private BarChart<String, Number> CourseChart;
=======
    private BarChart<Number, String> CourseChart;



>>>>>>> f732568c13c052f98afbf853ee2c29183798f80e

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
<<<<<<< HEAD
	public void initData(ArrayList<CourseWithGrade> arr) {
		// TODO Auto-generated method stub
		XYChart.Series set1 = new XYChart.Series<>();
		
		for (CourseWithGrade courseWithGrade : arr)
			set1.getData().add(new XYChart.Data(courseWithGrade.getName(), courseWithGrade.getGrade()));
		
		CourseChart.getData().addAll(set1);
		
	}
}
=======
	
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
		
		


>>>>>>> f732568c13c052f98afbf853ee2c29183798f80e
