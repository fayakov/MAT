package communication;

import java.util.ArrayList;

import entities.Request;

public class GetPendingRequestsResponse extends Message {

	private static final long serialVersionUID = 1L;
	
	boolean requestSecceded;
	private String errText;
	ArrayList<Request> pendingRequests;
	
	public GetPendingRequestsResponse(boolean requestSecceded, String errText,
			ArrayList<Request> pendingRequests) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
		this.pendingRequests = pendingRequests;
	}

	public boolean isRequestSecceded() {
		return requestSecceded;
	}

	public void setRequestSecceded(boolean requestSecceded) {
		this.requestSecceded = requestSecceded;
	}

	public String getErrText() {
		return errText;
	}

	public void setErrText(String errText) {
		this.errText = errText;
	}

	public ArrayList<Request> getPendingRequests() {
		return pendingRequests;
	}

	public void setPendingRequests(ArrayList<Request> pendingRequests) {
		this.pendingRequests = pendingRequests;
	}	
}
