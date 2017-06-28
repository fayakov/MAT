package communication;

public class LoginResponseMsg extends Message {

	private static final long serialVersionUID = 1L;
	
	private boolean isValidUser;
	private String errText;
	private int entityNum;
	
	public LoginResponseMsg(boolean connectionSecceded, String errText) {
		super();
		this.isValidUser = connectionSecceded;
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
	public int instance() {
		return entityNum;
	}
}
