package entities;

import java.util.ArrayList;

public class Course  {
	
	private int courseId;
	private String courseName;
	private int teachingUnit;
	private ArrayList<Integer> preCourses;
	private int duration;
	
	public Course(){
	}
	
	public Course(int courseId, String courseName, int teachingUnit, ArrayList<Integer> preCourses, int duration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.teachingUnit = teachingUnit;
		this.preCourses = preCourses;
		this.duration = duration;
	}
	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

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
