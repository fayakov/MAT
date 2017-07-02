package communication;

import java.util.ArrayList;

import entities.Student;


/**
 * The Class AddClassToCourseResponse.
 */
public class AddClassToCourseResponse extends Message {

/** The Constant serialVersionUID. */
private static final long serialVersionUID = 1L;
	
	/** The is succeeded. */
	boolean isSucceeded;
	
	/** The err text. */
	private String errText;
	
	/** The excluded students. */
	ArrayList<Student> excludedStudents;
	
	/**
	 * Instantiates a new adds the class to course response.
	 *
	 * @param requestSecceded the request secceded
	 * @param excludedStudents the excluded students
	 * @param errText the err text
	 */
	public AddClassToCourseResponse(boolean requestSecceded, ArrayList<Student> excludedStudents, String errText) {
		this.isSucceeded = requestSecceded;
		this.excludedStudents = excludedStudents;
		this.errText = errText;
	}

	/**
	 * Gets the excluded students.
	 *
	 * @return the excluded students
	 */
	public ArrayList<Student> getExcludedStudents() {
		return excludedStudents;
	}

	/**
	 * Sets the excluded students.
	 *
	 * @param excludedStudents the new excluded students
	 */
	public void setExcludedStudents(ArrayList<Student> excludedStudents) {
		this.excludedStudents = excludedStudents;
	}

	/**
	 * Action succeed.
	 *
	 * @return the boolean
	 */
	public Boolean actionSucceed(){	
		return isSucceeded;
	}
	
	/**
	 * Gets the err text.
	 *
	 * @return the err text
	 */
	public String getErrText() {
		return errText;
	}
}
