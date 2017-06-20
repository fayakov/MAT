package entities;
<<<<<<< HEAD:CODE/MATCommon/src/entities/CClass.java

import java.io.Serializable;
import java.util.ArrayList;

public class CClass implements Serializable {
	
=======
import java.util.ArrayList;

public class Class {
>>>>>>> refs/remotes/origin/my-branch:CODE/MATCommon/src/entities/Class.java
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
<<<<<<< HEAD:CODE/MATCommon/src/entities/CClass.java
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

=======
>>>>>>> refs/remotes/origin/my-branch:CODE/MATCommon/src/entities/Class.java
}
