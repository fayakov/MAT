package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.GetClassToCoursesStatsRequest;
import communication.GetClassToCoursesStatsResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class GetClassToCoursesStatsRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetClassToCoursesStatsRequest getClassToCoursesStats = (GetClassToCoursesStatsRequest)msg;
		
		/*
		// TODO Check in database
		CDALError error = new CDALError();
		boolean connectionSecceded = false;//CDal.connectUser(getClassToCoursesStats.isToConnect(), getClassToCoursesStats.getUserId(), getClassToCoursesStats.getPassword(), error);		
		
		GetClassToCoursesStatsResponse res = new GetClassToCoursesStatsResponse(connectionSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
