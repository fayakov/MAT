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

}
