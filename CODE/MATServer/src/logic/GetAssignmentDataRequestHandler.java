/*
 * 
 */
package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.GetAssignmentDataRequest;
import communication.GetAssignmentDataResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class GetAssignmentDataRequestHandler.
 */
public class GetAssignmentDataRequestHandler implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetAssignmentDataRequest GetAssignmentDataMsg = (GetAssignmentDataRequest)msg;
		/*
		// TODO Check in database
		CDALError error = new CDALError();
		boolean connectionSecceded = false;//CDal.connectUser(GetAssignmentDataMsg.isToConnect(), GetAssignmentDataMsg.getUserId(), GetAssignmentDataMsg.getPassword(), error);		
		
		GetAssignmentDataResponse res = new GetAssignmentDataResponse(connectionSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
