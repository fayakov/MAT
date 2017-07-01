package entities;

import java.io.Serializable;
import java.io.InputStream;
import java.sql.Date;


//TAL
public class Submission implements Serializable {

	private Date date;
	private int submissionNumber; //-- output
	private String fileName;
	private byte[] file;
	private int assignmentNumber;
	private int studentId;
	
	public Submission(){
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
	
	public int getSubmissionNumber() {
		return submissionNumber;
	}
	
	public void setSubmissionNumber(int submissionNumber) {
		this.submissionNumber = submissionNumber;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
