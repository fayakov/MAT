package communication;

import java.util.ArrayList;

public class DefineCourseRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int courseId, tUnit;
	private String courseName;
	ArrayList<Integer> pre;
	
	public DefineCourseRequest(int courseId, String courseName, int tUnit, ArrayList<Integer> pre) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.tUnit = tUnit;
		this.pre = pre;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int gettUnit() {
		return tUnit;
	}

	public void settUnit(int tUnit) {
		this.tUnit = tUnit;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public ArrayList<Integer> getPre() {
		return pre;
	}

	public void setPre(ArrayList<Integer> pre) {
		this.pre = pre;
	}
	
}
