package entities;

import java.sql.Date;


//TAL
public class Assignment 
{

	public Date date;
	public int assignmentNumber;
	public E_formatType formatType;
	
	
	public Assignment(Date date, int assignmentNumber, E_formatType formatType) 
	{
		//super();
		this.date = date;
		this.assignmentNumber = assignmentNumber;
		this.formatType = formatType;
	}
	
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getAssignmentNumber() {
		return assignmentNumber;
	}
	
	public void setAssignmentNumber(int assignmentNumber) {
		this.assignmentNumber = assignmentNumber;
	}
	
	public E_formatType getFormatType() {
		return formatType;
	}
	
	public void setFormatType(E_formatType formatType) {
		this.formatType = formatType;
	}
	
	
	
	
	


}
