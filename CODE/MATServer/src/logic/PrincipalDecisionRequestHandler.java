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
					
		//CDALError error = new CDALError();
		Request request = CDal.getRequest(principalDecisionMsg.getRequest().getRequestNumber());
		boolean requestSecceded = false;		
		
		if (request.getRequestType() == ERequestType.addStudent)
		{
			requestSecceded = CDal.addStudentToCourseWithClass(principalDecisionMsg.getRequest().getCourseId(), principalDecisionMsg.getRequest().getClassNumber(), principalDecisionMsg.getRequest().getUserid());
		}
		else if (request.getRequestType() == ERequestType.changeTeacher)
		{
			requestSecceded = CDal.changeTeacherToCourseInClass(principalDecisionMsg.getRequest().getClassNumber(), principalDecisionMsg.getRequest().getCourseId(), principalDecisionMsg.getRequest().getUserid());
		}
		else if (request.getRequestType() == ERequestType.removeStudent)
		{
			requestSecceded = CDal.removeStudentFromCourseWithClass(principalDecisionMsg.getRequest().getCourseId(), principalDecisionMsg.getRequest().getClassNumber(), principalDecisionMsg.getRequest().getUserid());
		}		
		
		if (requestSecceded)
		{
			requestSecceded = CDal.confirmRequest(principalDecisionMsg.getRequest().getRequestNumber(), true);
		}
		
		PrincipalDecisionResponse res = new PrincipalDecisionResponse(requestSecceded, principalDecisionMsg.getRequest().getRequestNumber(), "");//error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
