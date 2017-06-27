package communication;

public class ChangeTeacherResponse extends Message {

	private static final long serialVersionUID = 1L;
	
	boolean requestSaved;
	String requestId;	
	private String errText;
	
	
	public ChangeTeacherResponse(boolean requestSaved, String requestId,
			String errText) {
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
