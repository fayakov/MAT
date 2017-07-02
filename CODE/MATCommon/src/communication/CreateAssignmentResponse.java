package communication;

import entities.CClass;


/**
 * The Class CreateAssignmentResponse.
 */
public class CreateAssignmentResponse extends Message 
{
	
	/** The request secceded. */
	boolean requestSecceded;
	
	/** The err text. */
	private String errText;
	
	
	/**
	 * Instantiates a new creates the assignment response.
	 *
	 * @param requestSecceded the request secceded
	 * @param errText the err text
	 */
	public CreateAssignmentResponse(boolean requestSecceded, String errText) {
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
