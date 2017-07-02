package communication;

import java.sql.Date;


/**
 * The Class OpenSemesterRequest.
 */
public class OpenSemesterRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The end date. */
	Date startDate, endDate;
	
	/** The name. */
	String name;
	
	/**
	 * Instantiates a new open semester request.
	 *
	 * @param sDate the s date
	 * @param eDate the e date
	 */
	public OpenSemesterRequest(Date sDate, Date eDate) {
	//	this.name = name;
		this.startDate = sDate;
		this.endDate = eDate;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the start date.
	 *
	 * @return the start date
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start date.
	 *
	 * @param startDate the new start date
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the end date.
	 *
	 * @return the end date
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Sets the end date.
	 *
	 * @param endDate the new end date
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
