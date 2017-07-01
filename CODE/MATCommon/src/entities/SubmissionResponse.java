package entities;

import java.io.Serializable;
import java.sql.Date;

public class SubmissionResponse implements Serializable  {
	private int grade;
	private String comment;
	private Date date;
	private int submissionNumber; //-- output
	private String fileName;
	private byte[] file;
	private int teacherId;

	
	public void setGrade(int grade){
		this.grade = grade;
	}
	
	public int getGrade(){
		return grade;
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
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	public int setTeacherId() {
		return teacherId;
	}
	
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	
	public  byte[]  getFile() {
		return file;
	}
	
	public void setFile( byte[]  file) {
		this.file = file;
	}

}
