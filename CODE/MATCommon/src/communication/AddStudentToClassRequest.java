package communication;

public class AddStudentToClassRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int studentId;
	private int classId;
	
	public AddStudentToClassRequest(int studentId, int classId) {
		this.studentId = studentId;
		this.classId= classId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	
	
	
}
