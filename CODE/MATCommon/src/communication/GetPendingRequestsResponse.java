package communication;

import java.util.ArrayList;

import entities.Request;


/**
 * The Class GetPendingRequestsResponse.
 */
public class GetPendingRequestsResponse extends Message {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The pending requests. */
	ArrayList<Request> pendingRequests;
	
	/**
	 * Instantiates a new gets the pending requests response.
	 *
	 * @param pendingRequests the pending requests
	 */
	public GetPendingRequestsResponse(ArrayList<Request> pendingRequests) {
		super();
		this.pendingRequests = pendingRequests;
	}

	/**
	 * Gets the pending requests.
	 *
	 * @return the pending requests
	 */
	public ArrayList<Request> getPendingRequests() {
		return pendingRequests;
	}

	/**
	 * Sets the pending requests.
	 *
	 * @param pendingRequests the new pending requests
	 */
	public void setPendingRequests(ArrayList<Request> pendingRequests) {
		this.pendingRequests = pendingRequests;
	}	
}
