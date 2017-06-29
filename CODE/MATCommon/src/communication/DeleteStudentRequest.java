package communication;

public class DeleteStudentRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int studentID;
	private int classNumber;
	private int courseId;

	public DeleteStudentRequest(int studentID, int classNumber, int courseId) {
		super();
		this.studentID = studentID;
		this.classNumber = classNumber;
		this.courseId = courseId;
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
}
