package communication;

import entities.EUserType;


/**
 * The Class LoginResponseMsg.
 */
public class LoginResponseMsg extends Message {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The is valid user. */
	private boolean isValidUser;
	
	/** The err text. */
	private String errText;
	
	/** The user type. */
	private EUserType userType;
	
	/**
	 * Instantiates a new login response msg.
	 *
	 * @param connectionSecceded the connection secceded
	 * @param eUserType the e user type
	 * @param errText the err text
	 */
	public LoginResponseMsg(boolean connectionSecceded, EUserType eUserType, String errText) {
		super();
		this.isValidUser = connectionSecceded;
		this.errText = errText;
		this.userType = eUserType;
	}
	
	/**
	 * Checks if is valid user.
	 *
	 * @return true, if is valid user
	 */
	public boolean isValidUser() {
		return isValidUser;
	}
	
	/**
	 * Sets the valid user.
	 *
	 * @param isValidUser the new valid user
	 */
	public void setValidUser(boolean isValidUser) {
		this.isValidUser = isValidUser;
	}
	
	/**
	 * Gets the err text.
	 *
	 * @return the err text
	 */
	public String getErrText() {
		return errText;
	}
	
	/**
	 * Sets the err text.
	 *
	 * @param errText the new err text
	 */
	public void setErrText(String errText) {
		this.errText = errText;
	}

	/**
	 * Gets the user type.
	 *
	 * @return the user type
	 */
	public EUserType getUserType() {
		return userType;
	}

	/**
	 * Sets the user type.
	 *
	 * @param userType the new user type
	 */
	public void setUserType(EUserType userType) {
		this.userType = userType;
	}
	
}
