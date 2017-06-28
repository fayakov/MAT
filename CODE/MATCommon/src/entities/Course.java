package entities;

import java.util.ArrayList;

public class Course  {
	
	private int courseId;
	private String courseName;
	private int teachingUnit;
	private ArrayList<Integer> preCourses;
	
	public ArrayList<Integer> getPreCourses() {
		return preCourses;
	}
	public void setPreCourses(ArrayList<Integer> preCourses) {
		this.preCourses = preCourses;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getTeachingUnit() {
		return teachingUnit;
	}
	public void setTeachingUnit(int teachingUnit) {
		this.teachingUnit = teachingUnit;
	}  
	  
}
