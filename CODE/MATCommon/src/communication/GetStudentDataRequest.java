package communication;

public class GetStudentDataRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private String password;
	
	public GetStudentDataRequest(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
