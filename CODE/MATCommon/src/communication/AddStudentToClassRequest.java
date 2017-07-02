package communication;


/**
 * The Class AddStudentToClassRequest.
 */
public class AddStudentToClassRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The student id. */
	private int studentId;
	
	/** The class id. */
	private int classId;
	
	/**
	 * Instantiates a new adds the student to class request.
	 *
	 * @param studentId the student id
	 * @param classId the class id
	 */
	public AddStudentToClassRequest(int studentId, int classId) {
		this.studentId = studentId;
		this.classId= classId;
	}

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
	
	
	
	
}
