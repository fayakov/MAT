package logic;

import java.io.IOException;

import DAL.CDal;
import communication.GetClassTeachersStatsRequest;
import communication.GetClassTeachersStatsResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class GetClassTeachersStatsRequestHandler  implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetClassTeachersStatsRequest getClassToCoursesStats = (GetClassTeachersStatsRequest)msg;
		
		GetClassTeachersStatsResponse res = new GetClassTeachersStatsResponse(
				CDal.getClassTeacherStatistics(getClassToCoursesStats.getClassNumber()));
		
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
