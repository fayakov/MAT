package communication;

public class GetAssignmentsOfTeacherRequest extends Message 
{


private static final long serialVersionUID = 1L;
	
	private int teacherID;
	
	
	public GetAssignmentsOfTeacherRequest(int teacherID) {
		super();
		this.teacherID = teacherID;
	}
	
	

	public int getTeacherID() {
		return teacherID;
	}


	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
