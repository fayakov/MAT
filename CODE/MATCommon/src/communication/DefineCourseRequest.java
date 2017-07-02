package communication;

import java.util.ArrayList;


/**
 * The Class DefineCourseRequest.
 */
public class DefineCourseRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The course name. */
	String courseName;
	
	/** The teaching unit. */
	private int teachingUnit;
	
	/** The teaching hours. */
	private int teachingHours;
	
	/**
	 * Instantiates a new define course request.
	 *
	 * @param courseName the course name
	 * @param teachingHours the teaching hours
	 * @param teachingUnit the teaching unit
	 */
	public DefineCourseRequest(String courseName, int teachingHours, int teachingUnit) {
		this.courseName = courseName;
		this.teachingHours = teachingHours;
		this.teachingUnit = teachingUnit;
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

	/**
	 * Gets the teaching hours.
	 *
	 * @return the teaching hours
	 */
	public int getTeachingHours() {
		return teachingHours;
	}

	/**
	 * Sets the teaching hours.
	 *
	 * @param teachingHours the new teaching hours
	 */
	public void setTeachingHours(int teachingHours) {
		this.teachingHours = teachingHours;
	}

	
}
