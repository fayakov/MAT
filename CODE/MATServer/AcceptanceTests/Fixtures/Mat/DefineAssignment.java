package Fixtures.Mat;

import java.sql.Date;

import DAL.CDal;
import controller.DefineAssignmentController;
import entities.Assignment;

public class DefineAssignment {

	
	
	Assignment newAssignment;
	//DefineAssignmentController newAssignment;
	//boolean isSucceed, flag = false;
	
	
	public void startAssignment() {
		newAssignment = new Assignment();
	}
	
	public void fileName (String fileName) {
		newAssignment.setFileName(fileName);
	}
	
	public void fileData(byte[] file) {
		newAssignment.setFile(file);
	}
	
	public void courseId(int num) {
		newAssignment.setCourseName(courseName);
	}
	
	public void dueDate(Date date) {
		newAssignment.setDate(date);
	}
		
	public void teacherId(int teacherId) {
		newAssignment.setTeacherId(teacherId);
	}
	
	
	
	public boolean defineAssignment() {
		// TODO Auto-generated method stub
		//return true;
		return CDal.createAssignment(newAssignment.getdueDate(), newAssignment.getfileData(), newAssignment.getfileName(), newAssignment.getteacherId(), newAssignment.getcourseId());
	}

	
}

