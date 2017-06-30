package communication;

import entities.Parent;

public class GetParentDataResponse extends Message {

	private static final long serialVersionUID = 1L;
	
	private Parent parent;
	private String error;
	
	public GetParentDataResponse(Parent parent, String error) {
		super();

		this.parent = parent;
		this.setError(error);
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}


