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
	
	/** The subs tea check. */
	private SubmissionsForTeacherCheck subsTeaCheck;
	
	
	/**
	 * Instantiates a new gets the assignments of teacher response.
	 *
	 * @param requestSecceded the request secceded
	 * @param errText the err text
	 * @param subsTeaCheck the subs tea check
	 */
	public GetAssignmentsOfTeacherResponse(SubmissionsForTeacherCheck subsTeaCheck) {
			super();
			this.subsTeaCheck = subsTeaCheck;
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
}
