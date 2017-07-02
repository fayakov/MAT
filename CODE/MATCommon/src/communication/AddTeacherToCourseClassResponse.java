package communication;


/**
 * The Class AddTeacherToCourseClassResponse.
 */
public class AddTeacherToCourseClassResponse extends Message {

/** The Constant serialVersionUID. */
private static final long serialVersionUID = 1L;
	
	/** The is succeeded. */
	boolean isSucceeded;
	
	/** The request id. */
	String requestId;	
	
	/** The err text. */
	private String errText;
	
	/**
	 * Instantiates a new adds the teacher to course class response.
	 *
	 * @param isSucceeded the is succeeded
	 * @param eror the eror
	 */
	public AddTeacherToCourseClassResponse(boolean isSucceeded, String eror) {
		this.isSucceeded = isSucceeded;
		this.errText = eror;
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
