package entities;

import java.util.ArrayList;

public class Parent extends User{

 private Boolean isblocked;
 private ArrayList <Integer> studentList;

 public Parent(){
 }
 
 public Parent(Boolean isblocked, ArrayList<Integer> studentList) {
	super();
	this.isblocked = isblocked;
	this.studentList = studentList;
}

public Boolean getIsblocked() {
	return isblocked;
}


public void setIsblocked(Boolean isblocked) {
	this.isblocked = isblocked;
}

public ArrayList<Integer> getStudentList() {
	return studentList;
}

public void setStudentList(ArrayList<Integer> studentList) {
	this.studentList = studentList;
}
}
