package communication;

import entities.Parent;


/**
 * The Class GetParentDataResponse.
 */
public class GetParentDataResponse extends Message {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The parent. */
	private Parent parent;
	
	/** The error. */
	private String error;
	
	/**
	 * Instantiates a new gets the parent data response.
	 *
	 * @param parent the parent
	 * @param error the error
	 */
	public GetParentDataResponse(Parent parent, String error) {
		super();

		this.parent = parent;
		this.setError(error);
	}

	/**
	 * Gets the parent.
	 *
	 * @return the parent
	 */
	public Parent getParent() {
		return parent;
	}

	/**
	 * Sets the parent.
	 *
	 * @param parent the new parent
	 */
	public void setParent(Parent parent) {
		this.parent = parent;
	}

	/**
	 * Gets the error.
	 *
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * Sets the error.
	 *
	 * @param error the new error
	 */
	public void setError(String error) {
		this.error = error;
	}
}


