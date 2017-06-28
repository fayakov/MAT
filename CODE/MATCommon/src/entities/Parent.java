package entities;

import java.util.ArrayList;

public class Parent extends User{
	
 private Boolean isblocked;
 private ArrayList <String> studentList;

 public Parent(Boolean isblocked, ArrayList<String> studentList) {
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

public ArrayList<String> getStudentList() {
	return studentList;
}

public void setStudentList(ArrayList<String> studentList) {
	this.studentList = studentList;
}
 
 


}
