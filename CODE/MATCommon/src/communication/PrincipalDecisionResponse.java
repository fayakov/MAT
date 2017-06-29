package communication;

public class PrincipalDecisionResponse extends Message {

	private static final long serialVersionUID = 1L;
	
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
	}
	public String getErrText() {
		return errText;
	}
	public void setErrText(String errText) {
		this.errText = errText;
	}
}
