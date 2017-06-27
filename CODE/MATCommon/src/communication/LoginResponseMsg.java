package communication;

public class LoginResponseMsg extends Message {

	private static final long serialVersionUID = 1L;
	
	private boolean isValidUser;
	private String errText;
	
	public LoginResponseMsg(boolean isValidUser, String errText) {
		super();
		this.isValidUser = isValidUser;
		this.errText = errText;
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
}