package entities;

import java.io.InputStream;
import java.io.Serializable;
import java.sql.Date;


/**
 * The Class Assignment.
 */
public class Assignment implements Serializable
{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The date. */
	private Date date;
	
	/** The assignment number. */
	private int assignmentNumber;
	
	/** The file name. */
	private String fileName;
	
	/** The assingment file. */
	private byte[] assingmentFile;
	
	/** The teacher id. */
	private int teacherId;
	
	/** The course name. */
	private String courseName;
	
	/**
	 * Instantiates a new assignment.
	 */
	public Assignment(){
	}
	
	/**
	 * Instantiates a new assignment.
	 *
	 * @param date the date
	 * @param assignmentNumber the assignment number
	 * @param fileName the file name
	 * @param assingmentFile the assingment file
	 */
	public Assignment(Date date, int assignmentNumber, String fileName,  byte[] assingmentFile) 
	{
		//super();
		this.date = date;
		this.assignmentNumber = assignmentNumber;
		this.assingmentFile = assingmentFile;
		this.fileName = fileName;
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
	 * Gets the teacher id.
	 *
	 * @return the teacher id
	 */
	public int getTeacherId() {
		return teacherId;
	}
	
	/**
	 * Sets the teacher id.
	 *
	 * @param teacherId the new teacher id
	 */
	public void setTeacherId(int teacherId) {
		this.teacherId = assignmentNumber;
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
	 * Gets the course name.
	 *
	 * @return the course name
	 */
	public String getCourseName() {
		return courseName;
	}
	
	/**
	 * Sets the course name.
	 *
	 * @param courseName the new course name
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	/**
	 * Gets the file.
	 *
	 * @return the file
	 */
	public  byte[]  getFile() {
		return assingmentFile;
	}
	
	/**
	 * Sets the file.
	 *
	 * @param file the new file
	 */
	public void setFile( byte[]  file) {
		this.assingmentFile = file;
	}

}
