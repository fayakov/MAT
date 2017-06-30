package communication;

import java.util.ArrayList;

import entities.TeacherWithGrade;

public class GetClassTeachersStatsResponse extends Message {
	private static final long serialVersionUID = 1L;

	private ArrayList<TeacherWithGrade> stats;

	public GetClassTeachersStatsResponse(ArrayList<TeacherWithGrade> stats) {
		super();
		this.stats = stats;
	}

	public ArrayList<TeacherWithGrade> getStats() {
		return stats;
	}

	public void setStats(ArrayList<TeacherWithGrade> stats) {
		this.stats = stats;
	}
}
