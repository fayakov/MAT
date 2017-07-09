package Fixtures.Mat;

import controller.DefineCourseController;
import entities.Course;
import fit.ActionFixture;

public class DefineCourse extends ActionFixture {

	//Course newCourse;
	DefineCourseController newCourse;
	boolean isSucceed, flag = false;
	
	public void startCourse() {
		newCourse = new DefineCourseController();
	}
	
	public void courseName(String name) {
		newCourse.newCourseName = name;
	}
	
	public void teachingUnit(int tUnit) {
		newCourse.tUnit = tUnit;
	}
	
	public void teachingHours(int hours) {
		newCourse.teachHours = hours;
	}
	
	public void preCourse(int pre) {
		newCourse.preCourseId = pre;
	}
	
	public boolean defineCourse() {
		
		//DefineCourseRequest defineCourseReq = new DefineCourseRequest(newCourse);
        //MATClientController.getInstance().sendRequestToServer(defineCourseReq);  
		isSucceed = newCourse.sendToDB();
		//while(!flag);
        
		return isSucceed;
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
