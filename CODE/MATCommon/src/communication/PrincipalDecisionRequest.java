package communication;

import entities.Request;


/**
 * The Class PrincipalDecisionRequest.
 */
public class PrincipalDecisionRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The request. */
	private Request request;
	
	/** The to approve. */
	private boolean toApprove = false;
		
	/**
	 * Instantiates a new principal decision request.
	 *
	 * @param request the request
	 * @param toApprove the to approve
	 */
	public PrincipalDecisionRequest(Request request, boolean toApprove) {
		super();
		this.request = request;
		this.toApprove = toApprove;
	}

	/**
	 * Gets the request.
	 *
	 * @return the request
	 */
	public Request getRequest() {
		return request;
	}

	/**
	 * Sets the request.
	 *
	 * @param request the new request
	 */
	public void setRequest(Request request) {
		this.request = request;
	}

	/**
	 * Checks if is to approve.
	 *
	 * @return true, if is to approve
	 */
	public boolean isToApprove() {
		return toApprove;
	}

	/**
	 * Sets the to approve.
	 *
	 * @param toApprove the new to approve
	 */
	public void setToApprove(boolean toApprove) {
		this.toApprove = toApprove;
	}

	/**
	 * Gets the serialversionuid.
	 *
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
