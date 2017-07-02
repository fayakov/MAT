/*
 * 
 */
package logic;

import java.io.IOException;

import DAL.CDal;
import communication.GetStudentDataByStudentIDRequest;
import communication.GetStudentDataResponse;
import communication.Message;
import entities.Student;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class GetStudentDataRequestByStudentIdHandler.
 */
public class GetStudentDataRequestByStudentIdHandler implements Handler {
	
	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetStudentDataByStudentIDRequest getStudentData = (GetStudentDataByStudentIDRequest)msg;
				
		int userId = CDal.getStudentUserId(getStudentData.getStudentId());
				
		Student studentData = CDal.getStudentData(userId);		
		
		GetStudentDataResponse res = new GetStudentDataResponse(studentData);
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
