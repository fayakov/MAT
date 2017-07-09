package controller;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import communication.AddStudentToCourseRequest;
import communication.LoginRequestMsg;
import communication.MATClientController;
import junit.framework.TestCase;

public class AddClassToCourseControllerTest extends TestCase{
	
	public static AddClassToCourseController AddClassToCourse;
	public static MATClientController clientCC;
	public static loginController login;
	
	
	@Before
	public void setUp() throws Exception {
	
		AddClassToCourseControllerTest.AddClassToCourse = new AddClassToCourseController();
		LoginRequestMsg loginReqMsg = new LoginRequestMsg(125, "521",true);
		MATClientController.getInstance("127.0.0.1", 5555).sendRequestToServer(loginReqMsg);

		
	}
	
	
	@Test
	public void testSendAddClass() {
		fail("Not yet implemented");
	}

}
