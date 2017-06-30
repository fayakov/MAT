package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.GetStudentDataRequest;
import communication.GetStudentDataResponse;
import communication.Message;
import entities.Student;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class GetStudentDataRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetStudentDataRequest getStudentData = (GetStudentDataRequest)msg;
				
		// TODO Check in database
		CDALError error = new CDALError();
		Student studentData = CDal.getStudentData(getStudentData.getUserId(), error);		
		
		GetStudentDataResponse res = new GetStudentDataResponse(studentData, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
