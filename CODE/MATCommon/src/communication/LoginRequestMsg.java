package communication;

public class LoginRequestMsg extends Message {
	private static final long serialVersionUID = 1L;
	
	private int userId;
	private String password;
	private boolean toConnect;
	
	public LoginRequestMsg(int userId, String password, boolean toConnect) {
		this.userId = userId;
		this.password = password;
		this.toConnect = toConnect;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isToConnect() {
		return toConnect;
	}

	public void setToConnect(boolean toConnect) {
		this.toConnect = toConnect;
	}	
}
