/*
 * 
 */
package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.*;
import entities.CClass;
import entities.Parent;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class GetClassDataRequestHandler.
 */
public class GetClassDataRequestHandler implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		GetClassDataRequest getClassData = (GetClassDataRequest)msg;
		
		CDALError error = new CDALError();
		CClass classData = CDal.getClassData(getClassData.getClassNumber(), error);		
		
		GetClassDataResponse res = new GetClassDataResponse(classData, error.getString());
		
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
