package communication;

import entities.CClass;

public class CreateAssignmentResponse extends Message 
{
	boolean requestSecceded;
	private String errText;
	
	
	public CreateAssignmentResponse(boolean requestSecceded, String errText) {
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
