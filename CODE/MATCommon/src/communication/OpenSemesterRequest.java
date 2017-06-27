package communication;

import java.util.Date;

public class OpenSemesterRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private String semName;
	Date sDate, eDate;

	
	public OpenSemesterRequest(String semName, Date sDate, Date eDate) {
		this.semName = semName;
		this.sDate = sDate;
		this.eDate = eDate;
	}


	public String getSemName() {
		return semName;
	}


	public void setSemName(String semName) {
		this.semName = semName;
	}


	public Date getsDate() {
		return sDate;
	}


	public void setsDate(Date sDate) {
		this.sDate = sDate;
	}


	public Date geteDate() {
		return eDate;
	}


	public void seteDate(Date eDate) {
		this.eDate = eDate;
	}

	
	
	
	
}
