package logic;

import java.io.IOException;

import communication.LoginRequestMsg;
import communication.LoginResponseMsg;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class LoginRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		LoginRequestMsg loginMsg = (LoginRequestMsg)msg;
		
		System.out.println("User ID:\t" + loginMsg.getUserId());
		System.out.println("User Password:\t" + loginMsg.getPassword());
		
		// TODO Check in database
		
		LoginResponseMsg res = new LoginResponseMsg(false, "Invalid username or password");
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
