package communication;

import entities.ERequestType;
import entities.Request;

public class ChangeTeacherRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int teacherId, classId, courseId;

	public ChangeTeacherRequest(int teacherId, int classId, int courseId) {
		super();
		this.teacherId = teacherId;
		this.classId = classId;
		this.courseId = courseId;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	
}