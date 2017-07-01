package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.DeleteStudentFromCourseRequest;
import communication.DeleteStudentFromCourseResponse;
import communication.Message;
import entities.ERequestType;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class DeleteStudentFromCourseRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		DeleteStudentFromCourseRequest deleteStudentFromCourseRequestMsg = (DeleteStudentFromCourseRequest)msg;
				
		CDALError error = new CDALError();
		int userId = CDal.getStudentUserId(deleteStudentFromCourseRequestMsg.getStudentId());
		boolean connectionSecceded = CDal.createRequest(ERequestType.removeStudent, userId, deleteStudentFromCourseRequestMsg.getClassId(), deleteStudentFromCourseRequestMsg.getCourseId());
		
		DeleteStudentFromCourseResponse res = new DeleteStudentFromCourseResponse(connectionSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
