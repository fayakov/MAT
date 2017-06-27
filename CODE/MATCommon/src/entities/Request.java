package entities;

import java.io.Serializable;

public class Request implements Serializable
{

	private int requestNumber;
	private User userid;
	private CClass classNumber;
	private Course courseId;
	private boolean isConfirmed;
	private boolean isHandeled;
	private ERequestType requestType;
	
	
	public Request() 
	{
		super();
	
	}  
	

	
	public Request(int requestNumber, User userid, CClass classNumber, Course courseId, boolean isConfirmed,
			boolean isHandeled, ERequestType requestType) {
		super();
		this.requestNumber = requestNumber;
		this.userid = userid;
		this.classNumber = classNumber;
		this.courseId = courseId;
		this.isConfirmed = isConfirmed;
		this.isHandeled = isHandeled;
		this.requestType = requestType;
	}




	public User getUserid() {
		return userid;
	}


	public void setUserid(User userid) {
		this.userid = userid;
	}


	public CClass getClassNumber() {
		return classNumber;
	}


	public void setClassNumber(CClass classNumber) {
		this.classNumber = classNumber;
	}


	public Course getCourseId() {
		return courseId;
	}


	public void setCourseId(Course courseId) {
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
