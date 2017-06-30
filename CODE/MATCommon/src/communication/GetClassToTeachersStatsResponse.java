package communication;

import entities.CClass;

public class GetClassToTeachersStatsResponse extends Message {

	private static final long serialVersionUID = 1L;
	
	boolean requestSecceded;
	private String errText;
	CClass classData;
	
	public GetClassToTeachersStatsResponse(boolean requestSecceded, String errText,
			CClass classData) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
		this.classData = classData;
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
	public CClass getclassData() {
		return classData;
	}
	public void setclassData(CClass classData) {
		this.classData = classData;
	}
}

