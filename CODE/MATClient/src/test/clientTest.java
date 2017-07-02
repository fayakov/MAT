package test;

/**
 * The Class clientTest.
 */
public class clientTest{
	
	/** The num. */
	int num;
	
	/** The static controller. */
	public static staticClient staticController = null;
    
	/**
	 * Sets the nums.
	 *
	 * @param number the new nums
	 */
	public void setNums(int number){
		num = number;
	}
	
	/**
	 * Start client.
	 */
	public void startClient()
	{
		staticController = new staticClient();
	}
}

