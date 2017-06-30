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
		
		/*
		// TODO Check in database
		CDALError error = new CDALError();
		boolean connectionSecceded = false;//CDal.connectUser(getAssignmentsOfStudentMsg.isToConnect(), getAssignmentsOfStudentMsg.getUserId(), getAssignmentsOfStudentMsg.getPassword(), error);		
		
		GetAssignmentsOfStudentResponse res = new GetAssignmentsOfStudentResponse(connectionSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
