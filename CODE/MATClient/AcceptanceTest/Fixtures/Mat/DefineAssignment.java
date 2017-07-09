package Fixtures.Mat;

import controller.DefineAssignmentController;

public class DefineAssignment {

	
	
	//Assignment newAssignment;
	DefineAssignmentController newAssignment;
	boolean isSucceed, flag = false;
	
	public void startAssignment() {
		newAssignment = new DefineAssignmentController();
	}
	
	public void AssignmentNumber(int num){
		newAssignment.newAssignmentNumber = num;
	}
	
	public void AssignmentName(String name) {
		newAssignment.newAssignmentName = name;
	}
	
	public void Assignmentfile() {
		newAssignment.Assignmentfile = tUnit;
	}
	
	public void fileName(String name) {
		newAssignment.teachHours = name;
	}
	
	public void CourseName(String name) {
		newAssignment.CourseName = name;
	}
	
	public boolean defineAssignment() {
		isSucceed = newAssignment.sendToDB();
		return isSucceed;
	}

	
}

