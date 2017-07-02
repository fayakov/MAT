package communication;


/**
 * The Class LoginRequestMsg.
 */
public class LoginRequestMsg extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The user id. */
	private int userId;
	
	/** The password. */
	private String password;
	
	/** The to connect. */
	private boolean toConnect;
	
	/**
	 * Instantiates a new login request msg.
	 *
	 * @param userId the user id
	 * @param password the password
	 * @param toConnect the to connect
	 */
	public LoginRequestMsg(int userId, String password, boolean toConnect) {
		this.userId = userId;
		this.password = password;
		this.toConnect = toConnect;
	}
	
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Checks if is to connect.
	 *
	 * @return true, if is to connect
	 */
	public boolean isToConnect() {
		return toConnect;
	}

	/**
	 * Sets the to connect.
	 *
	 * @param toConnect the new to connect
	 */
	public void setToConnect(boolean toConnect) {
		this.toConnect = toConnect;
	}	
}
