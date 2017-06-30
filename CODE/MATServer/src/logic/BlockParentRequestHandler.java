package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.BlockParentRequest;
import communication.BlockParentResponse;
import communication.GetStudentDataResponse;
import communication.Message;
import entities.Student;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class BlockParentRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		BlockParentRequest blockParentRequest = (BlockParentRequest)msg;
		
		
		boolean requestSecceded = CDal.blockParent(blockParentRequest.getPid(), true);
		
		BlockParentResponse res = new BlockParentResponse(requestSecceded, "");
		
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
