package communication;


/**
 * The Class AddTeacherToCourseClassRequest.
 */
public class AddTeacherToCourseClassRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The class id. */
	private int teacherId, courseId, classId;

	
	/**
	 * Instantiates a new adds the teacher to course class request.
	 *
	 * @param tid the tid
	 * @param coid the coid
	 * @param clid the clid
	 */
	public AddTeacherToCourseClassRequest(int tid, int coid, int clid) {
		teacherId = tid;
		courseId = coid;
		classId = clid;
	}


	/**
	 * Gets the teacher id.
	 *
	 * @return the teacher id
	 */
	public int getTeacherId() {
		return teacherId;
	}


	/**
	 * Sets the teacher id.
	 *
	 * @param teacherId the new teacher id
	 */
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
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
	
	
}
