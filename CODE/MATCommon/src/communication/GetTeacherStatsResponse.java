package communication;

import java.util.ArrayList;

import entities.ClassWithGrade;


/**
 * The Class GetTeacherStatsResponse.
 */
public class GetTeacherStatsResponse extends Message {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The stats. */
	private ArrayList<ClassWithGrade> stats;

	/**
	 * Instantiates a new gets the teacher stats response.
	 *
	 * @param stats the stats
	 */
	public GetTeacherStatsResponse(ArrayList<ClassWithGrade> stats) {
		super();
		this.stats = stats;
	}

	/**
	 * Gets the stats.
	 *
	 * @return the stats
	 */
	public ArrayList<ClassWithGrade> getStats() {
		return stats;
	}

	/**
	 * Sets the stats.
	 *
	 * @param stats the new stats
	 */
	public void setStats(ArrayList<ClassWithGrade> stats) {
		this.stats = stats;
	}
}
