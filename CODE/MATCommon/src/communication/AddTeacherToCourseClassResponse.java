package communication;

public class AddTeacherToCourseClassResponse extends Message {

private static final long serialVersionUID = 1L;
	
	boolean isSucceeded;
	String requestId;	
	private String errText;
	
	public AddTeacherToCourseClassResponse(boolean isSucceeded, String eror) {
		this.isSucceeded = isSucceeded;
		this.errText = eror;
	}
	
	
	public Boolean actionSucceed(){	
		return isSucceeded;
	}
	
	public String getErrText() {
		return errText;
	}
	
}
