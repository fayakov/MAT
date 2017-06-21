package DAL;

import java.sql.*;

import entities.*;
public class CDal {
	private static String userName = "root";
	private static String password = "Braude";//"mysql_native_password";//"admin";
	private static String connectionString = "jdbc:mysql://localhost/mat_db";
	private static Connection connection;
	public static void connect(String db_password){
		try 
		{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
			ex.printStackTrace();
		}
		// TODO Auto-generated method stub
		try{
			String pass = (db_password.isEmpty() ? password : db_password); 
			 
			connection = DriverManager.getConnection(connectionString,userName,pass);
			System.out.println("SQL connection succeed");
		}
		catch(SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
	
	public static Teacher getTeacher( int id)
	{
		Teacher teacherData = new Teacher();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery("SELECT * FROM user join teacher where user.id = teacher.id && user.id=" + id + ";");
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int numColumn = rsmd.getColumnCount();
	        
			while(resultSet.next())
	 		{				
				teacherData.setId(resultSet.getInt(1));
				teacherData.setFirstName(resultSet.getString(2));
				teacherData.setLastName(resultSet.getString(3));
				teacherData.setMaxHours(resultSet.getInt(5));
				teacherData.setTeachingUnit(resultSet.getInt(6));
	 		} 
		}
		catch (SQLException e) {e.printStackTrace();}
		return teacherData;
	}
	
	public static boolean setTeacherUnit(int id, int teachingUnit)
	{		
		try 
		{
			Statement stmt = connection.createStatement();
			return (stmt.executeUpdate("UPDATE teacher SET teachingUnitId=" + teachingUnit + " WHERE id=" + id ) > 0);	 	
		}
		catch (SQLException e) 
		{
			e.printStackTrace();			
		}
		return false;
	}
	
	
	public static boolean getUserData(int userId, User user)
	{
		boolean retVal = true;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery("SELECT * FROM user where  user.id=" + userId + ";");
			if (resultSet.next()) {
			    user.setId(resultSet.getInt(1));
				user.setFirstName(resultSet.getString(2));
				user.setLastName(resultSet.getString(3));
				user.setPassword(resultSet.getString(4));
				user.setIsLocked(resultSet.getBoolean(5));
				switch(resultSet.getInt(6))
				{
					case 1:
					{
						user.setUserType(EUserType.EUserTeacher);
					}
					break;
					case 2:
					{
						user.setUserType(EUserType.EUserStudent);
					}
					break;
					case 3:
					{
						user.setUserType(EUserType.EUserSecretary);
					}
					break;
					case 4:
					{
						user.setUserType(EUserType.EUserPrincipal);
					}
					break;
					case 5:
					{
						user.setUserType(EUserType.EUserParent);
					}
					break;
					case 6:
					{
						user.setUserType(EUserType.EUserSystemManager);
					}
					break;
				}
				
				user.setIsLogged(resultSet.getBoolean(7));
			}
			else
			{
				retVal = false;
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static EUserType getUserType(int userId){
		EUserType userType = EUserType.ENoUser;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT userType FROM user where  user.id=" + userId + ";");
			if(resultSet.first())
			{
				switch(resultSet.getInt(1))
				{
					case 1:
					{
						userType = EUserType.EUserTeacher;
					}
					break;
					case 2:
					{
						userType = EUserType.EUserStudent;
					}
					break;
					case 3:
					{
						userType = EUserType.EUserSecretary;
					}
					break;
					case 4:
					{
						userType = EUserType.EUserPrincipal;
					}
					break;
					case 5:
					{
						userType = EUserType.EUserParent;
					}
					break;
					case 6:
					{
						userType = EUserType.EUserSystemManager;
					}
					break;
				}
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return userType;
	}
	
	public static boolean connectUser(boolean connect,int userId, String password, CDALError error)
	{
		boolean retVal = true;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT isLogged FROM user WHERE user.password = '"+ password+ "' && user.id = '" +userId + "';");
			if(resultSet.first())
			{
				boolean connectStatus = (resultSet.getInt(1)==1);
				if((connectStatus && connect) || ( !connectStatus && !connect) ){
					retVal = false;
					error.serError(EDALError.EUserAllreadyConnectedDisconnected);
				}
				else{
					
					int numOfUpdates;
					if(connect)
					{
						numOfUpdates = stmt.executeUpdate("UPDATE user SET isLogged = true WHERE user.id = '"+ userId+ "';");
					}
					else
					{
						numOfUpdates = stmt.executeUpdate("UPDATE user SET isLogged = false WHERE user.id = '"+ userId+ "';");
					}
					if(numOfUpdates == 0)
					{
						retVal = false;
						error.serError(EDALError.EUpdateNotSucced);
					}
				} 
			}
			else
			{
				retVal = false;
				error.serError(EDALError.EWrongPasswordOrId);
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static boolean isClassExist(String className){
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT classId FROM class WHERE class.name = '" +className + "';");
			if(resultSet.first()) {

				retVal = true;
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static boolean addNewClass(String className)
	{
		boolean retVal = true;
		try 
		{
			if(isClassExist(className))
			{
				retVal = false;
			}
			else
			{
				Statement stmt = connection.createStatement();
				stmt.executeUpdate("INSERT INTO class (name) VALUES ('" +className+"')");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();			
		}		
		return retVal;
	}
	
	public static int getClassId(String className){
		int retVal = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT classId FROM class WHERE class.name = '" +className + "';");
			if(resultSet.first()) {

				retVal = resultSet.getInt(1);
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static boolean isStudentExist(int userId)
	{
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT * FROM student WHERE student.user_id = '" +userId + "';");
			if(resultSet.first()) {

				retVal = true;
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static boolean createStudent(int userId)
	{
		boolean retVal = true;
		try 
		{
			if(isStudentExist(userId))
			{
				retVal = false;
			}
			else
			{
				Statement stmt = connection.createStatement();
				stmt.executeUpdate("INSERT INTO student (user_id) VALUES ('" +userId+"')");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();			
		}		
		return retVal;
	}
	
	public static boolean addStudentToClass(String className, int userId){
		boolean retVal = true;
		
		if(getUserType(userId) == EUserType.EUserStudent)
		{

			try 
			{
				int classId = getClassId(className);
				if(classId == 0)
				{
					retVal = false;
				}
				else
				{
					Statement stmt = connection.createStatement();
					createStudent(userId);
					if(stmt.executeUpdate("UPDATE student SET class_classId='" + classId + "' where user_id = '"+userId+"';" ) == 0)
					{
						retVal = false;
					}
				}
			}
			catch (SQLException e) {
				e.printStackTrace();			
			}		
		}
		else
		{
			retVal = false;
		}
		
		return retVal;
	}
	
	
	public static int getCourseId(String courseName){
		int retVal = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT courseId FROM course WHERE course.name = '" +courseName + "';");
			if(resultSet.first()) {

				retVal = resultSet.getInt(1);
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static boolean addStudentToCourse(String courseName, int userId){
		boolean retVal = true;
		
		if(getUserType(userId) == EUserType.EUserStudent)
		{

			try 
			{
				int courseId = getCourseId(courseName);
				if(courseId == 0)
				{
					retVal = false;
				}
				else
				{
					Statement stmt = connection.createStatement();
					createStudent(userId);
					if(stmt.executeUpdate("UPDATE student SET course_courseId='" + courseId + "' where user_id = '"+userId+"';" ) == 0)
					{
						retVal = false;
					}
				}
			}
			catch (SQLException e) {
				e.printStackTrace();			
			}		
		}
		else
		{
			retVal = false;
		}
		
		return retVal;
	}
	
	public static boolean isCourseExist(String courseName){
		
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT courseId FROM course WHERE course.name = '" +courseName + "';");
			if(resultSet.first()) {

				retVal = true;
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static boolean createCourse( String courseName){
			
		boolean retVal = true;
		try 
		{
			if(isCourseExist(courseName))
			{
				retVal = false;
			}
			else
			{
				Statement stmt = connection.createStatement();
				//stmt.executeUpdate("INSERT INTO course (name) VALUES ('" +courseName+"')");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();			
		}		
		return retVal;
	}
	
    private static void writeMetaData(){

    	try{
	    		
	    	Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT * FROM user;");
	        System.out.println("The columns in the table are: ");
	
	        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
	        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
	                System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
	        }
	    }
    	catch (SQLException e) {e.printStackTrace();}
    }
	
}
