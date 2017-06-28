package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.AddStudentToClassRequest;
import communication.AddStudentToClassResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class AddStudentToClassRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		ConnectionToClient client = (ConnectionToClient) obj;
		AddStudentToClassRequest addClassMsg = (AddStudentToClassRequest)msg;
		
		//System.out.println("User ID:\t" + loginMsg.getUserId());
		//System.out.println("User Password:\t" + loginMsg.getPassword());
		
		// TODO Check in database
		CDALError error = new CDALError();
		boolean isSucceeded = CDal.addStudentToClass(addClassMsg.getStudentId(), addClassMsg.getClassId());		
		
		AddStudentToClassResponse res = new AddStudentToClassResponse(isSucceeded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
