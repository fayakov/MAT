package entities;

import java.io.Serializable;
import java.sql.Date;


/**
 * The Class SubmissionResponse.
 */
public class SubmissionResponse implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The grade. */
	private int grade;
	
	/** The comment. */
	private String comment;
	
	/** The date. */
	private Date date;
	
	/** The submission number. */
	private int submissionNumber; //-- output
	
	/** The file name. */
	private String fileName;
	
	/** The file. */
	private byte[] file;
	
	/** The teacher id. */
	private int teacherId;

	
	/**
	 * Sets the grade.
	 *
	 * @param grade the new grade
	 */
	public void setGrade(int grade){
		this.grade = grade;
	}
	
	/**
	 * Gets the grade.
	 *
	 * @return the grade
	 */
	public int getGrade(){
		return grade;
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
		return submissionNumber;
	}
	
	/**
	 * Sets the assignment number.
	 *
	 * @param submissionNumber the new assignment number
	 */
	public void setAssignmentNumber(int submissionNumber) {
		this.submissionNumber = submissionNumber;
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
	 * Gets the comment.
	 *
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	
	/**
	 * Sets the comment.
	 *
	 * @param comment the new comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	/**
	 * Sets the teacher id.
	 *
	 * @return the int
	 */
	public int setTeacherId() {
		return teacherId;
	}
	
	/**
	 * Sets the teacher id.
	 *
	 * @param teacherId the new teacher id
	 */
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
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
