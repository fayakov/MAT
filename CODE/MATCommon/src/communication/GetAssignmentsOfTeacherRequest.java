package communication;


/**
 * The Class GetAssignmentsOfTeacherRequest.
 */
public class GetAssignmentsOfTeacherRequest extends Message 
{


/** The Constant serialVersionUID. */
private static final long serialVersionUID = 1L;
	
	/** The teacher ID. */
	private int userID;
	
	
	/**
	 * Instantiates a new gets the assignments of teacher request.
	 *
	 * @param teacherID the teacher ID
	 */
	public GetAssignmentsOfTeacherRequest(int userID) {
		super();
		this.userID = userID;
	}

	/**
	 * Gets the teacher ID.
	 *
	 * @return the teacher ID
	 */
	public int getUserID() {
		return userID;
	}


	/**
	 * Sets the teacher ID.
	 *
	 * @param teacherID the new teacher ID
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}
}
