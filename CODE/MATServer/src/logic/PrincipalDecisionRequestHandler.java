package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.PrincipalDecisionRequest;
import communication.PrincipalDecisionResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class PrincipalDecisionRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		PrincipalDecisionRequest principalDecisionMsg = (PrincipalDecisionRequest)msg;
					
		CDALError error = new CDALError();
		boolean connectionSecceded = CDal.setPrincipalDecision(principalDecisionMsg.getRequest(), error);		
		
		PrincipalDecisionResponse res = new PrincipalDecisionResponse(connectionSecceded, principalDecisionMsg.getRequest().getRequestNumber(), error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
