package communication;

import java.util.ArrayList;

import entities.CourseWithGrade;

public class GetClassCoursesStatsResponse extends Message {

	private static final long serialVersionUID = 1L;

	private ArrayList<CourseWithGrade> stats;
	private String errText;
	
	public GetClassCoursesStatsResponse(ArrayList<CourseWithGrade> stats, String errText) {
		super();
		this.stats = stats;
		this.errText = errText;
	}

	public ArrayList<CourseWithGrade> getStats() {
		return stats;
	}

	public void setStats(ArrayList<CourseWithGrade> stats) {
		this.stats = stats;
	}

	public String getErrText() {
		return errText;
	}

	public void setErrText(String errText) {
		this.errText = errText;
	}


		
}
