package entities;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentCourseAssignment implements Serializable 
{

	public StudentCourseAssignment(ArrayList<Assignment> assignmentList) {
		super();
		this.assignmentList = assignmentList;
	}

	private ArrayList<Assignment> assignmentList;
	
	
	public void setAssignments(ArrayList<Assignment> assignment)
	{
		this.assignmentList = assignment;
	}
	
	public ArrayList<Assignment> getAssignments()
	{
		return assignmentList;
	}

}
