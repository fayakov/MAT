package communication;

<<<<<<< HEAD
=======
import entities.ERequestType;
import entities.Request;

>>>>>>> master
public class ChangeTeacherRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int teacherID;
	private int classNumber;
<<<<<<< HEAD
	private int courseId;	
=======
	private int courseId;
	private ERequestType requestType;
	private boolean isConfirmed;
	private boolean isHandeled;
	private Request request;
>>>>>>> master
	
	public ChangeTeacherRequest(int teacherID, int classNumber, int courseId) {
		super();
		this.teacherID = teacherID;
		this.classNumber = classNumber;
		this.courseId = courseId;
<<<<<<< HEAD
=======
		this.requestType = requestType;
		this.isConfirmed = isConfirmed;
		this.isHandeled = isHandeled;
		
		this.request = new Request(teacherID, classNumber, courseId, requestType,
				isConfirmed, isHandeled);
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
>>>>>>> master
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
<<<<<<< HEAD
=======


	public ERequestType getRequestType() {
		return requestType;
	}


	public void setRequestType(ERequestType requestType) {
		this.requestType = requestType;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}	
>>>>>>> master
}
