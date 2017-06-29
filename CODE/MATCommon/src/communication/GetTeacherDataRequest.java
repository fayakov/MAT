package communication;

public class GetTeacherDataRequest extends Message {
	private static final long serialVersionUID = 1L;
	
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
	
	
	
	
}
