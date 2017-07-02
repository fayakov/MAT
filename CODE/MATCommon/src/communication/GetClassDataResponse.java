package communication;

import entities.CClass;


/**
 * The Class GetClassDataResponse.
 */
public class GetClassDataResponse extends Message {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The err text. */
	private String errText;
	
	/** The class data. */
	CClass classData;
	
	/**
	 * Instantiates a new gets the class data response.
	 *
	 * @param classData the class data
	 * @param errText the err text
	 */
	public GetClassDataResponse(CClass classData, String errText) {
		super();
		this.errText = errText;
		this.classData = classData;
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
	 * Gets the class data.
	 *
	 * @return the class data
	 */
	public CClass getclassData() {
		return classData;
	}
	
	/**
	 * Sets the class data.
	 *
	 * @param classData the new class data
	 */
	public void setclassData(CClass classData) {
		this.classData = classData;
	}
}

