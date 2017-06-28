package communication;

public class BlockParentResponse {

	private static final long serialVersionUID = 1L;
	
	boolean requestSecceded;
	private Boolean isblocked;
	private String errText;
	
	
	public BlockParentResponse(boolean requestSecceded, Boolean isblocked, String errText) {
		super();
		this.requestSecceded = requestSecceded;
		this.isblocked = isblocked;
		this.errText = errText;
	}


	public boolean isRequestSecceded() {
		return requestSecceded;
	}


	public void setRequestSecceded(boolean requestSecceded) {
		this.requestSecceded = requestSecceded;
	}


	public Boolean getIsblocked() {
		return isblocked;
	}


	public void setIsblocked(Boolean isblocked) {
		this.isblocked = isblocked;
	}


	public String getErrText() {
		return errText;
	}


	public void setErrText(String errText) {
		this.errText = errText;
	}
	
	
	
}
