/*
 * 
 */
package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.GetTeacherDataRequest;
import communication.GetTeacherDataResponse;
import communication.Message;
import entities.Teacher;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class GetTeacherDataRequestHandler.
 */
public class GetTeacherDataRequestHandler  implements Handler {
	
	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetTeacherDataRequest getTeacherData = (GetTeacherDataRequest)msg;
				
		// TODO Check in database
		CDALError error = new CDALError();
		Teacher teacherData = CDal.getTeacherData(getTeacherData.getTeacherId());		
		
		GetTeacherDataResponse res = new GetTeacherDataResponse(true, error.getString(), teacherData);
		
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
