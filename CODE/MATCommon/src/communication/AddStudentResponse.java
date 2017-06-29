package communication;

public class AddStudentResponse extends Message {

	private static final long serialVersionUID = 1L;
	
	private boolean requestSaved;
	private String requestId;	
	private String errText;
	
	
	public AddStudentResponse(boolean requestSaved, String requestId, String errText) {
		super();
		this.requestSaved = requestSaved;
		this.requestId = requestId;
		this.errText = errText;
	}
	
	
	public boolean isRequestSaved() {
		return requestSaved;
	}
	public void setRequestSaved(boolean requestSaved) {
		this.requestSaved = requestSaved;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getErrText() {
		return errText;
	}
	public void setErrText(String errText) {
		this.errText = errText;
	}
}
