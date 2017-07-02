/*
 * 
 */
package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.Message;
import communication.OpenSemesterRequest;
import communication.OpenSemesterResponse;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class CreateNewSemesterRequestHandler.
 */
public class CreateNewSemesterRequestHandler implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		ConnectionToClient client = (ConnectionToClient) obj;
		OpenSemesterRequest addClassMsg = (OpenSemesterRequest)msg;
		
		
		// TODO Check in database
		CDALError error = new CDALError();
		boolean isSucceeded = CDal.createNewSemester(addClassMsg.getStartDate(), addClassMsg.getEndDate());		
		
		OpenSemesterResponse res = new OpenSemesterResponse(isSucceeded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
