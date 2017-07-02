package communication;


/**
 * The Class GetClassTeachersStatsRequest.
 */
public class GetClassTeachersStatsRequest extends Message {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The class number. */
	private int classNumber;

	/**
	 * Instantiates a new gets the class teachers stats request.
	 *
	 * @param classNumber the class number
	 */
	public GetClassTeachersStatsRequest(int classNumber) {
		super();
		this.classNumber = classNumber;
	}

	/**
	 * Gets the class number.
	 *
	 * @return the class number
	 */
	public int getClassNumber() {
		return classNumber;
	}

	/**
	 * Sets the class number.
	 *
	 * @param classNumber the new class number
	 */
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
}
