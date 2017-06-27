package communication;

import java.time.LocalDate;

public class OpenSemesterRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private String semName;
	LocalDate sDate, eDate;

	
	public OpenSemesterRequest(String semName, LocalDate sDate, LocalDate eDate) {
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


	public LocalDate getsDate() {
		return sDate;
	}


	public void setsDate(LocalDate sDate) {
		this.sDate = sDate;
	}


	public LocalDate geteDate() {
		return eDate;
	}


	public void seteDate(LocalDate eDate) {
		this.eDate = eDate;
	}
	
}
