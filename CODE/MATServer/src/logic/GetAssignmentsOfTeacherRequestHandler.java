package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.GetAssignmentsOfTeacherRequest;
import communication.GetAssignmentsOfTeacherResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class GetAssignmentsOfTeacherRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetAssignmentsOfTeacherRequest getAssignmentsOfTeacher = (GetAssignmentsOfTeacherRequest)msg;

		/*
		// TODO Check in database
		CDALError error = new CDALError();
		boolean connectionSecceded = false;//CDal.connectUser(getAssignmentsOfTeacher.isToConnect(), getAssignmentsOfTeacher.getUserId(), getAssignmentsOfTeacher.getPassword(), error);		
		
		GetAssignmentsOfTeacherResponse res = new GetAssignmentsOfTeacherResponse(connectionSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
