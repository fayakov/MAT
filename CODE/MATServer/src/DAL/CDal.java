package DAL;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

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
	
	public static boolean isClassExist(int classId){
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT classId FROM class WHERE class.classId = '" +classId + "';");
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
	
	public static int getTeacherUnitId(int teacherId){
		int retVal = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT teachingUnit_teachingUnitId FROM teacher WHERE teacher.teacherId = '" + teacherId + "';");
			if(resultSet.first()) {

				retVal = resultSet.getInt(1);
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static int getTeacherId(int userId){
		int retVal = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT teacherId FROM teacher WHERE teacher.user_id = '" + userId + "';");
			if(resultSet.first()) {

				retVal = resultSet.getInt(1);
			}
		}
		catch (SQLException e) {e.printStackTrace();}
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
				if(getUserType(userId)  == EUserType.EUserStudent)
				{
					Statement stmt = connection.createStatement();
					stmt.executeUpdate("INSERT INTO student (user_id) VALUES ('" +userId+"')");
				}
				else
				{
					Statement stmt = connection.createStatement();
					stmt.executeUpdate("INSERT INTO student (user_id) VALUES ('" +userId+"')");
				}
			}
		}
		catch (SQLException e) {
			e.printStackTrace();			
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
	
	
	public static int getCourseTeachingUnitId(int courseId){
		int retVal = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT teachingunit_teachingUnitId FROM course WHERE course.courseId = '" +courseId + "';");
			if(resultSet.first()) {

				retVal = resultSet.getInt(1);
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static int getStudentId(int userId){
		int retVal = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT idstudent FROM student WHERE student.user_id = '" +userId + "';");
			if(resultSet.first()) {

				retVal = resultSet.getInt(1);
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static int createNewCourseDetailesToStudentWithCourseId()
	{
		int retVal = 0;
			try {
			Statement stmt = connection.createStatement();
			if(stmt.executeUpdate("INSERT INTO finished_course_detailes  "
								+ "(isNew) "
								+ "values (true);") != 0)
			
				{
					ResultSet resultSet  = stmt.executeQuery("SELECT finished_course_id  "
							+ "FROM finished_course_detailes "
							+ "WHERE finished_course_detailes.isNew = true;");
					if(resultSet.first()) {
						retVal = resultSet.getInt(1);
						if(0 == stmt.executeUpdate("UPDATE finished_course_detailes SET "
								+ "isNew = false WHERE finished_course_detailes.finished_course_id = '"+ retVal+ "';"))
						{
							retVal = 0;
						}
						
						
					}
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
				}

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
					int studentId = getStudentId(userId);
					if(studentId != 0)
					{
						if(isStudentFinishedPrevCourse(studentId,courseId))
						{
							int studentCourseId = getStudentInCourseId(courseId, studentId);
							if(studentCourseId == 0)
							{
								int newCourseDetailesId = createNewCourseDetailesToStudentWithCourseId();
								if(newCourseDetailesId == 0)
								{
									retVal = false;
								}
								else
								{
									Statement stmt = connection.createStatement();
									if(stmt.executeUpdate("INSERT INTO student_has_course  "
														+ "(student_has_course.student_idstudent, "
														+ "student_has_course.student_user_id, "
														+ "student_has_course.course_courseId,"
														+ "student_has_course.finished_course_detailes_finished_course_id ) "
														+ "values ("+studentId+ "," + userId +","+ courseId +","+newCourseDetailesId+");") == 0)
									
									{
										retVal = false;
									}
								}
							}
							else
							{
								retVal = false;
							}
						}
						else
						{
							retVal = false;
						}
						
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
	
	public static boolean addStudentToPrev(String courseName, int userId){
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
					int studentId = getStudentId(userId);
					if(studentId != 0)
					{
						if(getStudentInCourseId(courseId, studentId) == 0)
						{
							retVal = false;
						}
						else
						{
							//to 
							Statement stmt = connection.createStatement();
							if(stmt.executeUpdate("INSERT INTO student_has_course  "
												+ "(student_has_course.student_idstudent, "
												+ "student_has_course.student_user_id, "
												+ "student_has_course.course_courseId ) "
												+ "values ("+studentId+ "," + userId +","+ courseId +");") == 0)
							
							{
								retVal = false;
							}
						}
					}
					else
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
	
	public static boolean isCourseExist(int courseId){
		
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT courseId FROM course WHERE course.courseId = '" +courseId + "';");
			if(resultSet.first()) {

				retVal = true;
			}
		}
		catch (SQLException e) {e.printStackTrace();}
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
	
	public static boolean isTeacherExist(int userId){
		
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT teacherId FROM teacher WHERE teacher.user_id = '" +userId + "';");
			if(resultSet.first()) {

				retVal = true;
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	
	
	public static int getStudentInCourseId(int courseId, int studentId){
		
		int	 retVal = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT student_has_courseId FROM student_has_course "
					+ "WHERE student_has_course.student_idstudent = '" +studentId + "' "
							+ "AND student_has_course.course_courseId = '" +courseId+ "';");
			if(resultSet.first()) {

				retVal = resultSet.getInt(1);
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
				stmt.executeUpdate("INSERT INTO course (name) VALUES ('" +courseName+"')");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();			
		}		
		return retVal;
	}
	
	public ArrayList<Integer> getStudensInCourse(int courseId)
	{
		ArrayList<Integer> myList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT student_user_id FROM student_has_course "
					+ "WHERE student_has_course.course_courseId = '" +courseId + "';");
			
			
			while(resultSet.next())
	 		{				
				myList.add(resultSet.getInt(1));
	 		} 
		}
		catch (SQLException e) {e.printStackTrace();}
		return myList;
	}
	
	public static int getClassIdFromClassName(String className)
	{
		int retVal = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT classId FROM class WHERE class.name = '" + className + "';");
			if(resultSet.first()) {

				retVal = resultSet.getInt(1);
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static boolean isStudentInClass(int classId, int userId){
		
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT * FROM class_has_student "
					+ "WHERE class_has_student.student_user_id = '" +userId + "' "
							+ "&& class_has_student.class_classId = '" +classId+ "';");
			if(resultSet.first()) {

				retVal = true;
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static boolean addStudentToClass(String className, int userId){
		boolean retVal = true;
		int classId = getClassId(className);
		if(classId == 0)
		{
			retVal = false;
		}
		else
		{
			retVal =  addStudentToClass(classId, userId);
		}
		return retVal;
	}
	
	public static boolean addStudentToClass(int classId, int userId){
		boolean retVal = true;
		
		if(getUserType(userId) == EUserType.EUserStudent)
		{

			try 
			{
				if(isClassExist(classId))
				{
					int studentId = getStudentId(userId);
					if(studentId != 0)
					{
						
						if(isStudentInClass(classId, userId))
						{
							retVal = false;
						}
						else
						{
							Statement stmt = connection.createStatement();
							if(stmt.executeUpdate("INSERT INTO class_has_student  "
												+ "(class_has_student.student_idstudent, "
												+ "class_has_student.student_user_id, "
												+ "class_has_student.class_classId ) "
												+ "values ("+studentId+ "," + userId +","+ classId +");") == 0)
							
							{
								retVal = false;
							}
						}
					}
					else
					{
						retVal = false;
					}
				}
				else
				{
					retVal = false;
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
	
	public ArrayList<Integer> getStudensInClass(int classId)
	{
		ArrayList<Integer> myList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT student_user_id FROM class_has_student "
					+ "WHERE class_has_student.class_classId = '" +classId + "';");
			
			
			while(resultSet.next())
	 		{				
				myList.add(resultSet.getInt(1));
	 		} 
		}
		catch (SQLException e) {e.printStackTrace();}
		return myList;
	}
	
	public static boolean isCourseInClass(int classId, int courseId){
		
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT * FROM class_has_course "
					+ "WHERE class_has_course.course_courseId = '" +courseId + "' "
							+ "&& class_has_course.class_classId = '" +classId+ "';");
			if(resultSet.first()) {

				retVal = true;
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	
	public static boolean isCourseInPrevCourse(int courseId, int prevCourseId){
		
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT * FROM prev_requested_course "
					+ "WHERE prev_requested_course.course_courseId = '" +courseId + "' "
							+ "&& prev_requested_course.course_courseId1 = '" +prevCourseId+ "';");
			if(resultSet.first()) {

				retVal = true;
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	public static boolean addCourseToClass(int classId, int courseId){
		boolean retVal = true;

		try 
		{
			if(isClassExist(classId))
			{
				if(isCourseExist(courseId))
				{
					if(isCourseInClass(classId, courseId))
					{
						retVal = false;
					}
					else
					{
						Statement stmt = connection.createStatement();
						if(stmt.executeUpdate("INSERT INTO class_has_course  "
											+ "(class_has_course.class_classId, "
											+ "class_has_course.course_courseId ) "
											+ "values ("+classId+","+ courseId +");") == 0)
						
						{
							retVal = false;
						}
					}
				}
				else
				{
					retVal = false;
				}
			}
			else
			{
				retVal = false;
			}	
		}
		catch (SQLException e) {
			e.printStackTrace();			
		}		
		return retVal;
	}

	public static boolean isTeacherInClassWithCourse(int teacherId, int classId, int courseId){
		
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT class_has_course.teacher_teacherId FROM class_has_course "
					+ "WHERE class_has_course.class_classId = '" +classId + "' "
							+ "AND class_has_course.course_courseId = '" +courseId+ "';");
			if(resultSet.first()) {

				retVal = true;
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	
	public static boolean addTeacherToCourseInClass(int classId, int courseId, int userID){
		boolean retVal = true;
		try 
		{
			if(isClassExist(classId))
			{
				if(isCourseExist(courseId))
				{
					if(isCourseInClass(classId, courseId))
					{
						int teacherId = getTeacherId(userID);
						if(teacherId != 0)
						{
							int teachingUnit = getTeacherUnitId(teacherId);
							if(teachingUnit != 0)
							{
								int courseTeachingUnit = getCourseTeachingUnitId(classId);
								if(courseTeachingUnit != 0)
								{
									if(courseTeachingUnit == teachingUnit)
									{
										if(!isTeacherInClassWithCourse(teacherId, classId, courseId))
										{
											Statement stmt = connection.createStatement();
											if(stmt.executeUpdate("UPDATE class_has_course SET "
													+ "class_has_course.teacher_teacherId = "+teacherId +", "
													+ "class_has_course.teacher_user_id  = "+ userID +""
													+ " WHERE class_has_course.class_classId = " +classId +" AND"
													+ " class_has_course.course_courseId = "+ courseId + ";") == 0)
											{
												retVal = false;
											}
										}
										else
										{
											retVal = false;
										}
	
									}
									else
									{
										retVal = false;
									}
								}
								else
								{
									retVal = false;
								}
							}
							else
							{
								retVal = false;
							}
						}
						else
						{
							retVal = false;
						}
					}
					else
					{
						retVal = false;
					}
				}
				else
				{
					retVal = false;
				}
			}
			else
			{
				retVal = false;
			}	
		}
		catch (SQLException e) {
			e.printStackTrace();			
		}		
		return retVal;
	}
	
	
	public static boolean isTeachingUnitExist(String unitName){
		
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT teachingUnitId FROM teachingunit WHERE teachingunit.name = '" +unitName + "';");
			if(resultSet.first()) {

				retVal = true;
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}

	public static boolean isTeachingUnitExist(int unitId){
		
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT teachingUnitId FROM teachingunit WHERE teachingunit.teachingUnitId = '" +unitId + "';");
			if(resultSet.first()) {

				retVal = true;
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	
	public static boolean createTeachingUnit( String unitName){
		
		boolean retVal = true;
		try 
		{
			if(isTeachingUnitExist(unitName))
			{
				retVal = false;
			}
			else
			{
				Statement stmt = connection.createStatement();
				stmt.executeUpdate("INSERT INTO teachingunit (name) VALUES ('" +unitName+"')");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();			
		}		
		return retVal;
	}
	
	public static boolean isTeachingUnitInCourse(int courseId){
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT teachingunit_teachingUnitId FROM course WHERE course.courseId = '" +courseId + "';");
			if(resultSet.first()) {

				if(resultSet.getInt(1) == 0)
				{
					retVal = false;
				}
				else
				{
					retVal = true;
				}
				
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	


	
	public static ArrayList<Integer> getStudentFinishedCourses(int studentId)
	{
		ArrayList<Integer> courseIdList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery(
					"SELECT student_has_course.course_courseId "
					+ "FROM student_has_course "
					+ "RIGHT JOIN finished_course_detailes "
					+ "ON student_has_course.student_has_courseId = finished_course_detailes.finished_course_id  "
					+ "WHERE finished_course_detailes.isFinished = 1 "
					+ "and student_has_course.student_idstudent = "+studentId+";");
			while(resultSet.next())
	 		{				
				courseIdList.add(resultSet.getInt(1));
	 		} 
		}
		catch (SQLException e) {e.printStackTrace();}
		return courseIdList;
	}
	
	public static ArrayList<Integer> getPrevCourses(int courseId)
	{
		ArrayList<Integer> courseIdList = new ArrayList<Integer>();
		ArrayList<Integer> courentIdList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery(
					"SELECT course_courseId1 FROM prev_requested_course "
					+ "WHERE prev_requested_course.course_courseId = "+courseId+";");
			
			while(resultSet.next())
	 		{				
				courentIdList.add(resultSet.getInt(1));
				courseIdList.add(resultSet.getInt(1));
	 		} 
			
			while(!courentIdList.isEmpty())
			{
				stmt = connection.createStatement();
				resultSet  = stmt.executeQuery(
						"SELECT course_courseId1 FROM prev_requested_course "
						+ "WHERE prev_requested_course.course_courseId = "+courentIdList.remove(0)+";");
				
				while(resultSet.next())
		 		{				
					courentIdList.add(resultSet.getInt(1));
					courseIdList.add(resultSet.getInt(1));
		 		} 
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return courseIdList;
	}
	
	
	public static boolean isStudentFinishedPrevCourse(int studentId, int courseId){
		boolean retVal = true;
		ArrayList<Integer> prevCourseIdList = getPrevCourses(courseId);
		ArrayList<Integer> studentFinishedCourseIdList = getStudentFinishedCourses(studentId);

		boolean good = true;
		for (int i = 0; i < prevCourseIdList.size(); i ++) {
		    if (!(studentFinishedCourseIdList.contains(prevCourseIdList.get(i)))) {
		    	retVal = false;
		        break;
		    }
		}
		return retVal;
	}
	
	public static int getTeachingUnitIdFromUnitName(String unitName)
	{
		int retVal = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT teachingUnitId FROM teachingunit WHERE teachingunit.name = '" + unitName + "';");
			if(resultSet.first()) {

				retVal = resultSet.getInt(1);
			}
			
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static boolean addTeachingUnitToCourse(int unitId , int courseId){
		boolean retVal = true;
		try 
		{
			if(isCourseExist(courseId))
			{
				if(isTeachingUnitExist(unitId))
				{
					if(isTeachingUnitInCourse(courseId))
					{
						retVal = false;
					}
					else
					{
						Statement stmt = connection.createStatement();
						if(stmt.executeUpdate("UPDATE course SET teachingunit_teachingUnitId=" + courseId + " WHERE courseId=" + courseId ) == 0)
						{
							retVal = false;
						}
					}
				}
				else
				{
					retVal = false;
				}

			}
			else
			{
				retVal = false;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();			
		}		
		
		return retVal;
	}
	
	
	public static boolean createTeacher(int userId, int maxTeachingHours, int teachingUnit)
	{
		boolean retVal = true;
		try 
		{
			if(isTeacherExist(userId))
			{
				retVal = false;
			}
			else
			{
				if(getUserType(userId)  == EUserType.EUserTeacher)
				{
					if(isTeachingUnitExist(teachingUnit))
					{
						Statement stmt = connection.createStatement();
						stmt.executeUpdate("INSERT INTO teacher (user_id, maxHours, teachingUnit_teachingUnitId) VALUES ('" +userId+"','"+ maxTeachingHours +"','" +teachingUnit +"')");
						
					}
					else
					{
						retVal = false;
					}
				}
				else
				{
					retVal = false;
				}
			}
		}
		catch (SQLException e) {
			e.printStackTrace();			
		}		
		return retVal;
	}
	
	
	public static boolean addPrevCourseToCourse(int courseId, int prevCourseId){
		boolean retVal = true;

		try 
		{
			if(isCourseExist(courseId))
			{
				if(isCourseExist(prevCourseId))
				{
					
					if(isCourseInPrevCourse(courseId, prevCourseId))
					{
						retVal = false;
					}
					else
					{
						int courseIdTeachingUint = getCourseTeachingUnitId(courseId);
						int prevCourseIdTeachingUint = getCourseTeachingUnitId(prevCourseId);
						Statement stmt = connection.createStatement();
						if(stmt.executeUpdate("INSERT INTO prev_requested_course  "
											+ "(prev_requested_course.course_courseId, "
											+ "prev_requested_course.course_courseId1, "
											+ "prev_requested_course.course_teachingunit_teachingUnitId,"
											+ "prev_requested_course.course_teachingunit_teachingUnitId1) "
											+ "values ("+courseId+","+ prevCourseId +","
											+ courseIdTeachingUint + ","+ prevCourseIdTeachingUint + ");") == 0)
						
						{
							retVal = false;
						}
					}
				}
				else
				{
					retVal = false;
				}
			}
			else
			{
				retVal = false;
			}	
		}
		catch (SQLException e) {
			e.printStackTrace();			
		}		
		return retVal;
	}	
	public static boolean updateFinishedCourseDetailes(int studentCourseDetailesId,int grade, int semester){
		boolean retVal = true;
		try{
			Statement stmt = connection.createStatement();
			if(0 == stmt.executeUpdate("UPDATE finished_course_detailes SET "
					+ "isFinished = 1, grade = "+grade+", semester = "+ semester +
					" WHERE finished_course_detailes.finished_course_id = '"+ studentCourseDetailesId+ "';"))
			{
				retVal = false;
			}
		}
		catch (SQLException e) {
			retVal = false;
			e.printStackTrace();			
		}
		return retVal;
	}
	
	public static boolean finishCourse(int courseId, int studentId, int grade, int semester){
		boolean retVal = true;
		int studentCourseId = getStudentInCourseId(courseId, studentId);
		if(studentCourseId != 0)
		{
			updateFinishedCourseDetailes(studentCourseId, grade, semester);
		}
		else
		{
			retVal = false;
		}
		
		return retVal;
	}
	
	public ArrayList<Integer> getClassTeachersStatistics(){
		ArrayList<Integer> myList = new ArrayList<Integer>();
		return myList;
	}
	
	public ArrayList<Integer> getTeacherClassesStatistics(){
		ArrayList<Integer> myList = new ArrayList<Integer>();
		return myList;
	}
	
	public ArrayList<Integer> getClassesCoursesStatistics(){
		ArrayList<Integer> myList = new ArrayList<Integer>();
		return myList;
	}
}


