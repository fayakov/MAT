package communication;

import java.util.ArrayList;

import entities.ClassCourse;
import entities.Student;
import entities.StudentCourse;

public class GetStudentDataResponse extends Message 
{
private static final long serialVersionUID = 1L;
	
	private boolean isSucceed;
	private String errText;
	Student studentData;
	public  ArrayList<StudentCourse> classCourseData = new ArrayList<StudentCourse>();
	
	
public GetStudentDataResponse(boolean isSucceed, String errText, Student studentData,
			ArrayList<StudentCourse> classCourseData) {
		super();
		this.isSucceed = isSucceed;
		this.errText = errText;
		this.studentData = studentData;
		this.classCourseData = classCourseData;
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
	public ArrayList<StudentCourse> getClassCourseData() {
		return classCourseData;
	}
	public void setClassCourseData(ArrayList<StudentCourse> classCourseData) {
		this.classCourseData = classCourseData;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
	

	
	
	
	
	
	
	
}

