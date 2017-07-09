package Fixtures.Mat;

import java.sql.Date;

import DAL.CDal;
import controller.DefineAssignmentController;

public class DefineAssignment {

	
	
	//Assignment newAssignment;
	DefineAssignmentController newAssignment;
	boolean isSucceed, flag = false;
	
	public void startAssignment() {
		newAssignment = new DefineAssignmentController();
	}
	
	public void fileName (String fileName) {
		newAssignment.fileName = fileName;
	}
	
	public void fileData(byte[] file) {
		newAssignment.fileData = file;
	}
	
	public void courseId(int num) {
		newAssignment.courseNumber = num;
	}
	
	public void dueDate(Date date) {
		newAssignment.dueDate = date;
	}
		
	public void teacherId(int teacherId) {
		newAssignment.teacherId =teacherId;
	}
	
	
	
	public boolean defineAssignment() {
		// TODO Auto-generated method stub
		//return true;
		return CDal.createAssignment(newAssignment.getdueDate(), newAssignment.getfileData(), newAssignment.getfileName(), newAssignment.getteacherId(), newAssignment.getcourseId());
	}

	
}

