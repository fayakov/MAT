package entities;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * The Class Course.
 */
public class Course implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The course id. */
	private int courseId;
	
	/** The course name. */
	private String courseName;
	
	/** The teaching unit. */
	private int teachingUnit;
	
	/** The pre courses. */
	private ArrayList<Integer> preCourses;
	
	/** The duration. */
	private int duration;
	
	/**
	 * Instantiates a new course.
	 *
	 * @param courseId the course id
	 * @param courseName the course name
	 * @param teachingUnit the teaching unit
	 * @param preCourses the pre courses
	 * @param duration the duration
	 */
	public Course(int courseId, String courseName, int teachingUnit, ArrayList<Integer> preCourses, int duration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.teachingUnit = teachingUnit;
		this.preCourses = preCourses;
		this.duration = duration;
	}
	
	public Course() {
		super();
	}

	public Course(int courseId, String courseName, int teachingUnit, int duration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.teachingUnit = teachingUnit;
		this.duration = duration;
	}

	/**
	 * Gets the duration.
	 *
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * Sets the duration.
	 *
	 * @param duration the new duration
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * Gets the pre courses.
	 *
	 * @return the pre courses
	 */
	public ArrayList<Integer> getPreCourses() {
		return preCourses;
	}
	
	/**
	 * Sets the pre courses.
	 *
	 * @param preCourses the new pre courses
	 */
	public void setPreCourses(ArrayList<Integer> preCourses) {
		this.preCourses = preCourses;
	}
	
	/**
	 * Gets the course id.
	 *
	 * @return the course id
	 */
	public int getCourseId() {
		return courseId;
	}
	
	/**
	 * Sets the course id.
	 *
	 * @param courseId the new course id
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	/**
	 * Gets the course name.
	 *
	 * @return the course name
	 */
	public String getCourseName() {
		return courseName;
	}
	
	/**
	 * Sets the course name.
	 *
	 * @param courseName the new course name
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	/**
	 * Gets the teaching unit.
	 *
	 * @return the teaching unit
	 */
	public int getTeachingUnit() {
		return teachingUnit;
	}
	
	/**
	 * Sets the teaching unit.
	 *
	 * @param teachingUnit the new teaching unit
	 */
	public void setTeachingUnit(int teachingUnit) {
		this.teachingUnit = teachingUnit;
	}  
	  
}
