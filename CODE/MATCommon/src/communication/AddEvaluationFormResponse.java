package communication;

public class AddEvaluationFormResponse extends Message 
{
	
	private boolean isSucceed;
	private String errText;
	
	
public AddEvaluationFormResponse(boolean isSucceed, String errText) 
{
		super();
		this.isSucceed = isSucceed;
		this.errText = errText;
	}


private static final long serialVersionUID = 1L;
	
	
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
