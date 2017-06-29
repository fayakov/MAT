package communication;

public class PrincipalDecisionRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private String pendingDecisionID;

	public PrincipalDecisionRequest(String pendingDecisionID) {
		super();
		this.pendingDecisionID = pendingDecisionID;
	}

	public String getPendingDecisionID() {
		return pendingDecisionID;
	}

	public void setPendingDecisionID(String pendingDecisionID) {
		this.pendingDecisionID = pendingDecisionID;
	}	
}
