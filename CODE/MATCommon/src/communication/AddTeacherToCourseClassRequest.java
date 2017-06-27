package communication;

public class AddTeacherToCourseClassRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int teacherId, courseId, classId;

	
	public AddTeacherToCourseClassRequest(int tid, int coid, int clid) {
		teacherId = tid;
		courseId = coid;
		classId = clid;
	}


	public int getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public int getClassId() {
		return classId;
	}


	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	
}
