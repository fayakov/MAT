package DAL;

public class CDALError {
	private EDALError error;
	
	public CDALError()
	{
		this.error = EDALError.ENoError;
	}
	
	public CDALError(EDALError err)
	{
		this.error = err;
	}
	
	public void serError(EDALError err)
	{
		this.error = err;
	}
	public EDALError getError(){
		return this.error;
	}

	public String getString() {
		// TODO Auto-generated method stub
		// Yinon: Convert error code to string...
		String returnString = "";
		
		if (this.error == EDALError.ETeacherExceedMaxHours)
		{
			returnString = "Teacher Exceeded Max Hours";
		}
		else if (this.error == EDALError.EUserAllreadyConnectedDisconnected)
		{
			returnString = "User allready loogged in to system";
		}
		return returnString;
	}

}
