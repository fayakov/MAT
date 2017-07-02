package communication;


/**
 * The Class GetTeacherStatsRequest.
 */
public class GetTeacherStatsRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The teacher ID. */
	private int teacherID;

	/**
	 * Instantiates a new gets the teacher stats request.
	 *
	 * @param teacherID the teacher ID
	 */
	public GetTeacherStatsRequest(int teacherID) {
		super();
		this.teacherID = teacherID;
	}

	/**
	 * Gets the teacher ID.
	 *
	 * @return the teacher ID
	 */
	public int getTeacherID() {
		return teacherID;
	}

	/**
	 * Sets the teacher ID.
	 *
	 * @param teacherID the new teacher ID
	 */
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}
}
