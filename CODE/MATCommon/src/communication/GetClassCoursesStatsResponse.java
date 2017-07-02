package communication;

import java.util.ArrayList;

import entities.CourseWithGrade;


/**
 * The Class GetClassCoursesStatsResponse.
 */
public class GetClassCoursesStatsResponse extends Message {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The stats. */
	private ArrayList<CourseWithGrade> stats;

	
	/**
	 * Instantiates a new gets the class courses stats response.
	 *
	 * @param stats the stats
	 * @param errText the err text
	 */
	public GetClassCoursesStatsResponse(ArrayList<CourseWithGrade> stats, String errText) {
		super();
		this.stats = stats;
	}

	/**
	 * Gets the stats.
	 *
	 * @return the stats
	 */
	public ArrayList<CourseWithGrade> getStats() {
		return stats;
	}

	/**
	 * Sets the stats.
	 *
	 * @param stats the new stats
	 */
	public void setStats(ArrayList<CourseWithGrade> stats) {
		this.stats = stats;
	}

		
}
