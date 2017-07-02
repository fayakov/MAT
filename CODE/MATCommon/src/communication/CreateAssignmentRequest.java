package communication;

import java.io.File;


/**
 * The Class CreateAssignmentRequest.
 */
public class CreateAssignmentRequest extends Message 
{

/** The Constant serialVersionUID. */
private static final long serialVersionUID = 1L;
	
	/** The selected file. */
	File selectedFile; 
	
	/** The date. */
	String date;
	
	/** The class num. */
	int classNum;
	
	/** The course num. */
	int courseNum;
	
	
	/**
	 * Instantiates a new creates the assignment request.
	 *
	 * @param selectedFile the selected file
	 * @param date the date
	 * @param classNum the class num
	 * @param courseNum the course num
	 */
	public CreateAssignmentRequest(File selectedFile, String date, int classNum, int courseNum) {
		super();
		this.selectedFile = selectedFile;
		this.date = date;
		this.classNum = classNum;
		this.courseNum = courseNum;
	}


	/**
	 * Gets the selected file.
	 *
	 * @return the selected file
	 */
	public File getSelectedFile() {
		return selectedFile;
	}


	/**
	 * Sets the selected file.
	 *
	 * @param selectedFile the new selected file
	 */
	public void setSelectedFile(File selectedFile) {
		this.selectedFile = selectedFile;
	}


	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public String getDate() {
		return date;
	}


	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(String date) {
		this.date = date;
	}


	/**
	 * Gets the class num.
	 *
	 * @return the class num
	 */
	public int getClassNum() {
		return classNum;
	}


	/**
	 * Sets the class num.
	 *
	 * @param classNum the new class num
	 */
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}


	/**
	 * Gets the course num.
	 *
	 * @return the course num
	 */
	public int getCourseNum() {
		return courseNum;
	}


	/**
	 * Sets the course num.
	 *
	 * @param courseNum the new course num
	 */
	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
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
