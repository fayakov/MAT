package communication;

public class GetStudentDataRequest extends Message 
{
	private static final long serialVersionUID = 1L;
	
	private int userId;
	
	public GetStudentDataRequest(int userId) {
		this.userId = userId;
		
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
