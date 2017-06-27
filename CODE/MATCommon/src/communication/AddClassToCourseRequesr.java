package communication;

public class AddClassToCourseRequesr extends Message {
	private static final long serialVersionUID = 1L;
	
	private int classId;
	private int courseId;
	
	public AddClassToCourseRequesr(int classId, int courseId) {
		this.classId = classId;
		this.courseId = courseId;
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
