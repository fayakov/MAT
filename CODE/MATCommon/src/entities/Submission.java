package entities;

import java.io.Serializable;
import java.io.InputStream;
import java.sql.Date;



/**
 * The Class Submission.
 */
//TAL
public class Submission implements Serializable {

	/** The date. */
	private Date date;
	
	/** The submission number. */
	private int submissionNumber; //-- output
	
	/** The file name. */
	private String fileName;
	
	/** The file. */
	private byte[] file;
	
	/** The assignment number. */
	private int assignmentNumber;
	
	/** The student id. */
	private int studentId;
	
	/**
	 * Instantiates a new submission.
	 */
	public Submission(){
	}
	
	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	
	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	/**
	 * Gets the assignment number.
	 *
	 * @return the assignment number
	 */
	public int getAssignmentNumber() {
		return assignmentNumber;
	}
	
	/**
	 * Sets the assignment number.
	 *
	 * @param assignmentNumber the new assignment number
	 */
	public void setAssignmentNumber(int assignmentNumber) {
		this.assignmentNumber = assignmentNumber;
	}
	
	/**
	 * Gets the submission number.
	 *
	 * @return the submission number
	 */
	public int getSubmissionNumber() {
		return submissionNumber;
	}
	
	/**
	 * Sets the submission number.
	 *
	 * @param submissionNumber the new submission number
	 */
	public void setSubmissionNumber(int submissionNumber) {
		this.submissionNumber = submissionNumber;
	}
	
	/**
	 * Gets the student id.
	 *
	 * @return the student id
	 */
	public int getStudentId() {
		return studentId;
	}
	
	/**
	 * Sets the student id.
	 *
	 * @param studentId the new student id
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	/**
	 * Gets the file name.
	 *
	 * @return the file name
	 */
	public String getFileName() {
		return fileName;
	}
	
	
	/**
	 * Sets the file name.
	 *
	 * @param fileName the new file name
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	/**
	 * Gets the file.
	 *
	 * @return the file
	 */
	public  byte[]  getFile() {
		return file;
	}
	
	/**
	 * Sets the file.
	 *
	 * @param file the new file
	 */
	public void setFile( byte[]  file) {
		this.file = file;
	}

}
