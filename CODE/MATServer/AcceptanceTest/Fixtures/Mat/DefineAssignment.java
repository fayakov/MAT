package Fixtures.Mat;

import java.sql.Date;

import controller.DefineAssignmentController;

public class DefineAssignment {

	
	
	//Assignment newAssignment;
	DefineAssignmentController newAssignment;
	boolean isSucceed, flag = false;
	
	public void startAssignment() {
		newAssignment = new DefineAssignmentController();
	}
	
	
	
	public void assignmentfile(byte[] file) {
		newAssignment.assignmentfile = file;
	}
	
	public void courseNumber(int num) {
		newAssignment.courseNumber = num;
	}
	
	public void submissionDate(Date date) {
		newAssignment.submissionDate = date;
	}
	
	
	public boolean defineAssignment() {
		isSucceed = newAssignment.sendToDB();
		return isSucceed;
	}

	
}

