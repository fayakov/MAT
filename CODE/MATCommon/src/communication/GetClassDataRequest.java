package communication;


/**
 * The Class GetClassDataRequest.
 */
public class GetClassDataRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The Class number. */
	private int ClassNumber;

	/**
	 * Instantiates a new gets the class data request.
	 *
	 * @param classNumber the class number
	 */
	public GetClassDataRequest(int classNumber) {
		super();
		ClassNumber = classNumber;
	}

	/**
	 * Gets the class number.
	 *
	 * @return the class number
	 */
	public int getClassNumber() {
		return ClassNumber;
	}

	/**
	 * Sets the class number.
	 *
	 * @param classNumber the new class number
	 */
	public void setClassNumber(int classNumber) {
		ClassNumber = classNumber;
	}
	

}

