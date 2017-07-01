package logic;

import java.io.IOException;

import DAL.CDALError;
import DAL.CDal;
import communication.PrincipalDecisionRequest;
import communication.PrincipalDecisionResponse;
import entities.ERequestType;
import entities.Request;
import communication.Message;
import ocsf.server.ConnectionToClient;
import utils.Handler;

public class PrincipalDecisionRequestHandler implements Handler {

	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		PrincipalDecisionRequest principalDecisionMsg = (PrincipalDecisionRequest)msg;
					
		Request request = principalDecisionMsg.getRequest();
		boolean requestSecceded = false;		
		
		if (!principalDecisionMsg.isToApprove()) {
			requestSecceded = CDal.confirmRequest(request.getRequestNumber(), false);
		}
		else {
			if (request.getRequestType() == ERequestType.addStudent) {
				requestSecceded = CDal.addStudentToCourseWithClass(request.getCourseId(), request.getClassNumber(), request.getUserId());
			}
			else if (request.getRequestType() == ERequestType.changeTeacher) {
				requestSecceded = CDal.changeTeacherToCourseInClass(request.getClassNumber(), request.getCourseId(), request.getUserId());
			}
			else if (request.getRequestType() == ERequestType.removeStudent) {
				requestSecceded = CDal.removeStudentFromCourseWithClass(request.getCourseId(), request.getClassNumber(), request.getUserId());
			}		
			
			if (requestSecceded) {
				requestSecceded = CDal.confirmRequest(request.getRequestNumber(), true);
			}
		}
		
		PrincipalDecisionResponse res = new PrincipalDecisionResponse(requestSecceded, request.getRequestNumber(), "");
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
