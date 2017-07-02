package communication;

import java.util.ArrayList;

import entities.TeacherWithGrade;


/**
 * The Class GetClassTeachersStatsResponse.
 */
public class GetClassTeachersStatsResponse extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The stats. */
	private ArrayList<TeacherWithGrade> stats;

	
	/**
	 * Instantiates a new gets the class teachers stats response.
	 *
	 * @param stats the stats
	 */
	public GetClassTeachersStatsResponse(ArrayList<TeacherWithGrade> stats) {
		super();
		this.stats = stats;
	}


	/**
	 * Gets the stats.
	 *
	 * @return the stats
	 */
	public ArrayList<TeacherWithGrade> getStats() {
		return stats;
	}


	/**
	 * Sets the stats.
	 *
	 * @param stats the new stats
	 */
	public void setStats(ArrayList<TeacherWithGrade> stats) {
		this.stats = stats;
	}
}