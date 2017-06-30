package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.GetTeacherStatsRequest;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class GetTeacherStatsRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetTeacherStatsRequest getTeacherStatsRequestMsg = (GetTeacherStatsRequest)msg;
				
		// TODO Check in database
		CDALError error = new CDALError();
		/*boolean connectionSecceded = false; //CDal.connectUser(AddAssignmentForStudentMsg.isToConnect(), AddAssignmentForStudentMsg.getUserId(), AddAssignmentForStudentMsg.getPassword(), error);		
		
		AddAssignmentForStudentResponseMsg res = new AddAssignmentForStudentResponse(connectionSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
