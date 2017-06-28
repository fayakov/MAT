package communication;

import java.sql.Date;

public class OpenSemesterRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	Date startDate, endDate;

	
	public OpenSemesterRequest(Date sDate, Date eDate) {
		this.startDate = sDate;
		this.endDate = eDate;
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
