package entities;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentCourseAssignment implements Serializable 
{

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
