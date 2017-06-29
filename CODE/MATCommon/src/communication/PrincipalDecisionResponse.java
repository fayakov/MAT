package communication;

public class PrincipalDecisionResponse extends Message {

	private static final long serialVersionUID = 1L;
	
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
	}
	public boolean isPrincipalDecision() {
		return principalDecision;
	}
	public void setPrincipalDecision(boolean principalDecision) {
		this.principalDecision = principalDecision;
	}
}
