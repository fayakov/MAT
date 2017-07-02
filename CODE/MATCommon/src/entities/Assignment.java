package entities;

import java.io.InputStream;
import java.io.Serializable;
import java.sql.Date;

public class Assignment implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Date date;
	private int assignmentNumber;
	private String fileName;
	private byte[] assingmentFile;
	private int teacherId;
	private String courseName;
	
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
	
	public int getTeacherId() {
		return teacherId;
	}
	
	public void setTeacherId(int teacherId) {
		this.teacherId = assignmentNumber;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public  byte[]  getFile() {
		return assingmentFile;
	}
	
	public void setFile( byte[]  file) {
		this.assingmentFile = file;
	}

}
