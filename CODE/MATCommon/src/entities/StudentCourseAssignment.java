package entities;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * The Class StudentCourseAssignment.
 */
public class StudentCourseAssignment implements Serializable 
{
	
	/** The assignment list. */
	private ArrayList<Assignment> assignmentList;

	/**
	 * Instantiates a new student course assignment.
	 *
	 * @param assignmentList the assignment list
	 */
	public StudentCourseAssignment(ArrayList<Assignment> assignmentList) {
		super();
		this.assignmentList = assignmentList;
	}

	
	
	/**
	 * Sets the assignments.
	 *
	 * @param assignment the new assignments
	 */
	public void setAssignments(ArrayList<Assignment> assignment)
	{
		this.assignmentList = assignment;
	}
	
	/**
	 * Gets the assignments.
	 *
	 * @return the assignments
	 */
	public ArrayList<Assignment> getAssignments()
	{
		return assignmentList;
	}

}
