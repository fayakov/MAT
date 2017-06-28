package communication;

public class OpenSemesterResponse extends Message {
	
private static final long serialVersionUID = 1L;
	
	private String errText;
	private String name;
	private boolean isSucceeded;
		
	
	public OpenSemesterResponse(boolean isSucceeded, String errText) {
		super();
		this.isSucceeded = isSucceeded;
		this.errText = errText;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
