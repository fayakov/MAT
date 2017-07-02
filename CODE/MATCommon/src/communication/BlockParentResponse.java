package communication;


/**
 * The Class BlockParentResponse.
 */
public class BlockParentResponse extends Message {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The request secceded. */
	boolean requestSecceded;
	
	/** The err text. */
	private String errText;
	
	
	/**
	 * Instantiates a new block parent response.
	 *
	 * @param requestSecceded the request secceded
	 * @param errText the err text
	 */
	public BlockParentResponse(boolean requestSecceded, String errText) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
	}


	/**
	 * Checks if is request secceded.
	 *
	 * @return true, if is request secceded
	 */
	public boolean isRequestSecceded() {
		return requestSecceded;
	}

	/**
	 * Sets the request secceded.
	 *
	 * @param requestSecceded the new request secceded
	 */
	public void setRequestSecceded(boolean requestSecceded) {
		this.requestSecceded = requestSecceded;
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
