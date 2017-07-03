package entities;

import java.io.Serializable;


/**
 * The Class StudentCourse.
 */
public class StudentCourse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The student ID. */
	private int studentID;
	
	/** The course ID. */
	private int courseID;
	
	/** The grade. */
	private int grade;
	

	/**
	 * Instantiates a new student course.
	 *
	 * @param studentID the student ID
	 * @param courseID the course ID
	 * @param grade the grade
	 */
	public StudentCourse(int studentID, int courseID, int grade) {
		super();
		this.studentID = studentID;
		this.courseID = courseID;
		this.grade = grade;
	}
	
	
	/**
	 * Gets the student ID.
	 *
	 * @return the student ID
	 */
	public int getStudentID() {
		return studentID;
	}
	
	/**
	 * Sets the student ID.
	 *
	 * @param studentID the new student ID
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	/**
	 * Gets the course ID.
	 *
	 * @return the course ID
	 */
	public int getCourseID() {
		return courseID;
	}
	
	/**
	 * Sets the course ID.
	 *
	 * @param courseID the new course ID
	 */
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	
	/**
	 * Gets the grade.
	 *
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}
	
	/**
	 * Sets the grade.
	 *
	 * @param grade the new grade
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
