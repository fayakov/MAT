package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.BlockParentRequest;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class BlockParentRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		BlockParentRequest AddAssignmentForStudentMsg = (BlockParentRequest)msg;
				
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