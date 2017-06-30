package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.GetTeacherToClassesStatsRequest;
import communication.GetTeacherToClassesStatsResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class GetTeacherToClassesStatsRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetTeacherToClassesStatsRequest getTeacherToClassesStats = (GetTeacherToClassesStatsRequest)msg;
		
		/*
		// TODO Check in database
		CDALError error = new CDALError();
		boolean connectionSecceded = false;//CDal.connectUser(getTeacherToClassesStats.isToConnect(), getTeacherToClassesStats.getUserId(), getTeacherToClassesStats.getPassword(), error);		
		
		GetTeacherToClassesStatsResponse res = new GetTeacherToClassesStatsResponse(connectionSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
