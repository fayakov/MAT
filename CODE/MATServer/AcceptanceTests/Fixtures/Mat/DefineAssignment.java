package Fixtures.Mat;

import java.sql.Date;

import DAL.CDal;
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
	
	public void courseId(String courseName) {
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
		int assignmentId = CDal.createAssignment(newAssignment.getDate(), newAssignment.getFileData(), newAssignment.getFileName(), newAssignment.getTeacherId(), CDal.getCourseId(newAssignment.getCourseName()) );
		if(assignmentId != 0)
			return true;
		else
			return false;
	}

	
}

