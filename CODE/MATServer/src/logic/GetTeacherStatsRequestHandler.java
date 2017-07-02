/*
 * 
 */
package logic;

import java.io.IOException;

import DAL.CDal;
import communication.GetTeacherStatsRequest;
import communication.GetTeacherStatsResponse;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class GetTeacherStatsRequestHandler.
 */
public class GetTeacherStatsRequestHandler implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetTeacherStatsRequest getTeacherStatsRequestMsg = (GetTeacherStatsRequest)msg;
			
		int teahcerId = getTeacherStatsRequestMsg.getTeacherID();
		
		GetTeacherStatsResponse res = new GetTeacherStatsResponse(
				CDal.getTeacherClassesStatistics(teahcerId));
		
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
