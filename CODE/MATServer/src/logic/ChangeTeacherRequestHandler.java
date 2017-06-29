package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.ChangeTeacherRequest;
import communication.ChangeTeacherResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class ChangeTeacherRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		ChangeTeacherRequest changeTeacherMsg = (ChangeTeacherRequest)msg;
					
		CDALError error = new CDALError();
		boolean connectionSecceded = CDal.addChangeTeacherRequest(changeTeacherMsg.getRequest(), error);		

		// TODO: get the requestId from DB
		String requestId = "123";
		
		ChangeTeacherResponse res = new ChangeTeacherResponse(connectionSecceded, requestId, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
