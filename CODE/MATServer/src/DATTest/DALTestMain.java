package DATTest;
import entities.*;
import DAL.*;

public class DALTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		i++;
		CDal dl = new CDal();
		dl.connect("admin");
		int id = 123;
		/*Teacher teacher = dl.getTeacher(id);
		User user = new User();
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
		
		
		*/
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

}
