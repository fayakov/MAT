package entities;


import java.io.Serializable;
import java.util.ArrayList;
	
import java.util.ArrayList;

public class CClass implements Serializable{
	public String classNumber;
	public String className;
    public ArrayList<Student> studentList;
    
    public CClass(String number, String name) {
    	classNumber = number;
    	className = name;
    }  
	  
	public String getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(String classNumber) {
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
