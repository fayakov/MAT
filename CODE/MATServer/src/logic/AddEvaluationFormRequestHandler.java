package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.AddEvaluationFormRequest;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class AddEvaluationFormRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		AddEvaluationFormRequest AddAssignmentForStudentMsg = (AddEvaluationFormRequest)msg;
				
		CDALError error = new CDALError();
		/*boolean connectionSecceded = false; //CDal.connectUser(AddAssignmentForStudentMsg.isToConnect(), AddAssignmentForStudentMsg.getUserId(), AddAssignmentForStudentMsg.getPassword(), error);		
		
		AddAssignmentForStudentResponseMsg res = new AddAssignmentForStudentResponse(connectionSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
