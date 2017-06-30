package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.GetAssignmentOfStudentRequest;
import communication.GetAssignmentOfStudentResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class GetAssignmentOfStudentRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetAssignmentOfStudentRequest getAssignmentOfStudent = (GetAssignmentOfStudentRequest)msg;
		
		/*
		// TODO Check in database
		CDALError error = new CDALError();
		boolean connectionSecceded = false;//CDal.connectUser(GetAssignmentOfStudentMsg.isToConnect(), GetAssignmentOfStudentMsg.getUserId(), GetAssignmentOfStudentMsg.getPassword(), error);		
		
		GetAssignmentOfStudentResponse res = new GetAssignmentOfStudentResponse(connectionSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
