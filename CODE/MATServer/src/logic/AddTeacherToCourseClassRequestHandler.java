/*
 * 
 */
package logic;

import java.io.IOException;
import java.util.ArrayList;

import DAL.CDALError;
import DAL.CDal;
import DAL.EDALError;
import communication.AddStudentToClassRequest;
import communication.AddStudentToClassResponse;
import communication.AddTeacherToCourseClassRequest;
import communication.AddTeacherToCourseClassResponse;
import communication.Message;
import entities.*;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class AddTeacherToCourseClassRequestHandler.
 */
public class AddTeacherToCourseClassRequestHandler implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		AddTeacherToCourseClassRequest addTeacherToCourseClassMsg = (AddTeacherToCourseClassRequest)msg;

		CDALError error = new CDALError();
		boolean isSucceeded = false;
		
		// Check if max working hours is valid
		/*
		int currentWorkingHours = 0;
		
		ArrayList<Integer> teacherCourses = CDal.getTeacherCourses(addTeacherToCourseClassMsg.getTeacherId(), CDal.getCurrentSemester());
		for (Integer course : teacherCourses)
		{
			Course courseData = CDal.getCourseData(course.intValue());
			currentWorkingHours += courseData.getDuration();
		}
		
		Course requestedCourseData = CDal.getCourseData(addTeacherToCourseClassMsg.getCourseId());
		Teacher teahcerData = CDal.getTeacherData(addTeacherToCourseClassMsg.getTeacherId());
		if (teahcerData.getMaxHours() < currentWorkingHours + requestedCourseData.getDuration())
		{
			error.serError(EDALError.ETeacherExceedMaxHours);
		}
		else
		{
			isSucceeded = CDal.addTeacherToCourseInClass(addTeacherToCourseClassMsg.getClassId(), addTeacherToCourseClassMsg.getCourseId(), addTeacherToCourseClassMsg.getTeacherId());		
		}
		*/
		int userId = CDal.getTeacherUserId(addTeacherToCourseClassMsg.getTeacherId());
		isSucceeded = CDal.addTeacherToCourseInClass(addTeacherToCourseClassMsg.getClassId(), addTeacherToCourseClassMsg.getCourseId(), userId);	
		
		AddTeacherToCourseClassResponse res = new AddTeacherToCourseClassResponse(isSucceeded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}
