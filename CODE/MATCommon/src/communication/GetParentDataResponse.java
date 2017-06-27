package communication;

import entities.Student;

public class GetParentDataResponse extends Message {

	private static final long serialVersionUID = 1L;
	
	boolean requestSecceded;
	private String errText;
	Student studentData;
	
	public GetParentDataResponse(boolean requestSecceded, String errText,
			Student studentData) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
		this.studentData = studentData;
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
	public Student getStudentData() {
		return studentData;
	}
	public void setStudentData(Student studentData) {
		this.studentData = studentData;
	}
}

