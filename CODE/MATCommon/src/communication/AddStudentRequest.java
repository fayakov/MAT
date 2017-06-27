package communication;

public class AddStudentRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int studentID;
	private int classNumber;
	private int courseId;
	private int ERequestType;
	
	
	
	public AddStudentRequest(int studentID, int classNumber, int courseId, int eRequestType) {
		
		this.studentID = studentID;
		this.classNumber = classNumber;
		this.courseId = courseId;
		ERequestType = eRequestType;
	}


	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public int getERequestType() {
		return ERequestType;
	}


	public void setERequestType(int eRequestType) {
		ERequestType = eRequestType;
	}

	

	
	
	
}
