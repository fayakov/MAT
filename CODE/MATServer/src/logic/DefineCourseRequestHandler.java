/*
 * 
 */
package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.DefineClassResponse;
import communication.DefineCourseRequest;
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
		
		//createCourse(String courseName, int teachingHours, int teachingUnit)
		// TODO Check in database
		CDALError error = new CDALError();
		boolean isSucceeded = CDal.createCourse(addCourseMsg.getCourseName(), addCourseMsg.getTeachingHours(), addCourseMsg.getTeachingUnit());		
		
		DefineClassResponse res = new DefineClassResponse(isSucceeded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
