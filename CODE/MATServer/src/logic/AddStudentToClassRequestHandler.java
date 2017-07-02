/*
 * 
 */
package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.AddStudentToClassRequest;
import communication.AddStudentToClassResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class AddStudentToClassRequestHandler.
 */
public class AddStudentToClassRequestHandler implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {

		ConnectionToClient client = (ConnectionToClient) obj;
		AddStudentToClassRequest addClassMsg = (AddStudentToClassRequest)msg;
		
		CDALError error = new CDALError();
		boolean isSucceeded = CDal.addStudentToClass(addClassMsg.getClassId(), addClassMsg.getStudentId());		
		
		AddStudentToClassResponse res = new AddStudentToClassResponse(isSucceeded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
