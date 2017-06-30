package communication;

public class GetStudentDataRequest extends Message 
{
	private static final long serialVersionUID = 1L;
	
	private int studentId;
	
	
	public GetStudentDataRequest(int studentId) {
		this.studentId = studentId;
		
	}
	
	public int getUserId() {
		return studentId;
	}

	public void setUserId(int studentId) {
		this.studentId = studentId;
	}


	
	
	
}
