package communication;

import entities.Teacher;


/**
 * The Class GetTeacherDataResponse.
 */
public class GetTeacherDataResponse extends Message {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The request secceded. */
	boolean requestSecceded;
	
	/** The err text. */
	private String errText;
	
	/** The teacher data. */
	Teacher teacherData;
	
	/**
	 * Instantiates a new gets the teacher data response.
	 *
	 * @param requestSecceded the request secceded
	 * @param errText the err text
	 * @param teacherData the teacher data
	 */
	public GetTeacherDataResponse(boolean requestSecceded, String errText,
			Teacher teacherData) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
		this.teacherData = teacherData;
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
	 * Gets the student data.
	 *
	 * @return the student data
	 */
	public Teacher getStudentData() {
		return teacherData;
	}
	
	/**
	 * Sets the student data.
	 *
	 * @param teacherData the new student data
	 */
	public void setStudentData(Teacher teacherData) {
		this.teacherData = teacherData;
	}
}

