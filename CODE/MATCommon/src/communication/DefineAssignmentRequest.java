package communication;

import java.sql.Date;

/**
 * The Class DefineAssignmentRequest.
 */
public class DefineAssignmentRequest extends Message 
{
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
		
	/** The due date of assignment */
	private Date dueDate;
	
	/** The file name. */
	private String fileName;
	
	/** The file. */
	private byte[] fileData;
	
	/** The user id of the teacher. */
	private int userId;
	
	/** The course id. */
	private int courseId;

	public DefineAssignmentRequest(Date dueDate, String fileName, byte[] fileData, int userId, int courseId) {
		super();
		this.dueDate = dueDate;
		this.fileName = fileName;
		this.fileData = fileData;
		this.userId = userId;
		this.courseId = courseId;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getFileData() {
		return fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
}
