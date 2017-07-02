package communication;

import java.util.ArrayList;

public class DefineCourseRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	String courseName;
	private int teachingUnit;
	private int teachingHours;
	
	public DefineCourseRequest(String courseName, int teachingHours, int teachingUnit) {
		this.courseName = courseName;
		this.teachingHours = teachingHours;
		this.teachingUnit = teachingUnit;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getTeachingUnit() {
		return teachingUnit;
	}

	public void setTeachingUnit(int teachingUnit) {
		this.teachingUnit = teachingUnit;
	}

	public int getTeachingHours() {
		return teachingHours;
	}

	public void setTeachingHours(int teachingHours) {
		this.teachingHours = teachingHours;
	}

	
}
