package communication;


/**
 * The Class PrincipalDecisionResponse.
 */
public class PrincipalDecisionResponse extends Message {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The request saved. */
	boolean requestSaved;
	
	/** The request id. */
	int requestId;	
	
	/** The err text. */
	private String errText;
	
	/**
	 * Instantiates a new principal decision response.
	 *
	 * @param requestSaved the request saved
	 * @param i the i
	 * @param errText the err text
	 */
	public PrincipalDecisionResponse(boolean requestSaved, int i,
			String errText) {
		super();
		this.requestSaved = requestSaved;
		this.requestId = i;
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
	public int getRequestId() {
		return requestId;
	}
	
	/**
	 * Sets the request id.
	 *
	 * @param requestId the new request id
	 */
	public void setRequestId(int requestId) {
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
}
