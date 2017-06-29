package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.DeleteStudentRequest;
import communication.DeleteStudentResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class DeleteStudentRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		DeleteStudentRequest deleteStudentMsg = (DeleteStudentRequest)msg;
					
		CDALError error = new CDALError();
		boolean connectionSecceded = CDal.addDeleteStudentFromCourseRequest(deleteStudentMsg.getCourseId(),deleteStudentMsg.getStudentID(), error);		

		// TODO: get the requestId from DB
		String requestId = "123";
		
		DeleteStudentResponse res = new DeleteStudentResponse(connectionSecceded, requestId, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
