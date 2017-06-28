package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.AddStudentRequest;
import communication.AddStudentResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class AddStudentRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		AddStudentRequest addStudentMsg = (AddStudentRequest)msg;
					
		CDALError error = new CDALError();
		boolean connectionSecceded = CDal.addStudentToCourse(addStudentMsg.getCourseId(),addStudentMsg.getStudentID(), error);		

		// TODO: get the requestId from DB
		String requestId = "123";
		
		AddStudentResponse res = new AddStudentResponse(connectionSecceded, requestId, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
