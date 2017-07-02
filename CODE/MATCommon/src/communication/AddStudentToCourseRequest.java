package communication;


import entities.Request;


/**
 * The Class AddStudentToCourseRequest.
 */
public class AddStudentToCourseRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The course id. */
	private int studentId, classId, courseId;
	
	
	/**
	 * Gets the student id.
	 *
	 * @return the student id
	 */
	public int getStudentId() {
		return studentId;
	}


	/**
	 * Sets the student id.
	 *
	 * @param studentId the new student id
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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


	/**
	 * Instantiates a new adds the student to course request.
	 *
	 * @param studentId the student id
	 * @param classId the class id
	 * @param courseId the course id
	 */
	public AddStudentToCourseRequest(int studentId, int classId, int courseId) {
		super();
		this.studentId = studentId;
		this.classId = classId;
		this.courseId = courseId;
	}
	
}