package entities;

import java.io.Serializable;
import java.util.ArrayList;

public class SubmissionsForTeacherCheck implements Serializable {
	
	private ArrayList<Submission> submissionList;

	public ArrayList<Submission> getSubmissionList() {
		return submissionList;
	}

	public void setSubmissionList(ArrayList<Submission> submissionList) {
		this.submissionList = submissionList;
	}
	
	
}
