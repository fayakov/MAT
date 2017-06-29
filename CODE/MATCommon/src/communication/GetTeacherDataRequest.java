package communication;

public class GetTeacherDataRequest extends Message {
	private static final long serialVersionUID = 1L;
	
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
	
}
