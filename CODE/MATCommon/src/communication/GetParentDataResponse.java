package communication;

import entities.Parent;

public class GetParentDataResponse extends Message {

	private static final long serialVersionUID = 1L;
	
	private boolean requestSecceded;
	private String errText;
	private Parent parent;
	
	public GetParentDataResponse(boolean requestSecceded, String errText, Parent parent) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
		this.parent = parent;
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

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}
}


