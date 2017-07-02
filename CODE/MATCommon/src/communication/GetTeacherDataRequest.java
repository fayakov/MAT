package communication;


/**
 * The Class GetTeacherDataRequest.
 */
public class GetTeacherDataRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The Teacher id. */
	private int TeacherId;

	/**
	 * Instantiates a new gets the teacher data request.
	 *
	 * @param teacherId the teacher id
	 */
	public GetTeacherDataRequest(int teacherId) {
		super();
		TeacherId = teacherId;
	}

	/**
	 * Gets the teacher id.
	 *
	 * @return the teacher id
	 */
	public int getTeacherId() {
		return TeacherId;
	}

	/**
	 * Sets the teacher id.
	 *
	 * @param teacherId the new teacher id
	 */
	public void setTeacherId(int teacherId) {
		TeacherId = teacherId;
	}
	
	
	
	
}
