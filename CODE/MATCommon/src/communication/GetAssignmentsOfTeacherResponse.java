package communication;

import java.util.ArrayList;

import entities.SubmissionsForTeacherCheck;


/**
 * The Class GetAssignmentsOfTeacherResponse.
 */
public class GetAssignmentsOfTeacherResponse extends Message 
{

/** The Constant serialVersionUID. */
private static final long serialVersionUID = 1L;
	
	/** The request secceded. */
	boolean requestSecceded;
	
	/** The err text. */
	private String errText;
	
	/** The subs tea check. */
	private SubmissionsForTeacherCheck subsTeaCheck;
	
	
/**
 * Instantiates a new gets the assignments of teacher response.
 *
 * @param requestSecceded the request secceded
 * @param errText the err text
 * @param subsTeaCheck the subs tea check
 */
public GetAssignmentsOfTeacherResponse(boolean requestSecceded, String errText,
			SubmissionsForTeacherCheck subsTeaCheck) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
		this.subsTeaCheck = subsTeaCheck;
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
	 * Gets the subs tea check.
	 *
	 * @return the subs tea check
	 */
	public SubmissionsForTeacherCheck getSubsTeaCheck() {
		return subsTeaCheck;
	}
	
	/**
	 * Sets the subs tea check.
	 *
	 * @param subsTeaCheck the new subs tea check
	 */
	public void setSubsTeaCheck(SubmissionsForTeacherCheck subsTeaCheck) {
		this.subsTeaCheck = subsTeaCheck;
	}
	
	/**
	 * Gets the serialversionuid.
	 *
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
}
