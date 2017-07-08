package communication;

/**
 * The Class DefineCourseRequest.
 */
public class DefineCourseRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The course name. */
	private String courseName;
	
	/** The teaching unit. */
	private int teachingUnit;
	
	/** The teaching hours. */
	private int teachingHours;
	
	/** The pre Course. */
	private int preCourse;
	
	
	/**
	 * Instantiates a new define course request.
	 *
	 * @param courseName the course name
	 * @param teachingHours the teaching hours
	 * @param teachingUnit the teaching unit
	 */
	
	public DefineCourseRequest(String courseName, int teachingUnit, int teachingHours, int preCourse) {
		super();
		this.courseName = courseName;
		this.teachingUnit = teachingUnit;
		this.teachingHours = teachingHours;
		this.preCourse = preCourse;
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

	public int getPreCourse() {
		return preCourse;
	}

	public void setPreCourse(int preCourse) {
		this.preCourse = preCourse;
	}

	
}
