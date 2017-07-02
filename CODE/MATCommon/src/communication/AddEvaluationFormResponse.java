package communication;


/**
 * The Class AddEvaluationFormResponse.
 */
public class AddEvaluationFormResponse extends Message 
{
	
	/** The is succeed. */
	private boolean isSucceed;
	
	/** The err text. */
	private String errText;
	
	
/**
 * Instantiates a new adds the evaluation form response.
 *
 * @param isSucceed the is succeed
 * @param errText the err text
 */
public AddEvaluationFormResponse(boolean isSucceed, String errText) 
{
		super();
		this.isSucceed = isSucceed;
		this.errText = errText;
	}


/** The Constant serialVersionUID. */
private static final long serialVersionUID = 1L;
	
	
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
	
	/**
	 * Gets the serialversionuid.
	 *
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
