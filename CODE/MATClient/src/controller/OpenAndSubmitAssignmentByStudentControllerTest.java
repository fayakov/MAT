package controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import java.io.File;
import java.io.IOException;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import entities.Assignment;
import junit.framework.TestCase;

public class OpenAndSubmitAssignmentByStudentControllerTest extends TestCase
{

	public static OpenAndSubmitAssignmentByStudentController openSubmit;
	
	private String path;
	private File fPath;
	private File file;
	private String fName;
	private Boolean expected;
	private Boolean result;
	
	@Before
	public void setUp() throws Exception {
		
		OpenAndSubmitAssignmentByStudentControllerTest.openSubmit = new OpenAndSubmitAssignmentByStudentController();
		
		path = "C:"+File.separator+"hello";
		fPath = new File(path);
		fPath.mkdirs() ;
	}



	@Test
	public void testCheckFormat1() 
	{
		
		fName= path+File.separator+"abc.xlsx";
		file = new File(fName);

		   
		    try {
		    	file.createNewFile();
		    } catch (IOException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		

				expected= true;
				result= openSubmit.checkFormat(file);
				assertEquals(expected, result);
				
		
	}
	
	@Test
	public void testCheckFormat2() 
	{
		
		fName= path+File.separator+"abc.docx";
		file = new File(fName);

		   
		    try {
		    	file.createNewFile();
		    } catch (IOException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		

				expected= true;
				result= openSubmit.checkFormat(file);
				assertEquals(expected, result);
				
		
	}
	
	@Test
	public void testCheckFormat3() 
	{
		
		fName= path+File.separator+"abc.pdf";
		file = new File(fName);

		   
		    try {
		    	file.createNewFile();
		    } catch (IOException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		

				expected= true;
				result= openSubmit.checkFormat(file);
				assertEquals(expected, result);
				
		
	}
	
	@Test
	public void testCheckFormat4() 
	{
		
		fName= path+File.separator+"abc.jpg";
		file = new File(fName);

		   
		    try {
		    	file.createNewFile();
		    } catch (IOException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		

				expected= false;
				result= openSubmit.checkFormat(file);
				assertEquals(expected, result);
				
		
	}

	@Test
	public void testDateLate1() 
	{
		
		Calendar cal = Calendar.getInstance();
		cal.set(2017, Calendar.JULY, 1);
		Date date = cal.getTime();
	
		expected=false;
		result =openSubmit.DateLate(date);
		assertEquals(expected, result);
	
	}
	
	
	@Test
	public void testDateLate2() 
	{
		
		Calendar cal = Calendar.getInstance();
		cal.set(2017, Calendar.JULY, 18);
		Date date = cal.getTime();
	
		expected=true;
		result =openSubmit.DateLate(date);
		assertEquals(expected, result);
	
	}
}
