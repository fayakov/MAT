package entities;

import java.io.Serializable;
import java.util.ArrayList;

public class CClass implements Serializable {
	
	public String classNumber;
	  public ArrayList<Student> studentList;
	  
	  
	public String getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

}
