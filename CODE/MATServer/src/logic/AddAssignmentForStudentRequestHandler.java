/*
 * 
 */
package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.AddAssignmentForStudentRequest;
import communication.Message;
import entities.Assignment;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class AddAssignmentForStudentRequestHandler.
 */
public class AddAssignmentForStudentRequestHandler implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		AddAssignmentForStudentRequest addAssignmentForStudentMsg = (AddAssignmentForStudentRequest)msg;
				
		// TODO Check in database
		CDALError error = new CDALError();
		int studentId = CDal.getStudentId(addAssignmentForStudentMsg.getStudentId());		
		Assignment ass = CDal.getAssignment(addAssignmentForStudentMsg.getAssignmentNumber());
		
		CDal.createSubmissionToStudentWithCourse(studentId,
				CDal.getCourseId(ass.getCourseName()),
				ass.getDate(),
				ass.getFileData(),
				ass.getFileName(),
				ass.getAssignmentNumber());
		/*AddAssignmentForStudentResponseMsg res = new AddAssignmentForStudentResponse(connectionSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
