package communication;

import entities.Student;

public class GetStudentDataResponse extends Message 
{

	private static final long serialVersionUID = 1L;
	
	Student studentData;
	
	public GetStudentDataResponse(Student studentData) {
		super();
		this.studentData = studentData;
	}
	
	public Student getStudentData() {
		return studentData;
	}
	
	public void setStudentData(Student studentData) {
		this.studentData = studentData;
	}
}

