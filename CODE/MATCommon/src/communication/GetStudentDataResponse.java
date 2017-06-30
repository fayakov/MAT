package communication;

import entities.Student;

public class GetStudentDataResponse extends Message 
{

	private static final long serialVersionUID = 1L;
	
	private String errText;
	Student studentData;
	
	public GetStudentDataResponse(Student studentData, String errText) {
		super();
		this.errText = errText;
		this.studentData = studentData;
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

