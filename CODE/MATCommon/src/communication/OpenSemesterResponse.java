package communication;

public class OpenSemesterResponse extends Message {
	
private static final long serialVersionUID = 1L;
	
	private boolean requestSaved;
	private String requestId;	
	private String errText;
	private boolean isSucceeded;
	private int SemesterID;
	
	public OpenSemesterResponse(boolean requestSaved, String requestId,
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
	public boolean actionSucceed() {
		return isSucceeded;
	}
	public int semesterID() {
		return SemesterID;
	}

}
