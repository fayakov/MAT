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
		boolean requestSecceded = CDal.getPendingRequests(requests, error);		
		
		GetPendingRequestsResponse res = new GetPendingRequestsResponse(requestSecceded, error.getString(), requests);
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
