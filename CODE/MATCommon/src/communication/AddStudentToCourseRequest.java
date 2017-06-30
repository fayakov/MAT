package communication;


import entities.Request;

public class AddStudentToCourseRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private Request request;
	
	

	public AddStudentToCourseRequest(Request request) {
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