package entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Student  extends User {
	 public String parentID;
	 public String classID;
	 public  ArrayList<String> course = new ArrayList<String>(); 

	 
	 public Student(String classID, int ID,  String FName,  String LName, String password  ) 
	 	{
			super();
		}
	 
	 
	public String getParentID() {
		return parentID;
	}
	public void setParentID(String parentID) {
		this.parentID = parentID;
	}
	public String getClassID() {
		return classID;
	}
	public void setClassID(String classID) {
		this.classID = classID;
	}


	public ArrayList<String> getCourse() {
		return course;
	}


	public void setCourse(ArrayList<String> course) {
		this.course = course;
	}
}
