package entities;

import java.util.ArrayList;

public class CClass {
	private int classNumber;
	private String className;
	private ArrayList<Student> studentList;
    
    public CClass(int number, String name) {
    	classNumber = number;
    	className = name;
    }  
	  
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public String getClassNane() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Boolean addStudent(Student newStudent) {
		return studentList.add(newStudent);
	}
	public Boolean deleteStudent(Student delStudent) {
		return studentList.remove(delStudent);
	}	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
}
