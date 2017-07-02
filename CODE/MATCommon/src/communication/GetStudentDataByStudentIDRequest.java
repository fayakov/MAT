package communication;

public class GetStudentDataByStudentIDRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int studentId;
	
	public GetStudentDataByStudentIDRequest(int studentId) {
		this.studentId = studentId;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
