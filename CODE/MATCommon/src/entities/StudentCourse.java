package entities;

import java.io.Serializable;

public class StudentCourse implements Serializable {

	private int studentID;
	private int courseID;
	private int grade;
	

	public StudentCourse(int studentID, int courseID, int grade) {
		super();
		this.studentID = studentID;
		this.courseID = courseID;
		this.grade = grade;
	}
	
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
