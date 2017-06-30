package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.AddStudentToCourseRequest;
import communication.AddStudentToCourseResponse;
import communication.Message;
import entities.ERequestType;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class AddStudentToCourseRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		AddStudentToCourseRequest addStudentToCourseMsg = (AddStudentToCourseRequest)msg;
					
		CDALError error = new CDALError();
		boolean requestSecceded = CDal.createRequest(ERequestType.addStudent, addStudentToCourseMsg.getCourseId(), addStudentToCourseMsg.getClassNumber(),addStudentToCourseMsg.getCourseId());		
		
		AddStudentToCourseResponse res = new AddStudentToCourseResponse(requestSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
