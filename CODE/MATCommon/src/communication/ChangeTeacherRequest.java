package communication;

import entities.ERequestType;
import entities.Request;

public class ChangeTeacherRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private Request request;

	public ChangeTeacherRequest(Request request) {
		super();
		this.request = request;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}
	
	
	
}
