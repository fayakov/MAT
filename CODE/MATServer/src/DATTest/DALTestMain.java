package DATTest;
import entities.*;

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
		//checkCreateCourse(dl);
		//checkGetStudentsInCourse(dl);
		/*Teacher teacher = dl.getTeacher(id);*/
		//checkAddStudentToClass(dl);
		//checkGetStudentsInClass( dl);
		//checkAddCourseToClass(dl);
		//checkCreateTeachingUnit(dl);
		//checkCreateAddTeachingUnitToCourse(dl);
		//checkAddTeacherToCourseWithClass(dl);
		//checkCreateTeacher(dl);
		checkAddTeacherToCourseWithClass(dl);

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
		System.out.println(dl.addStudentToCourse("Algebra2", 124 ) == false);
		System.out.println(dl.addStudentToCourse("Algebra3", 124 ));
	}	
	
	public static void chekcIsStudentInCourse(CDal dl)
	{
		System.out.println(dl.isStudentInCourse(2, 124));	
		System.out.println(dl.isStudentInCourse(3, 124) == false);
		System.out.println(dl.isStudentInCourse(2, 125) == false);	
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
		System.out.println(dl.addCourseToClass(1, 1) == false);
		System.out.println(dl.addCourseToClass(1, 124 )==false);
		System.out.println(dl.addCourseToClass(124, 1 )==false);
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
		System.out.println(dl.addTeacherToCourseInClass(1, 1, 1) == false);
		System.out.println(dl.addTeacherToCourseInClass(1233, 1, 123) == false);
		System.out.println(dl.addTeacherToCourseInClass(1, 1234, 123) == false);
		System.out.println(dl.addTeacherToCourseInClass(1, 1, 123) == false);
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
		System.out.println(dl.createTeacher(123, 20, 20) == false);
		System.out.println(dl.createTeacher(124, 20, 1) == false);
		System.out.println(dl.createTeacher(123, 20, 1) == false);
	}
	
}
