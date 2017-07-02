package communication;


/**
 * The Class DefineClassResponse.
 */
public class DefineClassResponse extends Message {
	
/** The Constant serialVersionUID. */
private static final long serialVersionUID = 1L;
	
	/** The request saved. */
	private boolean requestSaved;
	
	/** The request id. */
	private String requestId;	
	
	/** The err text. */
	private String errText;
	
	/** The is succeeded. */
	private boolean isSucceeded;
	
	/**
	 * Instantiates a new define class response.
	 *
	 * @param isSucceeded the is succeeded
	 * @param errText the err text
	 */
	public DefineClassResponse(boolean isSucceeded, String errText) {
		super();
		this.isSucceeded = isSucceeded;
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
	 * Gets the request id.
	 *
	 * @return the request id
	 */
	public String getRequestId() {
		return requestId;
	}
	
	/**
	 * Sets the request id.
	 *
	 * @param requestId the new request id
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
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
	 * Action succeed.
	 *
	 * @return true, if successful
	 */
	public boolean actionSucceed() {
		return isSucceeded;
	}
}


