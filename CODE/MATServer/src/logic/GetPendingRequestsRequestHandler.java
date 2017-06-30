package logic;

import java.io.IOException;
import java.util.ArrayList;

import DAL.CDALError;
import DAL.CDal;
import communication.GetPendingRequestsRequest;
import communication.GetPendingRequestsResponse;
import communication.Message;
import entities.Request;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class GetPendingRequestsRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetPendingRequestsRequest getPendingMsg = (GetPendingRequestsRequest)msg;
			
		// TODO Check in database
		CDALError error = new CDALError();
		ArrayList<Request> requests = new ArrayList<Request>();
		requests = CDal.getRequests(CDal.getCurrentSemester());
		
		GetPendingRequestsResponse res = new GetPendingRequestsResponse(requests);
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
