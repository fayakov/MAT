package communication;

import java.util.ArrayList;

import entities.Assignment;
import entities.StudentCourseAssignment;


public class GetAssignmentsOfStudentResponse extends Message 
{
	private static final long serialVersionUID = 1L;
	
	boolean requestSecceded;
	private String errText;
	private StudentCourseAssignment stuCourseAss;
	
	public GetAssignmentsOfStudentResponse(StudentCourseAssignment stuCourseAss) {
		super();
		this.stuCourseAss = stuCourseAss;
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
	public StudentCourseAssignment getStuCourseAss() {
		return stuCourseAss;
	}
	public void setStuCourseAss(StudentCourseAssignment stuCourseAss) {
		this.stuCourseAss = stuCourseAss;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
