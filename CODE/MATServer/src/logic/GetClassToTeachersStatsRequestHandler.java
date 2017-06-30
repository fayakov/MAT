package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.GetClassToTeachersStatsRequest;
import communication.GetClassToTeachersStatsResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class GetClassToTeachersStatsRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetClassToTeachersStatsRequest getClassToTeachersStats = (GetClassToTeachersStatsRequest)msg;
		
		/*
		// TODO Check in database
		CDALError error = new CDALError();
		boolean connectionSecceded = false;//CDal.connectUser(getClassToTeachersStats.isToConnect(), getClassToTeachersStats.getUserId(), getClassToTeachersStats.getPassword(), error);		
		
		GetClassToTeachersStatsResponse res = new GetClassToTeachersStatsResponse(connectionSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
