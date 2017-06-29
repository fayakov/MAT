package communication;

public class AddCheckAssignmentResponse extends Message 
{
	
	private boolean isSucceed;
	private String errText;
	
	
	public AddCheckAssignmentResponse(boolean isSucceed, String errText) 
	{
		super();
		this.isSucceed = isSucceed;
		this.errText = errText;
	}
	
	

	public boolean isSucceed() {
		return isSucceed;
	}
	
	public void setSucceed(boolean isSucceed) {
		this.isSucceed = isSucceed;
	}
	public String getErrText() {
		return errText;
	}
	public void setErrText(String errText) {
		this.errText = errText;
	}

}
