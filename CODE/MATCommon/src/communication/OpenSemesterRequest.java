package communication;

import java.sql.Date;

public class OpenSemesterRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	Date startDate, endDate;
	String name;
	
	public OpenSemesterRequest(String name, Date sDate, Date eDate) {
		this.name = name;
		this.startDate = sDate;
		this.endDate = eDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
