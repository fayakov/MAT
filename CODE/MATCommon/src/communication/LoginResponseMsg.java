package communication;

import entities.EUserType;

public class LoginResponseMsg extends Message {

	private static final long serialVersionUID = 1L;
	
	private boolean isValidUser;
	private String errText;
	private EUserType userType;
	
	public LoginResponseMsg(boolean connectionSecceded, EUserType eUserType, String errText) {
		super();
		this.isValidUser = connectionSecceded;
		this.errText = errText;
		this.userType = eUserType;
	}
	
	public boolean isValidUser() {
		return isValidUser;
	}
	
	public void setValidUser(boolean isValidUser) {
		this.isValidUser = isValidUser;
	}
	
	public String getErrText() {
		return errText;
	}
	
	public void setErrText(String errText) {
		this.errText = errText;
	}

	public EUserType getUserType() {
		return userType;
	}

	public void setUserType(EUserType userType) {
		this.userType = userType;
	}
	
}
