package entities;

import java.io.Serializable;
import java.io.InputStream;
import java.sql.Date;


//TAL
public class Submission implements Serializable {

	private Date date;
	private int submissionNumber;
	private String fileName;
	private byte[] file;
	private int assignmentNumber;
	
	public Submission(){
	}
	
	public Submission(Date date, int submissionNumber, String fileName,  byte[] assingmeniletFile) 
	{
		//super();
		this.date = date;
		this.submissionNumber = submissionNumber;
		this.file = file;
		this.fileName = fileName;
	}
	
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getAssignmentNumber() {
		return submissionNumber;
	}
	
	public void setAssignmentNumber(int submissionNumber) {
		this.submissionNumber = submissionNumber;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public  byte[]  getFile() {
		return file;
	}
	
	public void setFile( byte[]  file) {
		this.file = file;
	}

}
