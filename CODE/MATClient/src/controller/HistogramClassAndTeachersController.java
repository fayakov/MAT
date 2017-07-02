
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


public class HistogramClassAndTeachersController implements  Initializable {


	public HistogramClassAndTeachersController(){
	}

//	@FXML
//    private CategoryAxis x;
//
//    @FXML
//    private NumberAxis y;
//
//    @FXML
//    private BarChart<String, Number> TeacherChart;
    
	@FXML
    final CategoryAxis xAxis = new CategoryAxis();
    
	@FXML
	final NumberAxis yAxis = new NumberAxis();
	@FXML
	final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
	}

	public void initData(ArrayList<TeacherWithGrade> arr) {
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
			
			
			
			
			arr.add(new TeacherWithGrade(7, "Sagi"));
			arr.add(new TeacherWithGrade(77, "Sagi4"));
			arr.add(new TeacherWithGrade(90, "Sagi3"));
			arr.add(new TeacherWithGrade(10, "Sagi2"));
			
			
	        bc.setTitle("Country Summary");
	        xAxis.setLabel("Country");       
	        yAxis.setLabel("Value");
	 
	        XYChart.Series series1 = new XYChart.Series();
	        series1.setName("2003");
	        for (TeacherWithGrade teacherWithGrade : arr) {
	        	series1.getData().addAll(new XYChart.Data(teacherWithGrade.getName(), teacherWithGrade.getGrade()));
		        
			}
	                
	        bc.getData().add(series1);
		}
		
	}


