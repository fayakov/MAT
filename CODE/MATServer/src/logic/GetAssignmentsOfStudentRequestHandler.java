package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.GetAssignmentsOfStudentRequest;
import communication.GetAssignmentsOfStudentResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class GetAssignmentsOfStudentRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetAssignmentsOfStudentRequest getAssignmentsOfStudentMsg = (GetAssignmentsOfStudentRequest)msg;
		
		GetAssignmentsOfStudentResponse res = new GetAssignmentsOfStudentResponse(
				CDal.getStudentAssignments(CDal.getStudentId(getAssignmentsOfStudentMsg.getUserID()))
		);
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
