package entities;

import java.util.ArrayList;

public class Parent {
	
 private Boolean isblocked;
 private ArrayList <String> studentList;
 
 
public Boolean getIsblocked() {
	return isblocked;
}
public void setIsblocked(Boolean isblocked) {
	this.isblocked = isblocked;
}
public ArrayList<String> getStudentList() {
	return studentList;
}
public void AddStudent(String name) {
	studentList.add(name);
} 

}



