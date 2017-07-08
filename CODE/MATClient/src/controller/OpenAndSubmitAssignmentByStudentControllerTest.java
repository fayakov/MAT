package controller;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;

import entities.Assignment;

public class OpenAndSubmitAssignmentByStudentControllerTest 
{
	private Assignment a1;
	Date date;

	@Before
	public void setUp() throws Exception 
	{
		
		//a1= new Assignment(date, assignmentNumber, String fileName,  byte[] assingmentFile);
		OpenAndSubmitAssignmentByStudentControllerTest op= new OpenAndSubmitAssignmentByStudentControllerTest();
	}

	
	@Test
	public void testSendSubmission() 
	{
		//fail("Not yet implemented");
		
	}

}
