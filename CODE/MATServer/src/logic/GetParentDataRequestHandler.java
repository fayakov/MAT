package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.GetParentDataRequest;
import communication.GetParentDataResponse;
import communication.Message;
import entities.Parent;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class GetParentDataRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetParentDataRequest getParentData = (GetParentDataRequest)msg;
		
		CDALError error = new CDALError();
		Parent parentData = CDal.getParentData(getParentData.getParentId(), error);		
		
		GetParentDataResponse res = new GetParentDataResponse(parentData, error.getString());
		
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
