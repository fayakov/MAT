package communication;

import entities.ERequestType;

public class GetPendingRequestsRequest extends Message {
	private static final long serialVersionUID = 1L;

	
	private ERequestType requestType;
	
	
	public GetPendingRequestsRequest(ERequestType requestType) 
	{
		super();
		this.requestType = requestType;
	}


	public ERequestType getRequestType() {
		return requestType;
	}


	public void setRequestType(ERequestType requestType) {
		this.requestType = requestType;
	}
	
	
	
	
}
