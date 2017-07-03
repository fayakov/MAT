
package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


import entities.TeacherWithGrade;

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
    
//	/** The x. */
//@FXML
//    final CategoryAxis x = new CategoryAxis();
//    
//	/** The y. */
//	@FXML
//	final NumberAxis y = new NumberAxis();
//	
//	/** The Teacher chart. */
//	@FXML
//	final BarChart<String,Number> TeacherChart = new BarChart<String,Number>(x,y);
	

	
	
    public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/HistogramClassAndTeachers.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
    
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
        	
		XYChart.Series set1 = new XYChart.Series<>();
		set1.getData().add(new XYChart.Data("sapir", 90));
		set1.getData().add(new XYChart.Data("tal", 80));
		set1.getData().add(new XYChart.Data("yaron", 70));
		
		TeacherChart.getData().addAll(set1);
		
	}
	}
	

	/**
	 * Inits the data.
	 *
	 * @param arr the arr
	 */
	//public void initData(ArrayList<TeacherWithGrade> arr) {
		// TODO Auto-generated method stub
	  
		
//			for (TeacherWithGrade temp : arr) {
//				arrToDisplay.add(temp);
//			}
			
//			XYChart<x,y>.Series set1 = new XYChart.Series<>();
//			set1.getData().add(new XYChart.Data(arrToDisplay);
//			
//			
//			XYChart<x,y>.Series set1 = new XYChart.Series<>();
//			for(int i=0; i<count;i++){
//			set1.getData().add(new XYChart.Data)();
//			}
//			Coursehart.getData().addAll(set1);
			
			
//			arr.add(new TeacherWithGrade(7, "Sagi"));
//			arr.add(new TeacherWithGrade(77, "Sagi4"));
//			arr.add(new TeacherWithGrade(90, "Sagi3"));
//			arr.add(new TeacherWithGrade(10, "Sagi2"));
//			
//			
//	        TeacherChart.setTitle("Country Summary");
//	        x.setLabel("Country");       
//	        y.setLabel("Value");
//	 
//	        XYChart.Series series1 = new XYChart.Series();
//	        series1.setName("2003");
//	        for (TeacherWithGrade teacherWithGrade : arr) {
//	        	
//	        	series1.getData().add(new XYChart.Data(teacherWithGrade.getName(), teacherWithGrade.getGrade()));
	        	
	        	
//	        	//series1.getData().addAll(new XYChart.Data(teacherWithGrade.getName(), teacherWithGrade.getGrade()));
//			}			
//	     
//	                
//	     TeacherChart.getData().add(series1);
//		}
//		
	//}


