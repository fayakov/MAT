package communication;


/**
 * The Class GetStudentDataByStudentIDRequest.
 */
public class GetStudentDataByStudentIDRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The student id. */
	private int studentId;
	
	/**
	 * Instantiates a new gets the student data by student ID request.
	 *
	 * @param studentId the student id
	 */
	public GetStudentDataByStudentIDRequest(int studentId) {
		this.studentId = studentId;
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
}
