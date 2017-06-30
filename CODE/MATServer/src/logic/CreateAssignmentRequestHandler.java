package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.CreateAssignmentRequest;
import communication.CreateAssignmentResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class CreateAssignmentRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		CreateAssignmentRequest CreateAssignmentMsg = (CreateAssignmentRequest)msg;
		/*		
		// TODO Check in database
		CDALError error = new CDALError();
		boolean connectionSecceded = false;//CDal.connectUser(CreateAssignmentMsg.isToConnect(), CreateAssignmentMsg.getUserId(), CreateAssignmentMsg.getPassword(), error);		
		
		CreateAssignmentResponseMsg res = new CreateAssignmentResponse(connectionSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
