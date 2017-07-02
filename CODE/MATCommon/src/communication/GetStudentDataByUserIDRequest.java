package communication;


/**
 * The Class GetStudentDataByUserIDRequest.
 */
public class GetStudentDataByUserIDRequest extends Message 
{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The user id. */
	private int userId;
	
	/**
	 * Instantiates a new gets the student data by user ID request.
	 *
	 * @param userId the user id
	 */
	public GetStudentDataByUserIDRequest(int userId) {
		this.userId = userId;
		
	}
	
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
