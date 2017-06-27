package communication;

import entities.ERequestType;

public class ChangeTeacherRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int teacherID;
	private int classNumber;
	private int courseId;
	private ERequestType requestType;
	private boolean isConfirmed;
	private boolean isHandeled;
	
	
	public ChangeTeacherRequest(int teacherID, int classNumber, int courseId, ERequestType requestType,
			boolean isConfirmed, boolean isHandeled) {
		super();
		this.teacherID = teacherID;
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

	public int getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
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
