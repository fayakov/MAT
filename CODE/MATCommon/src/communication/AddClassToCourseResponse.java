package communication;

import java.util.ArrayList;

import entities.Student;

public class AddClassToCourseResponse extends Message {

private static final long serialVersionUID = 1L;
	
	boolean isSucceeded;
	private String errText;
	ArrayList<Student> excludedStudents;
	
	public AddClassToCourseResponse(boolean requestSecceded, ArrayList<Student> excludedStudents, String errText) {
		this.isSucceeded = requestSecceded;
		this.excludedStudents = excludedStudents;
		this.errText = errText;
	}

	public ArrayList<Student> getExcludedStudents() {
		return excludedStudents;
	}

	public void setExcludedStudents(ArrayList<Student> excludedStudents) {
		this.excludedStudents = excludedStudents;
	}

	public Boolean actionSucceed(){	
		return isSucceeded;
	}
	
	public String getErrText() {
		return errText;
	}
}
