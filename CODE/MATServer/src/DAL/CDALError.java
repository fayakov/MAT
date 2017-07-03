/*
 * 
 */
package DAL;

/**
 * The Class CDALError represent the available errors return from CDAL.
 */
public class CDALError {
	
	/** The error. */
	private EDALError error;
	
	/**
	 * Instantiates a new CDAL error.
	 */
	public CDALError()
	{
		this.error = EDALError.ENoError;
	}
	
	/**
	 * Instantiates a new CDAL error.
	 *
	 * @param err the err
	 */
	public CDALError(EDALError err)
	{
		this.error = err;
	}
	
	/**
	 * Ser error.
	 *
	 * @param err the err
	 */
	public void serError(EDALError err)
	{
		this.error = err;
	}
	
	/**
	 * Gets the error.
	 *
	 * @return the error
	 */
	public EDALError getError(){
		return this.error;
	}

	/**
	 * Gets the error string represent the error enum of EDALError.
	 *
	 * @return the string
	 */
	public String getString() {
		// Yinon: Convert error code to string... may use switch/case instead of ugly if/else
		String returnString = "";
		
		switch(this.error)
		{
			case ETeacherExceedMaxHours:
			{
				returnString = "Teacher Exceeded Max Hours";
			}
			break;
			case EUserAllreadyConnectedDisconnected:
			{
				returnString = "User allready loogged in to system";
			}
			break;
			case EClassAllreadyExist:
			{
				returnString = "class allready exist";
			}
			default:
			break;
		}
		
		return returnString;
	}

}
