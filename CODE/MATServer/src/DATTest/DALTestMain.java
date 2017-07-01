package DATTest;
import entities.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.ArrayList;

import DAL.*;

public class DALTestMain {


	public static void main(String[] args) {

		CDal dl = new CDal();
		dl.connect("admin");
		//checkLogin(dl);
		//checkGetUserData(dl);
		//checkGetUserType(dl);
		//checkIsExistClass(dl);
		//checkAddClass(dl);
		//checkAddStudentToClass(dl);
		//checkGetStudentId(dl);
		//chekcIsStudentInCourse(dl);
			//checkAddStudentToCourse(dl);
		//checkRemoveStudentFromCourse(dl);
		//checkFinishStudentCourse(dl);
		//checkCreateCourse(dl);
		//checkGetStudentsInCourse(dl);
		/*Teacher teacher = dl.getTeacher(id);*/
		//checkGetStudentsInClass( dl);
		//checkAddCourseToClass(dl);
		//checkCreateTeachingUnit(dl);
		//checkCreateAddTeachingUnitToCourse(dl);
		//checkAddTeacherToCourseWithClass(dl);
		//checkRemoveTeacherFromCourseWithClass(dl);
		//checkCreateTeacher(dl);
		//checkAddTeacherToCourseWithClass(dl);
		//checkAddPrevCourseToCourse(dl);
		
		//checkisFinishedPrevCourse(dl);
		//checkFinishedGrade(dl);
		//checkClassTecherStatistics(dl);
		//checkTecherClassStatistics(dl);
		//checkCourseClassStatistics(dl);
		//checkCreateNewSemester(dl);
		//checkCreateParant(dl);
		//checkAddStudentToParent(dl);
		//checkBlockParent(dl);
		//checkChangeTeacher(dl);
		//checkCreateStudent(dl);
		//checkCreateReq(dl);
		//checkGetRequests(dl);
		//checkConfirmRequest(dl);
		//checkCreateAssignment(dl);
		//checkGetAssignment(dl);
		//checkAddAssignmentToClassWithCourse(dl);
		//checkAddSubmission(dl);
		//getSubmissionToCheck(dl);
		checkAddSubmissionResponse(dl);
		//getAssignments(dl);
	}
	public static void checkLogin(CDal dl )
	{

		int id = 123;
		CDALError error = new CDALError();
		if(dl.connectUser(true,id, "321", error))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		error.serError(EDALError.ENoError);
		if(!dl.connectUser(true,id, "322", error))
		{
			if(error.getError() == EDALError.EWrongPasswordOrId)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		
		error.serError(EDALError.ENoError);
		if(!dl.connectUser(true,id, "321", error))
		{
			if(error.getError() == EDALError.EUserAllreadyConnectedDisconnected)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		else
		{
			System.out.println("false");
		}
		
		error.serError(EDALError.ENoError);
		if(dl.connectUser(false,id, "321", error))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

		
		error.serError(EDALError.ENoError);
		if(!dl.connectUser(false,id, "321", error))
		{
			if(error.getError() == EDALError.EUserAllreadyConnectedDisconnected)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		else
		{
			System.out.println("false");
		}
	}
	public static void checkGetUserData(CDal dl){
		User user = new User();
		int id = 123;
		if(dl.getUserData(id, user))
		{
			System.out.println("user.getId()" + user.getId() );
			System.out.println("user.getFirstName()" + user.getFirstName());
			System.out.println("user.getIsLocked()" + user.getIsLocked() );
			System.out.println("user.getIsLogged()" + user.getIsLogged());
			System.out.println("user.getLastName()" + user.getLastName() );
			System.out.println("user.getPassword()" + user.getPassword());
			System.out.println("user.getUserType()" + user.getUserType());
		}
		else
		{
			System.out.println("no value");
		}
	}
	
	public static void checkGetUserType(CDal dl){
		int id = 123;
		if(dl.getUserType(id) == EUserType.EUserTeacher)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		id = 122;
		if(dl.getUserType(id) == EUserType.ENoUser)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		id = 124;
		if(dl.getUserType(id) == EUserType.EUserStudent)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	public static void checkAddClass(CDal dl){
		System.out.println(dl.addNewClass("a1")==false);
		System.out.println(dl.addNewClass("a4"));
	}
	public static void checkIsExistClass(CDal dl){
		System.out.println(dl.isClassExist("a1"));
		System.out.println(dl.isClassExist("asdasd") == false);

	}
	
	public static void checkCreateCourse(CDal dl)
	{
		System.out.println(dl.createCourse("algebra3"));
	}
	
	public static void checkGetStudentId(CDal dl)
	{
		System.out.println(dl.getStudentId(124) != 0);
		System.out.println(dl.getStudentId(123) == 0);
	}
	
	
	public static void checkAddStudentToCourse(CDal dl)
	{
		//System.out.println(dl.addStudentToCourse("Algebra1", 124 ));
		//System.out.println(dl.addStudentToCourseWithClass(dl.getCourseId("Algebra1"), 1, 124));
		System.out.println(dl.addStudentToCourseWithClass(dl.getCourseId("Algebra2"), 1, 124));
		//System.out.println(dl.addStudentToCourse("Algebra3", 124 ));
	}
	
	public static void checkRemoveStudentFromCourse(CDal dl)
	{
		System.out.println(dl.removeStudentFromCourseWithClass(dl.getCourseId("Algebra1"), 1, 124) == true);
		//System.out.println(dl.removeStudentFromCourseWithClass(dl.getCourseId("Algebra2"), 1, 124) == true);
	}
	
	public static void chekcIsStudentInCourse(CDal dl)
	{
		//System.out.println(dl.isStudentInCourse(2, 124));	
		//System.out.println(dl.isStudentInCourse(3, 124) == false);
		//System.out.println(dl.isStudentInCourse(2, 125) == false);	
	}
	
	public static void checkGetStudentsInCourse(CDal dl)
	{
		ArrayList<Integer> users = dl.getStudensInCourse(1);
		for (Integer id : users) {
			System.out.println(id);
		}
	}
	
	public static void checkAddStudentToClass(CDal dl)
	{
		System.out.println(dl.addStudentToClass(1, 124) == false);
		System.out.println(dl.addStudentToClass(5, 124 )==false);
		System.out.println(dl.addStudentToClass(1, 129)==false);
	}	
	
	public static void checkAddCourseToClass(CDal dl)
	{
		System.out.println(dl.addCourseToClass(1, 2) == true);
		//System.out.println(dl.addCourseToClass(1, 124 )==false);
		//System.out.println(dl.addCourseToClass(124, 1 )==false);
	}	
	
	
	public static void checkGetStudentsInClass(CDal dl)
	{
		ArrayList<Integer> users = dl.getStudensInClass(1);
		for (Integer id : users) {
			System.out.println(id);
		}
	}
	
	public static void checkAddTeacherToCourseWithClass(CDal dl)
	{
		//addTeacherToCourseInClass(int classId, int courseId, int userID)
		//System.out.println(dl.addTeacherToCourseInClass(1, 1, 1) == false);
		//System.out.println(dl.addTeacherToCourseInClass(1233, 1, 123) == false);
		//System.out.println(dl.addTeacherToCourseInClass(1, 1234, 123) == false);
		System.out.println(dl.addTeacherToCourseInClass(1, 2, 123) == true);
	}
	
	public static void checkChangeTeacher(CDal dl)
	{
		//public static boolean addTeacherToCourseInClass(int classId, int courseId, int userID){
		System.out.println(dl.changeTeacherToCourseInClass(1, 1, 128) == false);
	}

	
	public static void checkCreateTeachingUnit(CDal dl)
	{
		System.out.println(dl.createTeachingUnit("Mathematics"));
		System.out.println(dl.createTeachingUnit("Physics"));
		System.out.println(dl.createTeachingUnit("Mathematics") == false);
	}
	
	public static void checkCreateAddTeachingUnitToCourse(CDal dl)
	{
		System.out.println(dl.addTeachingUnitToCourse(1,2) == false);
		
		//System.out.println(dl.createTeachingUnit("Physics"));
		//System.out.println(dl.createTeachingUnit("Mathematics") == false);
	}
	
	public static void checkCreateTeacher(CDal dl)
	{
		//System.out.println(dl.createTeacher(123, 20, 20) == false);
		System.out.println(dl.createTeacher(128, 20, 1) == true);
		//System.out.println(dl.createTeacher(124, 20, 1) == false);
		//System.out.println(dl.createTeacher(123, 20, 1) == false);
	}
	
	public static void checkAddPrevCourseToCourse(CDal dl)
	{
		System.out.println(dl.addPrevCourseToCourse(2, 1));
		System.out.println(dl.addPrevCourseToCourse(3, 2));
	}
	
	public static void checkFinishStudentCourse(CDal dl)
	{
		System.out.println(dl.finishStudentCourse(1, 1, 100, dl.getCurrentSemester()));
	}
	
	public static void checkisFinishedPrevCourse(CDal dl)
	{
		//System.out.println(dl.isStudentFinishedPrevCourse(1,1) == true);
		//System.out.println(dl.isStudentFinishedPrevCourse(1,2) == true);
		//System.out.println(dl.isStudentFinishedPrevCourse(1,3) == false);
	}
	
	public static void checkFinishedGrade(CDal dl)
	{
		System.out.println(dl.getFinishedGrade(1, 1) == 100);
		System.out.println(dl.getFinishedGrade(1, 2) == -1);
		System.out.println(dl.getFinishedGrade(21, 2) == -1);
	}
	
	public static void checkClassTecherStatistics(CDal dl)
	{
		ArrayList<TeacherWithGrade> mylist =dl.getClassTeacherStatistics(1);
		for(TeacherWithGrade teacher  : mylist)
		{
			System.out.println("teacher: "+ teacher.getName()+ " grade: "+teacher.getGrade());
		}
	}

	public static void checkTecherClassStatistics(CDal dl)
	{/*
		ArrayList<ClassWithGrade> mylist =dl.getTeacherClassesStatistics(1,dl.getCurrentSemester());
		for(ClassWithGrade classWithG  : mylist)
		{
			System.out.println("class: "+ classWithG.getName()+ " grade: "+classWithG.getGrade());
		}*/
	}
	
	public static void checkCourseClassStatistics(CDal dl)
	{
	/*	
		ArrayList<CourseWithGrade> mylist =dl.getClassesCoursesStatistics(1,dl.getCurrentSemester());
		for(CourseWithGrade courseWithG  : mylist)
		{
			System.out.println("course: "+ courseWithG.getName()+ " grade: "+courseWithG.getGrade());
		}*/
	}
	
	public static void checkCreateNewSemester(CDal dl)
	{
		Date start = new Date(2017,10,9);
		Date end  = new Date(2017,11,9);
		//System.out.println(start.getYear()+" "+start.getMonth()+" "+start.getDate());
		System.out.println(dl.createNewSemester(start, end) == false);
	}
	
	public static void checkCreateParant(CDal dl)
	{
		System.out.println(dl.createParant(127) == false);
	}
	
	public static void checkAddStudentToParent(CDal dl)
	{
		System.out.println(dl.addStudentToParent(127, 124) == true);
	}
	
	public static void checkBlockParent(CDal dl)
	{
		System.out.println(dl.blockParent(1, 1, false) == true);
	}
	
	public static void checkCreateReq(CDal dl)
	{
		System.out.println(dl.createRequest(ERequestType.addStudent, 129, 1, 1) == true);
	}
	

	public static void checkCreateStudent(CDal dl)
	{
		System.out.println(dl.createStudent(129) == true);
	}
	public static void checkGetRequests(CDal dl)
	{
		/*
		ArrayList<Request> reqArr = dl.getRequests(dl.getCurrentSemester());
		for(Request req  : reqArr)
		{
			System.out.println("getClassNumber: "+ req.getClassNumber()+ " getCourseId: "+req.getCourseId() + " getRequestNumber: "+req.getRequestNumber()+ " getUserid: "+req.getUserid());
		}*/
	}
	
	public static void checkConfirmRequest(CDal dl)
	{
		System.out.println(dl.confirmRequest(1, true) == true);
	}
	
	
	public static void checkCreateAssignment(CDal dl)
	{
		
		Date dueDate = new Date(2017,10,9);
		String filePath = "C:\\Users\\fayakov\\Desktop\\tmp2.pdf";
		try{
			File file = new File(filePath);
			InputStream inputStream = new FileInputStream(file);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int next = inputStream.read();
			while (next > -1) {
			    bos.write(next);
			    next = inputStream.read();
			}
			bos.flush();
			byte[] result = bos.toByteArray();
			System.out.println(dl.createAssignment(dueDate, result, "tmp2.pdf", 2, 1));
		}
		catch (IOException ex) {
            ex.printStackTrace();
        }

	}
	
	public static void checkGetAssignment(CDal dl)
	{
		Date dueDate = new Date(2017,10,9);
		String filePath = "C:\\Users\\fayakov\\Desktop\\tmp2ret.pdf";
		try{
			Assignment assignment = dl.getAssignment(12);
			byte[] retFile = assignment.getFile();
		   
		      File file = new File(filePath);
		      if (file.createNewFile()){
			        System.out.println("File is created!");
			      }else{
			        System.out.println("File already exists.");
			      }
		     
		      FileOutputStream stream = new FileOutputStream(filePath);
		      try {
		          stream.write(retFile);
		      } finally {
		          stream.close();
		      }
		}
		catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
	public static void checkAddAssignmentToClassWithCourse(CDal dl)
	{
		System.out.println(dl.addAssignmentToClassWithCourse(1, 1, 9) == true);
	}
	
	public static void checkAddSubmission(CDal dl)
	{
		Date date = new Date(2017,10,8);
		String filePath = "C:\\Users\\fayakov\\Desktop\\tmp.docx";
		try{
			File file = new File(filePath);
			InputStream inputStream = new FileInputStream(file);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int next = inputStream.read();
			while (next > -1) {
			    bos.write(next);
			    next = inputStream.read();
			}
			bos.flush();
			byte[] result = bos.toByteArray();
			System.out.println(dl.createSubmissionToStudentWithCourse(1 , 1,date  ,result, "tmp.docx",22 ) == true);
		}
		catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
	
	public static void checkAddSubmissionResponse(CDal dl)
	{
		
		Date date = new Date(2017,10,8);
		String filePath = "C:\\Users\\fayakov\\Desktop\\tmp.docx";
		try{
			File file = new File(filePath);
			InputStream inputStream = new FileInputStream(file);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int next = inputStream.read();
			while (next > -1) {
			    bos.write(next);
			    next = inputStream.read();
			}
			bos.flush();
			byte[] result = bos.toByteArray();
			System.out.println(dl.createSubmissionResponse(result, "tmp.docx", 14, 100, "very good" , date ) == true);
		}
		catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
	
	public static void getSubmissionToCheck(CDal dl)
	{
		ArrayList<Integer> arr = dl.getSubmissionsToCheck(1);
		for(int i : arr)
		{
			System.out.println("submission :" +i);
		}
	}
	
	public static void getAssignments(CDal dl)
	{
		StudentCourseAssignment arr = dl.getStudentAssignments(1);
		for(Assignment assignment : arr.getAssignments())
		{
			System.out.println("submission :" +assignment.getAssignmentNumber());
		}
	}
	
	
	
}
