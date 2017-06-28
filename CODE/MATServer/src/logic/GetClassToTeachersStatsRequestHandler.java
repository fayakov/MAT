package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.LoginRequestMsg;
import communication.LoginResponseMsg;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class GetClassToTeachersStatsRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		LoginRequestMsg loginMsg = (LoginRequestMsg)msg;
		
		System.out.println("User ID:\t" + loginMsg.getUserId());
		System.out.println("User Password:\t" + loginMsg.getPassword());
		
		// TODO Check in database
		CDALError error = new CDALError();
		boolean connectionSecceded = CDal.connectUser(loginMsg.isToConnect(), loginMsg.getUserId(), loginMsg.getPassword(), error);		
		
		LoginResponseMsg res = new LoginResponseMsg(connectionSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
