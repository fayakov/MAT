package entities;

import java.util.ArrayList;


/**
 * The Class CClass.
 */
public class CClass {
	
	/** The class number. */
	private int classNumber;
	
	/** The class name. */
	private String className;
	
	/** The courses. */
	private ArrayList<Course> courses;
	
	/** The student list. */
	private ArrayList<Student> studentList;
    
    /**
     * Instantiates a new c class.
     *
     * @param number the number
     * @param name the name
     */
    public CClass(int number, String name) {
    	classNumber = number;
    	className = name;
    }  
	  
	/**
	 * Gets the class number.
	 *
	 * @return the class number
	 */
	public int getClassNumber() {
		return classNumber;
	}
	
	/**
	 * Sets the class number.
	 *
	 * @param classNumber the new class number
	 */
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	
	/**
	 * Gets the class name.
	 *
	 * @return the class name
	 */
	public String getClassName() {
		return className;
	}
	
	/**
	 * Sets the class name.
	 *
	 * @param className the new class name
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	
	/**
	 * Adds the student.
	 *
	 * @param newStudent the new student
	 * @return the boolean
	 */
	public Boolean addStudent(Student newStudent) {
		return studentList.add(newStudent);
	}
	
	/**
	 * Delete student.
	 *
	 * @param delStudent the del student
	 * @return the boolean
	 */
	public Boolean deleteStudent(Student delStudent) {
		return studentList.remove(delStudent);
	}	
	
	/**
	 * Gets the student list.
	 *
	 * @return the student list
	 */
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	
	/**
	 * Sets the student list.
	 *
	 * @param studentList the new student list
	 */
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	/**
	 * Gets the courses.
	 *
	 * @return the courses
	 */
	public ArrayList<Course> getCourses() {
		return courses;
	}

	/**
	 * Sets the pre courses.
	 *
	 * @param courses the new pre courses
	 */
	public void setPreCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
}
