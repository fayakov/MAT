/*
 * 
 */
package logic;

import java.io.IOException;

import DAL.CDal;
import communication.GetClassTeachersStatsRequest;
import communication.GetClassTeachersStatsResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class GetClassTeachersStatsRequestHandler.
 */
public class GetClassTeachersStatsRequestHandler  implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
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
