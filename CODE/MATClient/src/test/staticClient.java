package test;

import controller.loginController;
import entities.EUserType;

/**
 * The Class staticClient.
 */
public class staticClient {
	
	/** The login cont. */
	private loginController loginCont = null;
	
	/**
	 * Send req.
	 *
	 * @param id the id
	 * @param password the password
	 */
	public void sendReq(int id, String password){
		System.out.println("sendReq " + id + password);
		loginCont.getLogInResault(true, false , false );
	}
	
	/**
	 * Sets the login.
	 *
	 * @param login the new login
	 */
	public void setLogin(loginController login)
	{
		loginCont= login;
	}
}
