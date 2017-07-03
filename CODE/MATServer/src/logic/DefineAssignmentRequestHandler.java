/*
 * 
 */
package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.DefineAssignmentRequest;
import communication.Message;
import entities.Assignment;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class DefineAssignmentRequestHandler.
 */
public class DefineAssignmentRequestHandler implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		DefineAssignmentRequest defineAssignmentRequestMsg = (DefineAssignmentRequest)msg;
				
		// TODO Check in database
		CDALError error = new CDALError();
		int teacherId = CDal.getTeacherId(defineAssignmentRequestMsg.getUserId());		
		CDal.createAssignment(defineAssignmentRequestMsg.getDueDate(), defineAssignmentRequestMsg.getFileData(),
				defineAssignmentRequestMsg.getFileName(), teacherId, defineAssignmentRequestMsg.getCourseId());
		
		/*AddAssignmentForStudentResponseMsg res = new AddAssignmentForStudentResponse(connectionSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
