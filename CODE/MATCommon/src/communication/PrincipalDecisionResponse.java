package communication;

public class PrincipalDecisionResponse extends Message {

	private static final long serialVersionUID = 1L;
	
<<<<<<< HEAD
	private String pendingDecisionID;
	private boolean principalDecision;
	
	public PrincipalDecisionResponse(String pendingDecisionID, boolean principalDecision) {
		super();
		this.pendingDecisionID = pendingDecisionID;
		this.principalDecision = principalDecision;
	}
	
	public String getPendingDecisionID() {
		return pendingDecisionID;
	}
	public void setPendingDecisionID(String pendingDecisionID) {
		this.pendingDecisionID = pendingDecisionID;
=======
	boolean requestSaved;
	int requestId;	
	private String errText;
	public PrincipalDecisionResponse(boolean requestSaved, int i,
			String errText) {
		super();
		this.requestSaved = requestSaved;
		this.requestId = i;
		this.errText = errText;
	}
	public boolean isRequestSaved() {
		return requestSaved;
	}
	public void setRequestSaved(boolean requestSaved) {
		this.requestSaved = requestSaved;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
>>>>>>> master
	}
	public boolean isPrincipalDecision() {
		return principalDecision;
	}
	public void setPrincipalDecision(boolean principalDecision) {
		this.principalDecision = principalDecision;
	}
}
