package communication;

import entities.ERequestType;

public class AddStudentToCourseRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int studentID;
	private int classNumber;
	private int courseId;
	private ERequestType requestType;
	private boolean isConfirmed;
	private boolean isHandeled;
	


	public AddStudentToCourseRequest(int studentID, int classNumber, int courseId, ERequestType requestType,
			boolean isConfirmed, boolean isHandeled) {
		super();
		this.studentID = studentID;
		this.classNumber = classNumber;
		this.courseId = courseId;
		this.requestType = requestType;
		this.isConfirmed = isConfirmed;
		this.isHandeled = isHandeled;
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

	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
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


	public ERequestType getRequestType() {
		return requestType;
	}


	public void setRequestType(ERequestType requestType) {
		this.requestType = requestType;
	}


	

	
	
	
}
