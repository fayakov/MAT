package entities;

import java.io.Serializable;

public class Student  extends User {
	 public String parentID;
	 public String classID;
	 public String course; //just for printf

	 
	 public Student(String classID, int ID,  String FName,  String LName, String password  ) 
	 	{
			super( ID,  FName,  LName, password);
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
}
