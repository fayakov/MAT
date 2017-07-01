package communication;

import java.util.ArrayList;

import entities.ClassWithGrade;

public class GetTeacherStatsResponse extends Message {

	private static final long serialVersionUID = 1L;
	
	private ArrayList<ClassWithGrade> stats;

	public GetTeacherStatsResponse(ArrayList<ClassWithGrade> stats) {
		super();
		this.stats = stats;
	}

	public ArrayList<ClassWithGrade> getStats() {
		return stats;
	}

	public void setStats(ArrayList<ClassWithGrade> stats) {
		this.stats = stats;
	}
}
