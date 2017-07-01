package communication;

public class GetTeacherStatsRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int teacherID;

	public GetTeacherStatsRequest(int teacherID) {
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
