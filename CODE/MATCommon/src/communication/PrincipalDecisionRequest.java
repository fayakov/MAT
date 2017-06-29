package communication;

import entities.Request;

public class PrincipalDecisionRequest extends Message {
	
	private static final long serialVersionUID = 1L;
	
	private Request request;
	private boolean toApprove = false;
		
	public PrincipalDecisionRequest(Request request, boolean toApprove) {
		super();
		this.request = request;
		this.toApprove = toApprove;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public boolean isToApprove() {
		return toApprove;
	}

	public void setToApprove(boolean toApprove) {
		this.toApprove = toApprove;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
