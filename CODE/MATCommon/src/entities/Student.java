package entities;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * The Class Student.
 */
public class Student  extends User 
{
	 
	/** The parent ID. */
	public ArrayList<Integer> parentID = new ArrayList<Integer>();
	 
 	/** The class ID. */
 	//public ArrayList<Integer> classID = new  ArrayList<Integer>(); 
	public int classID;
	 
 	/** The course. */
 	public  ArrayList<Integer> course = new ArrayList<Integer>(); 

	 
	 /**
 	 * Instantiates a new student.
 	 *
 	 * @param classID the class ID
 	 * @param user the user
 	 */
 	public Student(Integer classID, User user  ) 
	 {
		super(user.getId(), user.getFirstName(), user.getLastName(), user.getPassword(), user.getUserType(), user.getIsLogged(), user.getIsLogged()); 
	}
	 
	 
	/**
	 * Instantiates a new student.
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * Gets the parent ID.
	 *
	 * @return the parent ID
	 */
	public ArrayList<Integer>  getParentID() {
		return parentID;
	}
	
	/**
	 * Sets the parent ID.
	 *
	 * @param parentID the new parent ID
	 */
	public void setParentID(ArrayList<Integer> parentID) {
		this.parentID = parentID;
	}
	
	/**
	 * Gets the class ID.
	 *
	 * @return the class ID
	 */
	public int  getClassID() {
		return classID;
	}
	
	/**
	 * Sets the class ID.
	 *
	 * @param classID the new class ID
	 */
	public void setClassID(int  classID) {
		this.classID = classID;
	}


	/**
	 * Gets the course.
	 *
	 * @return the course
	 */
	public ArrayList<Integer> getCourse() {
		return course;
	}


	/**
	 * Sets the course.
	 *
	 * @param course the new course
	 */
	public void setCourse(ArrayList<Integer> course) {
		this.course = course;
	}
}
