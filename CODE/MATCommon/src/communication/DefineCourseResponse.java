package communication;


/**
 * The Class DefineCourseResponse.
 */
public class DefineCourseResponse extends Message {

/** The Constant serialVersionUID. */
private static final long serialVersionUID = 1L;
	
	/** The is succeeded. */
	boolean isSucceeded;	
	
	/** The err text. */
	private String errText;
	
	
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
