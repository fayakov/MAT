package communication;

public class AddStudentToCourseResponse extends Message {

	private static final long serialVersionUID = 1L;
	
	private boolean requestSaved;	
	private String errText;
	
	
	public AddStudentToCourseResponse(boolean requestSaved, String errText) {
		super();
		this.requestSaved = requestSaved;
		this.errText = errText;
	}
		
	public boolean isRequestSaved() {
		return requestSaved;
	}
	public void setRequestSaved(boolean requestSaved) {
		this.requestSaved = requestSaved;
	}
	public String getErrText() {
		return errText;
	}
	public void setErrText(String errText) {
		this.errText = errText;
	}
}
