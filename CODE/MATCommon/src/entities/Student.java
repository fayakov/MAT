package entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Student  extends User {
	 public ArrayList<Integer> parentID = new ArrayList<Integer>();
	 public ArrayList<Integer> classID = new  ArrayList<Integer>(); 
	 public  ArrayList<Integer> course = new ArrayList<Integer>(); 

	 
	 public Student(Integer classID, User user  ) {
		super(user.getId(), user.getFirstName(), user.getLastName(), user.getPassword(), user.getUserType(), user.getIsLogged(), user.getIsLogged()); 
	}
	 
	 
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public ArrayList<Integer>  getParentID() {
		return parentID;
	}
	public void setParentID(ArrayList<Integer> parentID) {
		this.parentID = parentID;
	}
	public ArrayList<Integer>  getClassID() {
		return classID;
	}
	public void setClassID(ArrayList<Integer>  classID) {
		this.classID = classID;
	}


	public ArrayList<Integer> getCourse() {
		return course;
	}


	public void setCourse(ArrayList<Integer> course) {
		this.course = course;
	}
}
