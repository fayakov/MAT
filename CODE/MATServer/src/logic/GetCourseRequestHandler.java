
package logic;

import java.io.IOException;
import java.util.ArrayList;
import DAL.CDALError;
import DAL.CDal;
import communication.GetCourseRequest;
import communication.GetCourseResponse;
import communication.Message;
import entities.Request;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class GetCourseHandler.
 */
public class GetCourseRequestHandler implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetCourseRequest getCourseMsg = (GetCourseRequest)msg;
			
		GetCourseResponse res = new GetCourseResponse(CDal.getCourse());
		
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
