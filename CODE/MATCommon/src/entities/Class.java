package entities;
import java.util.ArrayList;

public class Class {
	public String classNumber;
    public ArrayList<Student> studentList;
    
    public Class(String number) {
    	classNumber = number;
    }
	  
	  
	public String getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
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
}
