package entities;

public class ClassCourse {
	
	private int classId, courseId, teacherId;
	
	public ClassCourse(int clid, int coid, int tid) {
		 classId = clid;
		 courseId = coid;
		 teacherId = tid;
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

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

}
