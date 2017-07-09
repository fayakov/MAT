package Fixtures.Mat;

import java.io.IOException;

import controller.DefineCourseController;
import entities.Course;
import fit.ActionFixture;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import test.SecretaryTest;

public class DefineCourse extends ActionFixture {

	Course newCourse;
	DefineCourseController control;
	boolean isSucceed, flag = false;
	
	public void startCourse() {
		newCourse = new Course();
	}
	
	public void courseName(String name) {
		newCourse.setCourseName(name);
	}
	
	public void teachingUnit(int tUnit) {
		newCourse.setTeachingUnit(tUnit);
	}
	
	public void teachingHours(int hours) {
		newCourse.setDuration(hours);
	}
	
	public void preCourse(int pre) {
		newCourse.setPreCourses(pre);
	}
	
	public boolean defineCourse() throws Exception {
		
		
		return true;
	}
/*
	@Override
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof DefineCourseResponse) {
			DefineCourseResponse res = (DefineCourseResponse)msg;
			isSucceed = res.actionSucceed();
			flag = true;
		}
		
	}
	*/
	
}
