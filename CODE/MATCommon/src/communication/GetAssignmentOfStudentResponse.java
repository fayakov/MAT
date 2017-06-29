package communication;

public class GetAssignmentOfStudentResponse extends Message 
{
public GetAssignmentOfStudentResponse(boolean requestSecceded, String errText, int studentID, String courseName,
			String fileName) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
		this.studentID = studentID;
		this.courseName = courseName;
		this.fileName = fileName;
	}

private static final long serialVersionUID = 1L;
	
	boolean requestSecceded;
	private String errText;
	
	int studentID;
	String courseName;
	String fileName;
	public boolean isRequestSecceded() {
		return requestSecceded;
	}
	
	
	public void setRequestSecceded(boolean requestSecceded) {
		this.requestSecceded = requestSecceded;
	}
	public String getErrText() {
		return errText;
	}
	public void setErrText(String errText) {
		this.errText = errText;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
