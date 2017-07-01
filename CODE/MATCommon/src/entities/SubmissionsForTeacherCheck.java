package entities;

import java.io.Serializable;
import java.util.ArrayList;

public class SubmissionsForTeacherCheck implements Serializable {
	
	private ArrayList<Submission> submissionList;
	public void setAssignments(ArrayList<Submission> assignment)
	{
		this.submissionList = assignment;
	}
	
	public ArrayList<Submission> getAssignments()
	{
		return submissionList;
	}
	
}
