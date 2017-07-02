package communication;

import entities.CClass;


/**
 * The Class GetTeacherToClassesStatsResponse.
 */
public class GetTeacherToClassesStatsResponse extends Message {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The request secceded. */
	boolean requestSecceded;
	
	/** The err text. */
	private String errText;
	
	/** The class data. */
	CClass classData;
	
	/**
	 * Instantiates a new gets the teacher to classes stats response.
	 *
	 * @param requestSecceded the request secceded
	 * @param errText the err text
	 * @param classData the class data
	 */
	public GetTeacherToClassesStatsResponse(boolean requestSecceded, String errText,
			CClass classData) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
		this.classData = classData;
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

