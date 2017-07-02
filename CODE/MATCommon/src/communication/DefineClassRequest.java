package communication;


/**
 * The Class DefineClassRequest.
 */
public class DefineClassRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The class id. */
	private int classId;
	
	/** The class name. */
	private String className;
	
	/**
	 * Instantiates a new define class request.
	 *
	 * @param classId the class id
	 * @param className the class name
	 */
	public DefineClassRequest(int classId, String className) {
		this.classId = classId;
		this.className = className;
	}


	/**
	 * Gets the class id.
	 *
	 * @return the class id
	 */
	public int getClassId() {
		return classId;
	}

	/**
	 * Sets the class id.
	 *
	 * @param classId the new class id
	 */
	public void setClassId(int classId) {
		this.classId = classId;
	}

	/**
	 * Gets the class name.
	 *
	 * @return the class name
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * Sets the class name.
	 *
	 * @param className the new class name
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	
}
