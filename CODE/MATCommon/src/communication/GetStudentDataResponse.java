package communication;

import java.util.ArrayList;
import entities.Student;
import entities.StudentCourse;

public class GetStudentDataResponse extends Message 
{
private static final long serialVersionUID = 1L;
	
	private boolean isSucceed;
	private String errText;
	Student studentData;
	public  ArrayList<StudentCourse> stuCourseData = new ArrayList<StudentCourse>();
	
	
public GetStudentDataResponse(boolean isSucceed, String errText, Student studentData,
			ArrayList<StudentCourse> stuCourseData) {
		super();
		this.isSucceed = isSucceed;
		this.errText = errText;
		this.studentData = studentData;
		this.stuCourseData = stuCourseData;
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
	public ArrayList<StudentCourse> getStuCourseData() {
		return stuCourseData;
	}
	public void setStuCourseData(ArrayList<StudentCourse> stuCourseData) {
		this.stuCourseData = stuCourseData;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}

