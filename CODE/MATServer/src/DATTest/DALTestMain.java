package DATTest;
import entities.*;
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
		checkAddStudentToClass(dl);
		/*Teacher teacher = dl.getTeacher(id);*/

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
	
	public static void checkAddStudentToClass(CDal dl){
		System.out.println(dl.addStudentToClass("a1", 124));
	}
	
}
