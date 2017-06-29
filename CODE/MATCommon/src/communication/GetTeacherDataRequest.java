package communication;

public class GetTeacherDataRequest extends Message {
	private static final long serialVersionUID = 1L;
	
<<<<<<< HEAD
	private int teacherID;

	public GetTeacherDataRequest(int teacherID) {
		super();
		this.teacherID = teacherID;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}	
=======
	private int TeacherId;

	public GetTeacherDataRequest(int teacherId) {
		super();
		TeacherId = teacherId;
	}

	public int getTeacherId() {
		return TeacherId;
	}

	public void setTeacherId(int teacherId) {
		TeacherId = teacherId;
	}
	
	
>>>>>>> master
	
	
}
