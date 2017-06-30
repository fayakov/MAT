package communication;

import entities.Student;

public class GetStudentDataResponse extends Message 
{
private static final long serialVersionUID = 1L;
	
	private boolean isSucceed;
	private String errText;
	Student studentData;
	
	
	public GetStudentDataResponse(boolean isSucceed, String errText, Student studentData) {
		super();
		this.isSucceed = isSucceed;
		this.errText = errText;
		this.studentData = studentData;
	}
	
	public boolean isSucceed() {
		return isSucceed;
	}
	public void setSucceed(boolean isSucceed) {
		this.isSucceed = isSucceed;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

