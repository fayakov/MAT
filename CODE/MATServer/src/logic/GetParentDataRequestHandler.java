package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.GetParentDataRequest;
import communication.GetParentDataResponse;
import communication.GetTeacherDataRequest;
import communication.GetTeacherDataResponse;
import communication.Message;
import entities.Parent;
import entities.Teacher;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class GetParentDataRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetParentDataRequest getParentData = (GetParentDataRequest)msg;
				
		// TODO Check in database
		CDALError error = new CDALError();
		Parent parentData = null;
		
		boolean requestSecceded = CDal.getParentData(getParentData.getParentId(), parentData, error);		
		
		GetParentDataResponse res = new GetParentDataResponse(requestSecceded, error.getString(), parentData);
		
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
