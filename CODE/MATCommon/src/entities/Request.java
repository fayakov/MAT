package entities;

import java.io.Serializable;


/**
 * The Class Request.
 */
public class Request implements Serializable
{

	
	/** The request number. */
	private int requestNumber;
	
	/** The user id. */
	private int userId;
	
	/** The class number. */
	private int classNumber;
	
	/** The course id. */
	private int courseId;
	
	/** The is confirmed. */
	private boolean isConfirmed;
	
	/** The is handeled. */
	private boolean isHandeled;
	
	/** The request type. */
	private ERequestType requestType;
	
	/**
	 * Instantiates a new request.
	 */
	public Request()
	{
		
	}
	
	/**
	 * Instantiates a new request.
	 *
	 * @param requestNumber the request number
	 * @param userId the user id
	 * @param classNumber the class number
	 * @param courseId the course id
	 * @param isConfirmed the is confirmed
	 * @param isHandeled the is handeled
	 */
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
	

	
	/**
	 * Instantiates a new request.
	 *
	 * @param requestNumber the request number
	 * @param userId the user id
	 * @param classNumber the class number
	 * @param courseId the course id
	 * @param isConfirmed the is confirmed
	 * @param isHandeled the is handeled
	 * @param requestType the request type
	 */
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




	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserId() {
		return userId;
	}


	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}


	/**
	 * Gets the class number.
	 *
	 * @return the class number
	 */
	public int getClassNumber() {
		return classNumber;
	}


	/**
	 * Sets the class number.
	 *
	 * @param classNumber the new class number
	 */
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}


	/**
	 * Gets the course id.
	 *
	 * @return the course id
	 */
	public int getCourseId() {
		return courseId;
	}


	/**
	 * Sets the course id.
	 *
	 * @param courseId the new course id
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	/**
	 * Gets the request number.
	 *
	 * @return the request number
	 */
	public int getRequestNumber() {
		return requestNumber;
	}


	/**
	 * Sets the request number.
	 *
	 * @param requestNumber the new request number
	 */
	public void setRequestNumber(int requestNumber) {
		this.requestNumber = requestNumber;
	}


	/**
	 * Checks if is confirmed.
	 *
	 * @return true, if is confirmed
	 */
	public boolean isConfirmed() {
		return isConfirmed;
	}


	/**
	 * Sets the confirmed.
	 *
	 * @param isConfirmed the new confirmed
	 */
	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}


	/**
	 * Checks if is handeled.
	 *
	 * @return true, if is handeled
	 */
	public boolean isHandeled() {
		return isHandeled;
	}


	/**
	 * Sets the handeled.
	 *
	 * @param isHandeled the new handeled
	 */
	public void setHandeled(boolean isHandeled) {
		this.isHandeled = isHandeled;
	}


	/**
	 * Gets the request type.
	 *
	 * @return the request type
	 */
	public ERequestType getRequestType() {
		return requestType;
	}


	/**
	 * Sets the request type.
	 *
	 * @param requestType the new request type
	 */
	public void setRequestType(ERequestType requestType) {
		this.requestType = requestType;
	}



	
	
	
}
