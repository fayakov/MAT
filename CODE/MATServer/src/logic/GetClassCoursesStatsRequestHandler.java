package logic;

import java.io.IOException;

import DAL.CDal;
import communication.GetClassCoursesStatsRequest;
import communication.GetClassCoursesStatsResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class GetClassCoursesStatsRequestHandler implements Handler {

	@Override
	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetClassCoursesStatsRequest getClassToCoursesStats = (GetClassCoursesStatsRequest)msg;
		
		GetClassCoursesStatsResponse res = new GetClassCoursesStatsResponse(
				CDal.getClassesCoursesStatistics(getClassToCoursesStats.getClassNumber()));
		
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
