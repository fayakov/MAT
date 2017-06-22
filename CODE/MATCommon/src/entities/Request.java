package entities;

import java.io.Serializable;

public class Request implements Serializable
{

	private int requestNumber;
	private boolean isConfirmed;
	private boolean isHandeled;
	private ERequestType requestType;
	
	
	public Request() 
	{
		super();
	
	}  
	
	
	public Request(int requestNumber, boolean isConfirmed, boolean isHandeled, ERequestType requestType) 
	{
		super();
		this.requestNumber = requestNumber;
		this.isConfirmed = isConfirmed;
		this.isHandeled = isHandeled;
		this.requestType = requestType;
	}


	
	public int getRequestNumber() {
		return requestNumber;
	}


	public void setRequestNumber(int requestNumber) {
		this.requestNumber = requestNumber;
	}


	public boolean isConfirmed() {
		return isConfirmed;
	}


	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}


	public boolean isHandeled() {
		return isHandeled;
	}


	public void setHandeled(boolean isHandeled) {
		this.isHandeled = isHandeled;
	}


	public ERequestType getRequestType() {
		return requestType;
	}


	public void setRequestType(ERequestType requestType) {
		this.requestType = requestType;
	}



	
	
	
}
