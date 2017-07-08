
package communication;

import java.util.ArrayList;

import entities.Course;
import entities.Request;


/**
 * The Class GetCourseResponse.
 */
public class GetCourseResponse extends Message {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The course requests. */
	ArrayList<Course> preCourse;
	
	/**
	 * Instantiates a new gets the course response.
	 *
	 * @param  the course requests
	 */
	public GetCourseResponse(ArrayList<Course> preCourse) {
		super();
		this.preCourse = preCourse;
	}
	/**
	 * Gets the course requests.
	 *
	 * @return the course requests
	 */

	public ArrayList<Course> getPreCourse() {
		return preCourse;
	}

	/**
	 * Sets the course requests.
	 *
	 * @param  the new course requests
	 */
	public void setPreCourse(ArrayList<Course> preCourse) {
		this.preCourse = preCourse;
	}




}
