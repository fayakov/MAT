package entities;

import java.util.ArrayList;


/**
 * The Class Parent.
 */
public class Parent extends User{

 /** The isblocked. */
 private Boolean isblocked;
 
 /** The student list. */
 private ArrayList <Integer> studentList;

 /**
  * Instantiates a new parent.
  */
 public Parent(){
 }
 
 /**
  * Instantiates a new parent.
  *
  * @param isblocked the isblocked
  * @param studentList the student list
  */
 public Parent(Boolean isblocked, ArrayList<Integer> studentList) {
	super();
	this.isblocked = isblocked;
	this.studentList = studentList;
}

/**
 * Gets the isblocked.
 *
 * @return the isblocked
 */
public Boolean getIsblocked() {
	return isblocked;
}


/**
 * Sets the isblocked.
 *
 * @param isblocked the new isblocked
 */
public void setIsblocked(Boolean isblocked) {
	this.isblocked = isblocked;
}

/**
 * Gets the student list.
 *
 * @return the student list
 */
public ArrayList<Integer> getStudentList() {
	return studentList;
}

/**
 * Sets the student list.
 *
 * @param studentList the new student list
 */
public void setStudentList(ArrayList<Integer> studentList) {
	this.studentList = studentList;
}
}
