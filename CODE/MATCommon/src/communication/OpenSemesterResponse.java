package communication;

public class OpenSemesterResponse extends Message {
	
private static final long serialVersionUID = 1L;
	
	private boolean requestSaved;
	private String requestId;	
	private String errText;
	private boolean isSucceeded;
	
	public OpenSemesterResponse(boolean isSucceeded, String errText) {
		super();
		this.isSucceeded = isSucceeded;
		this.errText = errText;
	}

	public String getErrText() {
		return errText;
	}

	public void setErrText(String errText) {
		this.errText = errText;
	}

	public boolean isSucceeded() {
		return isSucceeded;
	}

	public void setSucceeded(boolean isSucceeded) {
		this.isSucceeded = isSucceeded;
	}
	
}
