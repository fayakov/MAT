package communication;

import java.util.ArrayList;

import entities.TeacherWithGrade;

public class GetClassTeachersStatsResponse extends Message {
	private static final long serialVersionUID = 1L;

	private ArrayList<TeacherWithGrade> stats;
	private String errText;

	
	public GetClassTeachersStatsResponse(ArrayList<TeacherWithGrade> stats, String errText) {
		super();
		this.stats = stats;
		this.errText = errText;
	}


	public ArrayList<TeacherWithGrade> getStats() {
		return stats;
	}


	public void setStats(ArrayList<TeacherWithGrade> stats) {
		this.stats = stats;
	}


	public String getErrText() {
		return errText;
	}


	public void setErrText(String errText) {
		this.errText = errText;
	}

	
	
}