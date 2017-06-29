package communication;

import java.io.File;

public class CreateAssignmentRequest extends Message 
{
private static final long serialVersionUID = 1L;
	
	File selectedFile; 
	String date;
	int classNum;
	int courseNum;
	
	
	public CreateAssignmentRequest(File selectedFile, String date, int classNum, int courseNum) {
		super();
		this.selectedFile = selectedFile;
		this.date = date;
		this.classNum = classNum;
		this.courseNum = courseNum;
	}


	public File getSelectedFile() {
		return selectedFile;
	}


	public void setSelectedFile(File selectedFile) {
		this.selectedFile = selectedFile;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getClassNum() {
		return classNum;
	}


	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}


	public int getCourseNum() {
		return courseNum;
	}


	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
