package communication;


/**
 * The Class OpenSemesterResponse.
 */
public class OpenSemesterResponse extends Message {
	
/** The Constant serialVersionUID. */
private static final long serialVersionUID = 1L;
	
	/** The err text. */
	private String errText;
	
	/** The name. */
	private String name;
	
	/** The is succeeded. */
	private boolean isSucceeded;
		
	
	/**
	 * Instantiates a new open semester response.
	 *
	 * @param isSucceeded the is succeeded
	 * @param errText the err text
	 */
	public OpenSemesterResponse(boolean isSucceeded, String errText) {
		super();
		this.isSucceeded = isSucceeded;
		this.errText = errText;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
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

	/**
	 * Checks if is succeeded.
	 *
	 * @return true, if is succeeded
	 */
	public boolean isSucceeded() {
		return isSucceeded;
	}

	/**
	 * Sets the succeeded.
	 *
	 * @param isSucceeded the new succeeded
	 */
	public void setSucceeded(boolean isSucceeded) {
		this.isSucceeded = isSucceeded;
	}
	
}
