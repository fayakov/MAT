package entities;

import java.io.Serializable;

public class Request implements Serializable
{

	
	private int requestNumber;
	private int userId;
	private int classNumber;
	private int courseId;
	private boolean isConfirmed;
	private boolean isHandeled;
	private ERequestType requestType;
	
	public Request()
	{
		
	}
	public Request(int requestNumber,int userId, int classNumber, int courseId, boolean isConfirmed, boolean isHandeled) 
	{
		super();
		
		this.requestNumber = requestNumber;
		this.userId = userId;
		this.classNumber = classNumber;
		this.courseId = courseId;
		this.isConfirmed = isConfirmed;
		this.isHandeled = isHandeled;		
	}  
	

	
	public Request(int requestNumber, int userId, int classNumber, int courseId, boolean isConfirmed,
			boolean isHandeled, ERequestType requestType) {
		super();
		this.requestNumber = requestNumber;
		this.userId = userId;
		this.classNumber = classNumber;
		this.courseId = courseId;
		this.isConfirmed = isConfirmed;
		this.isHandeled = isHandeled;
		this.requestType = requestType;
	}




	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getClassNumber() {
		return classNumber;
	}


	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
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
