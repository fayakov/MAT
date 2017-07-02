package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.GetStudentDataByUserIDRequest;
import communication.GetStudentDataResponse;
import communication.Message;
import entities.Student;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class GetStudentDataRequestByUserIdHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetStudentDataByUserIDRequest getStudentData = (GetStudentDataByUserIDRequest)msg;
				
		// TODO Check in database
		Student studentData = CDal.getStudentData(getStudentData.getUserId());		
		
		GetStudentDataResponse res = new GetStudentDataResponse(studentData);
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
