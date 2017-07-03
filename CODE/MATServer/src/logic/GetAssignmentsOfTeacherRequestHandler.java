/*
 * 
 */
package logic;

import java.io.IOException;
import java.util.ArrayList;

import DAL.CDALError;
import DAL.CDal;
import communication.GetAssignmentsOfTeacherRequest;
import communication.GetAssignmentsOfTeacherResponse;
import communication.Message;
import entities.SubmissionsForTeacherCheck;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class GetAssignmentsOfTeacherRequestHandler.
 */
public class GetAssignmentsOfTeacherRequestHandler implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetAssignmentsOfTeacherRequest getAssignmentsOfTeacher = (GetAssignmentsOfTeacherRequest)msg;

		ArrayList<Integer> courses = CDal.getTeacherCourses(getAssignmentsOfTeacher.getTeacherID(), CDal.getCurrentSemester());
		
		SubmissionsForTeacherCheck submissions = new SubmissionsForTeacherCheck();
		
		for (Integer course : courses) {
			submissions.mergeSubmissions(CDal.getSubmissionsToCheck(course));
		}
		
		GetAssignmentsOfTeacherResponse res = new GetAssignmentsOfTeacherResponse(submissions);
		
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
