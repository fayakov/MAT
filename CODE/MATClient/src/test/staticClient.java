package test;

import MATGui.loginController;
import entities.EUserType;

public class staticClient {
	private loginController loginCont = null;
	public void sendReq(int id, String password){
		System.out.println("sendReq " + id + password);
		loginCont.getLogInResault(true, false , false );
	}
	public void setLogin(loginController login)
	{
		loginCont= login;
	}
}
