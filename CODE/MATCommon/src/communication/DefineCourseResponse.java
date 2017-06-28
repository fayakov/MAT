package communication;

public class DefineCourseResponse extends Message {

private static final long serialVersionUID = 1L;
	
	boolean isSucceeded;
	String requestId;	
	private String errText;
	
	
	public Boolean actionSucceed(){	
		return isSucceeded;
	}
	
	public String getErrText() {
		return errText;
	}
}
