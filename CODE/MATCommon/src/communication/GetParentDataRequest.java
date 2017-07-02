package communication;


/**
 * The Class GetParentDataRequest.
 */
public class GetParentDataRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The parent id. */
	private int parentId;

	/**
	 * Instantiates a new gets the parent data request.
	 *
	 * @param parentId the parent id
	 */
	public GetParentDataRequest(int parentId) {
		super();
		this.parentId = parentId;
	}

	/**
	 * Gets the parent id.
	 *
	 * @return the parent id
	 */
	public int getParentId() {
		return parentId;
	}

	/**
	 * Sets the parent id.
	 *
	 * @param parentId the new parent id
	 */
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
}
	