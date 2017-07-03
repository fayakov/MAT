package entities;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * The Class SubmissionsForTeacherCheck.
 */
public class SubmissionsForTeacherCheck implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** The submission list. */
	private ArrayList<Submission> submissionList;

	/**
	 * Gets the submission list.
	 *
	 * @return the submission list
	 */
	public ArrayList<Submission> getSubmissionList() {
		return submissionList;
	}

	/**
	 * Sets the submission list.
	 *
	 * @param submissionList the new submission list
	 */
	public void setSubmissionList(ArrayList<Submission> submissionList) {
		this.submissionList = submissionList;
	}
	
	
}
