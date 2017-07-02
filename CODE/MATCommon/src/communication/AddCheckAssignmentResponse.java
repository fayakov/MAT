package communication;


/**
 * The Class AddCheckAssignmentResponse.
 */
public class AddCheckAssignmentResponse extends Message 
{
	
	/** The is succeed. */
	private boolean isSucceed;
	
	/** The err text. */
	private String errText;
	
	
	/**
	 * Instantiates a new adds the check assignment response.
	 *
	 * @param isSucceed the is succeed
	 * @param errText the err text
	 */
	public AddCheckAssignmentResponse(boolean isSucceed, String errText) 
	{
		super();
		this.isSucceed = isSucceed;
		this.errText = errText;
	}
	
	

	/**
	 * Checks if is succeed.
	 *
	 * @return true, if is succeed
	 */
	public boolean isSucceed() {
		return isSucceed;
	}
	
	/**
	 * Sets the succeed.
	 *
	 * @param isSucceed the new succeed
	 */
	public void setSucceed(boolean isSucceed) {
		this.isSucceed = isSucceed;
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
