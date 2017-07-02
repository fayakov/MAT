package communication;


/**
 * The Class AddStudentToClassResponse.
 */
public class AddStudentToClassResponse extends Message {
	
/** The Constant serialVersionUID. */
private static final long serialVersionUID = 1L;

	/** The is succeeded. */
	boolean isSucceeded;
	
	/** The request id. */
	String requestId;	
	
	/** The err text. */
	private String errText;

	/**
	 * Instantiates a new adds the student to class response.
	 *
	 * @param isSucceeded the is succeeded
	 * @param errText the err text
	 */
	public AddStudentToClassResponse(boolean isSucceeded, String errText) {	
		this.isSucceeded = isSucceeded;
		this.errText = errText;
	}
	
	/**
	 * Action succeed.
	 *
	 * @return the boolean
	 */
	public Boolean actionSucceed(){	
		return isSucceeded;
	}	
	
	/**
	 * Gets the err text.
	 *
	 * @return the err text
	 */
	public String getErrText() {
		return errText;
	}

}
