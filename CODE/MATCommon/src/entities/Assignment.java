package entities;

import java.io.InputStream;
import java.sql.Date;


//TAL
public class Assignment 
{

	private Date date;
	private int assignmentNumber;
	private String fileName;
	private byte[] assingmentFile;
	private String fileType;
	
	public Assignment(){
	}
	
	public Assignment(Date date, int assignmentNumber, String fileName,  byte[] assingmentFile) 
	{
		//super();
		this.date = date;
		this.assignmentNumber = assignmentNumber;
		this.assingmentFile = assingmentFile;
		this.fileName = fileName;
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
	
	public String getFormatName() {
		return fileName;
	}
	
	public void setFormatName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFormatType() {
		return fileType;
	}
	
	public void setFormatType(String fileType) {
		this.fileType = fileName;
	}
	
	public  byte[]  getFile() {
		return assingmentFile;
	}
	
	public void setFile( byte[]  file) {
		this.assingmentFile = file;
	}

}
