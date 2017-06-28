package communication;

public class BlockParentResponse extends Message {

	private static final long serialVersionUID = 1L;
	
	boolean requestSecceded;
	private String errText;
	
	
	public BlockParentResponse(boolean requestSecceded, String errText) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
	}


	public boolean isRequestSecceded() {
		return requestSecceded;
	}

	public void setRequestSecceded(boolean requestSecceded) {
		this.requestSecceded = requestSecceded;
	}

	public String getErrText() {
		return errText;
	}

	public void setErrText(String errText) {
		this.errText = errText;
	}
	
	
	
}
