package communication;


/**
 * The Class DeleteStudentFromCourseResponse.
 */
public class DeleteStudentFromCourseResponse extends Message {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The request saved. */
	boolean requestSaved;
	
	/** The err text. */
	private String errText;
	
	
	/**
	 * Instantiates a new delete student from course response.
	 *
	 * @param requestSaved the request saved
	 * @param errText the err text
	 */
	public DeleteStudentFromCourseResponse(boolean requestSaved, 
			String errText) {
		super();
		this.requestSaved = requestSaved;
		this.errText = errText;
	}
	
	
	/**
	 * Checks if is request saved.
	 *
	 * @return true, if is request saved
	 */
	public boolean isRequestSaved() {
		return requestSaved;
	}
	
	/**
	 * Sets the request saved.
	 *
	 * @param requestSaved the new request saved
	 */
	public void setRequestSaved(boolean requestSaved) {
		this.requestSaved = requestSaved;
	}
	
	/**
	 * Gets the err text.
	 *
	 * @return the err text
	 */
	public String getErrText() {
		return errText;
	}
	
	/**
	 * Sets the err text.
	 *
	 * @param errText the new err text
	 */
	public void setErrText(String errText) {
		this.errText = errText;
	}
}
