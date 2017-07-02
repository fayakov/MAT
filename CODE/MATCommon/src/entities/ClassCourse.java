package entities;


/**
 * The Class ClassCourse.
 */
public class ClassCourse {
	
	/** The teacher id. */
	private int classId, courseId, teacherId;
	
	/**
	 * Instantiates a new class course.
	 *
	 * @param clid the clid
	 * @param coid the coid
	 * @param tid the tid
	 */
	public ClassCourse(int clid, int coid, int tid) {
		 classId = clid;
		 courseId = coid;
		 teacherId = tid;
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

}
