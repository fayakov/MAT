package communication;

import entities.Student;


/**
 * The Class GetStudentDataResponse.
 */
public class GetStudentDataResponse extends Message 
{

/** The Constant serialVersionUID. */
private static final long serialVersionUID = 1L;
	
	/** The student data. */
	Student studentData;

	/**
	 * Instantiates a new gets the student data response.
	 *
	 * @param studentData the student data
	 */
	public GetStudentDataResponse(Student studentData) {
		super();
		this.studentData = studentData;
	}

	/**
	 * Gets the student data.
	 *
	 * @return the student data
	 */
	public Student getStudentData() {
		return studentData;
	}

	/**
	 * Sets the student data.
	 *
	 * @param studentData the new student data
	 */
	public void setStudentData(Student studentData) {
		this.studentData = studentData;
	}
}

