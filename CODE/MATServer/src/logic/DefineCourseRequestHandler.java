/*
 * 
 */
package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.DefineCourseRequest;
import communication.DefineCourseResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class DefineCourseRequestHandler.
 */
public class DefineCourseRequestHandler implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		ConnectionToClient client = (ConnectionToClient) obj;
		DefineCourseRequest addCourseMsg = (DefineCourseRequest)msg;
		
		// TODO Check in database
		CDALError error = new CDALError();
		boolean isSucceeded = CDal.createCourse(addCourseMsg.getCourseName(), addCourseMsg.getTeachingUnit(), addCourseMsg.getTeachingHours(), addCourseMsg.getPreCourse());		
		
		boolean isSucceeded2 = CDal.addPrevCourseToCourse(CDal.getCourseId(addCourseMsg.getCourseName()), addCourseMsg.getPreCourse());
		
		DefineCourseResponse res = new DefineCourseResponse(isSucceeded && isSucceeded2, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
