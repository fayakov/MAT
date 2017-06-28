package communication;

public class GetStudentDataRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private String userId;
	
	
	public GetStudentDataRequest(String userId) {
		this.userId = userId;
		
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	
	
	
}
