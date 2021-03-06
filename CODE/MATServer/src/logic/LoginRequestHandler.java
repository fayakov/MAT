/*
 * 
 */
package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.LoginRequestMsg;
import communication.LoginResponseMsg;
import communication.MATServerController;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class LoginRequestHandler.
 */
public class LoginRequestHandler implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		LoginRequestMsg loginMsg = (LoginRequestMsg)msg;
		
		System.out.println("User ID:\t" + loginMsg.getUserId());
		System.out.println("User Password:\t" + loginMsg.getPassword());
		
		// TODO Check in database
		CDALError error = new CDALError();
		boolean connectionSecceded = CDal.connectUser(loginMsg.isToConnect(), loginMsg.getUserId(), loginMsg.getPassword(), error);		
				
		if (connectionSecceded) {
			MATServerController.getInstance();
			MATServerController.setCurrentLoggedInUserId(loginMsg.isToConnect() ? loginMsg.getUserId() : 0);
			MATServerController.setCurrentLoggedInUserPassword(loginMsg.isToConnect() ? loginMsg.getPassword() : "");
		}
		
		LoginResponseMsg res = new LoginResponseMsg(connectionSecceded, CDal.getUserType(loginMsg.getUserId()), error.getString());
		
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
