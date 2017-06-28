package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.AddStudentToClassRequest;
import communication.AddStudentToClassResponse;
import communication.AddTeacherToCourseClassRequest;
import communication.AddTeacherToCourseClassResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class AddTeacherToCourseClassRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		// TODO Auto-generated method stub
		ConnectionToClient client = (ConnectionToClient) obj;
		AddTeacherToCourseClassRequest addClassMsg = (AddTeacherToCourseClassRequest)msg;
		
		
		// TODO Check in database
		CDALError error = new CDALError();
		boolean isSucceeded = CDal.addTeacherToCourseInClass(addClassMsg.getClassId(), addClassMsg.getCourseId(), addClassMsg.getTeacherId());		
		
		AddTeacherToCourseClassResponse res = new AddTeacherToCourseClassResponse(isSucceeded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}
