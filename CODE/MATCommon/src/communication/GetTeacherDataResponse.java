package communication;

import entities.Teacher;

public class GetTeacherDataResponse extends Message {

	private static final long serialVersionUID = 1L;
	
	boolean requestSecceded;
	private String errText;
	Teacher teacherData;
	
	public GetTeacherDataResponse(boolean requestSecceded, String errText,
			Teacher teacherData) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
		this.teacherData = teacherData;
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
	public Teacher getTeacherData() {
		return teacherData;
	}
	public void setTeacherData(Teacher teacherData) {
		this.teacherData = teacherData;
	}
}

