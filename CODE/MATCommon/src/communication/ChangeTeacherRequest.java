package communication;

public class ChangeTeacherRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int teacherID;
	private int classNumber;
	private int courseId;	
	
	public ChangeTeacherRequest(int teacherID, int classNumber, int courseId) {
		super();
		this.teacherID = teacherID;
		this.classNumber = classNumber;
		this.courseId = courseId;
	}

	public int getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
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
