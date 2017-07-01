package communication;

import entities.ERequestType;
import entities.Request;

public class DeleteStudentFromCourseRequest extends Message {
	private static final long serialVersionUID = 1L;

	private int studentId, classId, courseId;
	
	public DeleteStudentFromCourseRequest(int studentId, int classId, int courseId) {
		super();
		this.studentId = studentId;
		this.classId = classId;
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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