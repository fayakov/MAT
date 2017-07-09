package Fixtures.Mat;

import communication.DefineCourseRequest;
import communication.DefineCourseResponse;
import communication.MATClientController;
import communication.Message;
import entities.Course;
import fit.ActionFixture;
import utils.Handler;

public class DefineCourse extends ActionFixture implements Handler {

	Course newCourse;
	boolean isSucceed;
	
	public void startCourse() {
		newCourse = new Course();
	}
	
	public void courseName(String name) {
		newCourse.setCourseName(name);
	}
	
	public void TeachingUnit(int tUnit) {
		newCourse.setTeachingUnit(tUnit);
	}
	
	public void TeachingHours(int hours) {
		newCourse.setDuration(hours);
	}
	
	public void PreCourse(int pre) {
		newCourse.setPreCourses(pre);
	}
	
	public boolean defineCourse() {
		
		//DefineCourseRequest defineCourseReq = new DefineCourseRequest(newCourse);
        //MATClientController.getInstance().sendRequestToServer(defineCourseReq);  
		return true;
	}

	@Override
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		if (msg instanceof DefineCourseResponse) {
			DefineCourseResponse res = (DefineCourseResponse)msg;
			isSucceed = res.actionSucceed();
		}
		
	}
	
	
}
