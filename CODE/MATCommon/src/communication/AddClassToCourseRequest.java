package communication;


/**
 * The Class AddClassToCourseRequest.
 */
public class AddClassToCourseRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The class id. */
	private int classId;
	
	/** The course id. */
	private int courseId;
	
	/**
	 * Instantiates a new adds the class to course request.
	 *
	 * @param classId the class id
	 * @param courseId the course id
	 */
	public AddClassToCourseRequest(int classId, int courseId) {
		this.classId = classId;
		this.courseId = courseId;
	}

	/**
	 * Gets the class id.
	 *
	 * @return the class id
	 */
	public int getClassId() {
		return classId;
	}

	/**
	 * Sets the class id.
	 *
	 * @param classId the new class id
	 */
	public void setClassId(int classId) {
		this.classId = classId;
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
	
	
	
	
	
	
}
