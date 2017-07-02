/*
 * 
 */
package logic;

import java.io.IOException;
import java.util.ArrayList;

import DAL.CDALError;
import DAL.CDal;
import communication.BlockParentRequest;
import communication.BlockParentResponse;
import communication.GetStudentDataResponse;
import communication.Message;
import entities.Student;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class BlockParentRequestHandler.
 */
public class BlockParentRequestHandler implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		BlockParentRequest blockParentRequest = (BlockParentRequest)msg;
		boolean requestSecceded = true;
		ArrayList <Integer>childs = CDal.getParentsChildrens(blockParentRequest.getPid());
		for(int i : childs)
		{
			requestSecceded &= CDal.blockParent(blockParentRequest.getPid(), i, blockParentRequest.toBlock());
		}
		
		
		
		BlockParentResponse res = new BlockParentResponse(requestSecceded, "");
		
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
