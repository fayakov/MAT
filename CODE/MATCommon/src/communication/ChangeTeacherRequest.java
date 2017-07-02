package communication;

import entities.ERequestType;
import entities.Request;


/**
 * The Class ChangeTeacherRequest.
 */
public class ChangeTeacherRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The course id. */
	private int teacherId, classId, courseId;

	/**
	 * Instantiates a new change teacher request.
	 *
	 * @param teacherId the teacher id
	 * @param classId the class id
	 * @param courseId the course id
	 */
	public ChangeTeacherRequest(int teacherId, int classId, int courseId) {
		super();
		this.teacherId = teacherId;
		this.classId = classId;
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