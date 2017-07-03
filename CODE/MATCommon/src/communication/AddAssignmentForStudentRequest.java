package communication;

import java.sql.Date;

/**
 * The Class AddAssignmentForStudentRequest.
 */
public class AddAssignmentForStudentRequest extends Message 
{
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
		
	/** The date sub. */
	private Date dateSub;
	
	public Date getDateSub() {
		return dateSub;
	}

	public void setDateSub(Date dateSub) {
		this.dateSub = dateSub;
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

	public void setFileData(byte[] file) {
		this.fileData = file;
	}

	public int getAssignmentNumber() {
		return assignmentNumber;
	}

	public void setAssignmentNumber(int assignmentNumber) {
		this.assignmentNumber = assignmentNumber;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public AddAssignmentForStudentRequest(Date dateSub, String fileName, byte[] file, int assignmentNumber,
			int studentId) {
		super();
		this.dateSub = dateSub;
		this.fileName = fileName;
		this.fileData = file;
		this.assignmentNumber = assignmentNumber;
		this.studentId = studentId;
	}

	/** The file name. */
	private String fileName;
	
	/** The file. */
	private byte[] fileData;
	
	/** The assignment number. */
	private int assignmentNumber;
	
	/** The student id. */
	private int studentId;	
}
