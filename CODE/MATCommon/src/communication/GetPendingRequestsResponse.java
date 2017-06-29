package communication;

import java.util.ArrayList;

import entities.Request;

public class GetPendingRequestsResponse extends Message {

	private static final long serialVersionUID = 1L;
	
	ArrayList<Request> pendingRequests;
	
	public GetPendingRequestsResponse(ArrayList<Request> pendingRequests) {
		super();
		this.pendingRequests = pendingRequests;
	}

	public ArrayList<Request> getPendingRequests() {
		return pendingRequests;
	}

	public void setPendingRequests(ArrayList<Request> pendingRequests) {
		this.pendingRequests = pendingRequests;
	}	
}
