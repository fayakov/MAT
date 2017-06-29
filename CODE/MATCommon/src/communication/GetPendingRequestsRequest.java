package communication;

public class GetPendingRequestsRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private String pendingRequestsType;

	public GetPendingRequestsRequest(String pendingRequestsType) {
		super();
		this.pendingRequestsType = pendingRequestsType;
	}

	public String getPendingRequestsType() {
		return pendingRequestsType;
	}

	public void setPendingRequestsType(String pendingRequestsType) {
		this.pendingRequestsType = pendingRequestsType;
	}	
}
