/*
 * 
 */
package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.OpenSemesterRequest;
import communication.OpenSemesterResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class OpenSemesterRequestHandler.
 */
public class OpenSemesterRequestHandler implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		OpenSemesterRequest openSemesterRequestMsg = (OpenSemesterRequest)msg;
				
		// TODO Check in database
		CDALError error = new CDALError();
		boolean isSecceded = CDal.createNewSemester(openSemesterRequestMsg.getStartDate(), openSemesterRequestMsg.getEndDate());		
		
		OpenSemesterResponse res = new OpenSemesterResponse(isSecceded, error.getString());
		
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
