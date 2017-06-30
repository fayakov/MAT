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
	
	public static Teacher getTeacherData( int id)
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
	
	public static int getTeacherUserId(int teacherId){
		int retVal = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT  user_id FROM teacher WHERE teacher.teacherId = '" + teacherId + "';");
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
					retVal = false;
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
	
	public static String getCourseName(int courseId){
		String retVal = new String();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT  name FROM course WHERE course.courseId = '" +courseId + "';");
			if(resultSet.first()) {

				retVal = resultSet.getString(1);
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static String getClassName(int classId){
		String retVal = new String();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT  name FROM class WHERE class.classId = '" +classId + "';");
			if(resultSet.first()) {

				retVal = resultSet.getString(1);
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static String getUserName(int userId){
		String retVal = new String();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT firstName, lastName  FROM user WHERE user.id = '" +userId + "';");
			if(resultSet.first()) {

				retVal = resultSet.getString(1) + " " + resultSet.getString(2) ;
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
	
	private static int createNewCourseDetailesToStudentWithCourseId(int semester)
	{
		int retVal = 0;
			try {
			Statement stmt = connection.createStatement();
			if(stmt.executeUpdate("INSERT INTO finished_course_detailes  "
								+ "(isNew, semester) "
								+ "values (true, "+semester+");") != 0)
			
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

	private static int getStudentCourseDetailesId(int courseId, int studentId, int semesterId){
		
		int	 retVal = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT finished_course_detailes_finished_course_id FROM student_has_course "
					+ "WHERE student_has_course.student_idstudent = " +studentId + " "
					+ "AND student_has_course.course_courseId = " +courseId+ " "
					+ "AND student_has_course.semester_semesterId = " + semesterId + ";");
			if(resultSet.first()) {

				retVal = resultSet.getInt(1);
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	private static int getStudentInCourseId(int courseId, int studentId, int semesterId){
		
		int	 retVal = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT student_has_courseId FROM student_has_course "
					+ "WHERE student_has_course.student_idstudent = " +studentId + " "
					+ "AND student_has_course.course_courseId = " +courseId+ " "
					+ "AND student_has_course.semester_semesterId = " + semesterId + ";");
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
	
	public ArrayList<Integer> getStudensInCourse(int courseId, int semesterId)
	{
		ArrayList<Integer> myList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT student_idstudent FROM student_has_course "
					+ "WHERE student_has_course.course_courseId = " +courseId + " "
					+ "AND student_has_course.semester_semesterId =  " + semesterId +";");
			
			
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
							int curSemester = getCurrentSemester();
							if(curSemester != 0)
							{
								Statement stmt = connection.createStatement();
								if(stmt.executeUpdate("INSERT INTO class_has_student  "
													+ "(class_has_student.student_idstudent, "
													+ "class_has_student.student_user_id, "
													+ "class_has_student.class_classId,"
													+ "class_has_student.semester_semesterId ) "
													+ "values ("+studentId+ "," + userId +","+ classId +","+curSemester+");") == 0)
								
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
	
	public static boolean isCourseInClass(int classId, int courseId, int semesterId){
		
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT * FROM class_has_course "
					+ "WHERE class_has_course.course_courseId = " +courseId + " "
					+ "AND class_has_course.class_classId = " +classId+ " "
					+ "AND class_has_course.semester_semesterId = " +semesterId+ ";");
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
					int curSemester = getCurrentSemester();
					if(curSemester != 0)
					{
						if(isCourseInClass(classId, courseId, curSemester))
						{
							retVal = false;
						}
						else
						{
							int setmester = getCurrentSemester();
							if(setmester != 0)
							{
								Statement stmt = connection.createStatement();
								if(stmt.executeUpdate("INSERT INTO class_has_course  "
													+ "(class_has_course.class_classId, "
													+ "class_has_course.course_courseId, "
													+ "class_has_course.semester_semesterId) "
													+ "values ("+classId+","+ courseId +","+setmester+");") == 0)
								
								{
									retVal = false;
								}
							}

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

	public static boolean isTeacherInClassWithCourse(int teacherId, int classId, int courseId, int semester){
		
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT class_has_course.teacher_teacherId FROM class_has_course "
					+ "WHERE class_has_course.class_classId = " +classId + " "
					+ "AND class_has_course.course_courseId = " +courseId+ " "
					+ "AND class_has_course.teacher_teacherId= "+ teacherId +" "
					+ "AND class_has_course.semester_semesterId = " +semester+";");
			if(resultSet.first()) {

				retVal = true;
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static int getTeacherInClassWithCourse(int classId, int courseId, int semester){
		
		int retVal = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT class_has_course.teacher_teacherId FROM class_has_course "
					+ "WHERE class_has_course.class_classId = " +classId + " "
					+ "AND class_has_course.course_courseId = " +courseId+ " "
					+ "AND class_has_course.semester_semesterId = " +semester+";");
			if(resultSet.first()) {

				retVal = resultSet.getInt(1);
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	
	
	
	public static boolean addTeacherToCourseInClass(int classId, int courseId, int userID){
		boolean retVal = true;
		try 
		{
			int curSemester = getCurrentSemester();
			if(curSemester != 0)
			{
				if(isClassExist(classId))
				{
					if(isCourseExist(courseId))
					{
						if(isCourseInClass(classId, courseId, curSemester))
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
											if(!isTeacherInClassWithCourse(teacherId, classId, courseId, curSemester))
											{
												Statement stmt = connection.createStatement();
												if(stmt.executeUpdate("UPDATE class_has_course SET "
														+ "class_has_course.teacher_teacherId = "+teacherId +", "
														+ "class_has_course.teacher_user_id  = "+ userID +""
														+ " WHERE class_has_course.class_classId = " +classId +" AND"
														+ " class_has_course.course_courseId = "+ courseId + " AND "
														+ " class_has_course.semester_semesterId = " +curSemester+";") == 0)
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
	
	public static boolean changeTeacherToCourseInClass(int classId, int courseId, int userID){
		boolean retVal = true;
		try 
		{
			int curSemester = getCurrentSemester();
			if(curSemester != 0)
			{
				if(isClassExist(classId))
				{
					if(isCourseExist(courseId))
					{
						if(isCourseInClass(classId, courseId, curSemester))
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
											Statement stmt = connection.createStatement();
											if(stmt.executeUpdate("UPDATE class_has_course SET "
													+ "class_has_course.teacher_teacherId = "+teacherId +", "
													+ "class_has_course.teacher_user_id  = "+ userID +""
													+ " WHERE class_has_course.class_classId = " +classId +" AND"
													+ " class_has_course.course_courseId = "+ courseId + " AND "
													+ " class_has_course.semester_semesterId = " +curSemester+";") == 0)
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
					+ "ON student_has_course.finished_course_detailes_finished_course_id  = finished_course_detailes.finished_course_id  "
					+ "WHERE finished_course_detailes.isFinished = 1 "
					+ "AND student_has_course.student_idstudent = "+studentId+";");
			while(resultSet.next())
	 		{				
				courseIdList.add(resultSet.getInt(1));
	 		} 
		}
		catch (SQLException e) {e.printStackTrace();}
		return courseIdList;
	}
	
	public static ArrayList<Integer> getStudentCourses(int studentId)
	{
		ArrayList<Integer> courseIdList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery(
					"SELECT student_has_course.course_courseId "
					+ "FROM student_has_course "
					+ "RIGHT JOIN finished_course_detailes "
					+ "ON student_has_course.finished_course_detailes_finished_course_id  = finished_course_detailes.finished_course_id  "
					+ "WHERE student_has_course.student_idstudent = "+studentId+";");
			while(resultSet.next())
	 		{				
				courseIdList.add(resultSet.getInt(1));
	 		} 
		}
		catch (SQLException e) {e.printStackTrace();}
		return courseIdList;
	}
	
	public static ArrayList<Integer> getStudentClasses(int studentId)
	{
		ArrayList<Integer> classIdList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery(
					"SELECT student_has_course.class_classId "
					+ "FROM student_has_course  "
					+ "WHERE student_has_course.student_idstudent = "+studentId+";");
			while(resultSet.next())
	 		{				
				classIdList.add(resultSet.getInt(1));
	 		} 
		}
		catch (SQLException e) {e.printStackTrace();}
		return classIdList;
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
	
	public static boolean finishStudentCourse(int courseId, int studentId, int grade, int semester){
		boolean retVal = true;
		int studentCourseDetailesId = getStudentCourseDetailesId(courseId, studentId, semester);
		if(studentCourseDetailesId != 0)
		{
			retVal = updateFinishedCourseDetailes(studentCourseDetailesId, grade, semester);
		}
		else
		{
			retVal = false;
		}
		
		return retVal;
	}
	
	public ArrayList<Integer> getTeacherInClass(int ClassId, int semester)
	{
		ArrayList<Integer> teacherList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT teacher_teacherId "
					+ "FROM class_has_course WHERE class_has_course.class_classId = " + ClassId + " "
					+ "AND class_has_course.semester_semesterId = " + semester +";");
			while(resultSet.next()){

				teacherList.add(resultSet.getInt(1));
			}
			
		}
		catch (SQLException e) {e.printStackTrace();}
		return teacherList;
	}
	
	public ArrayList<Integer> getTeacherInCourse(int CourseId, int semesterId)
	{
		ArrayList<Integer> teacherList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT teacher_teacherId FROM class_has_course "
					+ "WHERE class_has_course.course_courseId = " + CourseId + " "
					+ "AND class_has_course.semester_semesterId = " + semesterId +";");
			while(resultSet.next()){

				teacherList.add(resultSet.getInt(1));
			}
			
		}
		catch (SQLException e) {e.printStackTrace();}
		return teacherList;
	}
	
	
	
	
	public ArrayList<Integer> getCourseInClass(int ClassId, int semesterId)
	{
		ArrayList<Integer> courseList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT course_courseId "
					+ "FROM class_has_course WHERE class_has_course.class_classId = " + ClassId + " "
					+ "AND class_has_course.semester_semesterId = " + semesterId +";");
			while(resultSet.next()){

				courseList.add(resultSet.getInt(1));
			}
			
		}
		catch (SQLException e) {e.printStackTrace();}
		return courseList;
	}
	
	public static int getFinishedGrade(int studentId, int courseId)
	{
		int grade = -1;
		int finishedCourseId = getStudentHasCourseId(studentId,courseId);
		if(finishedCourseId != 0)
		{
			try 
			{
				Statement stmt = connection.createStatement();
				ResultSet resultSet  = stmt.executeQuery("SELECT grade  FROM finished_course_detailes "
						+ "WHERE finished_course_detailes.finished_course_id = " + finishedCourseId + " "
						+ "AND finished_course_detailes.isFinished = 1;");
				if(resultSet.first()) {
					grade = resultSet.getInt(1);
				}
			}
			catch (SQLException e) {e.printStackTrace();}
		}
		return grade;
	}
	
	private static  int getStudentHasCourseId(int studentId, int courseId)
	{
		int id = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT student_has_courseId  FROM student_has_course "
					+ "WHERE student_has_course.course_courseId = " + courseId + " "
					+ "AND student_has_course.student_idstudent = "+studentId +";");
			if(resultSet.first()) {

				id= resultSet.getInt(1);
				
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return id;
	}
	
	private static  int getStudentHasCourseId(int studentId, int courseId, int semesterId)
	{
		int id = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT student_has_courseId  FROM student_has_course "
					+ "WHERE student_has_course.course_courseId = " + courseId + " "
					+ "AND student_has_course.student_idstudent = "+studentId +" "
					+ "AND student_has_course.semester_semesterId = " + semesterId + ";");
			if(resultSet.first()) {

				id= resultSet.getInt(1);
				
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return id;
	}
	
	public static ArrayList<Integer> getCourseOfClassWithTeacherGrade(int classId, int teacherId, int semesterId)
	{
		ArrayList<Integer> courseList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT course_courseId FROM class_has_course "
					+ "WHERE class_has_course.class_classId = " + classId + " "
					+ "AND class_has_course.teacher_teacherId = "+ teacherId + " "
					+ "AND class_has_course.semester_semesterId = " + semesterId +";");
			while(resultSet.next()){

				courseList.add(resultSet.getInt(1));
			}
			
		}
		catch (SQLException e) {e.printStackTrace();}
		return courseList;
	}
	
	
	public ArrayList<Integer> getTeacherCourses(int teahcerId, int semesterId)
	{
		ArrayList<Integer> courseList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT course_courseId FROM class_has_course "
					+ "WHERE class_has_course.teacher_teacherId = " + teahcerId + " "
					+ "AND class_has_course.semester_semesterId = " + semesterId +";");
			while(resultSet.next()){

				courseList.add(resultSet.getInt(1));
			}
			
		}
		catch (SQLException e) {e.printStackTrace();}
		return courseList;
	}
	
	public ArrayList<Integer> getTeacherClasses(int teahcerId, int semesterId)
	{
		ArrayList<Integer> classList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT class_classId "
					+ "FROM class_has_course WHERE class_has_course.teacher_teacherId = " + teahcerId + " "
					+ "AND class_has_course.semester_semesterId = " + semesterId +";");
			while(resultSet.next()){

				classList.add(resultSet.getInt(1));
			}
			
		}
		catch (SQLException e) {e.printStackTrace();}
		return classList;
	}
	
	public ArrayList<Integer> getClassesTeacher(int classId, int semesterId)
	{
		ArrayList<Integer> classList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT teacher_teacherId FROM "
					+ "class_has_course WHERE class_has_course.class_classId = " + classId + " "
					+ "AND class_has_course.semester_semesterId = " + semesterId +";");
			while(resultSet.next()){

				classList.add(resultSet.getInt(1));
			}
			
		}
		catch (SQLException e) {e.printStackTrace();}
		return classList;
	}
	
	
	
	
	
	// get statistics from all class of teacher
	public ArrayList<ClassWithGrade> getTeacherClassesStatistics(int teacherId, int semesterId){
		ArrayList<ClassWithGrade> myList = new ArrayList<ClassWithGrade>();
		ArrayList<Integer> classes = getTeacherClasses(teacherId,semesterId);
	
		for (int classId : classes) {
			ArrayList<Integer> courseList = getCourseOfClassWithTeacherGrade(classId, teacherId, semesterId);
			int sum = 0;
			int cnt = 0;
			for (int courseId : courseList) {
				
				ArrayList<Integer> studentList = getStudensInCourse(courseId,semesterId);
				
				for (int studentId : studentList) {
					int curGrade = getFinishedGrade(studentId, courseId);
					if(curGrade != -1)
					{
						sum+= curGrade;
						cnt++;
					}
					
				}
			}
			ClassWithGrade classGrade = new ClassWithGrade((float)(sum/cnt) , getClassName(classId));
			myList.add(classGrade);
		}
	
		
		return myList;
	}
	
	
	
	public ArrayList<TeacherWithGrade> getClassTeacherStatistics(int classId,  int semesterId){
		ArrayList<TeacherWithGrade> myList = new ArrayList<TeacherWithGrade>();
		ArrayList<Integer> teachers = getClassesTeacher(classId, semesterId);
	
		for (int teacher : teachers) {
			ArrayList<Integer> courseList = getCourseOfClassWithTeacherGrade(classId, teacher, semesterId);
			int sum = 0;
			int cnt = 0;
			for (int courseId : courseList) {
				
				ArrayList<Integer> studentList = getStudensInCourse(courseId,semesterId);
				
				for (int studentId : studentList) {
					int curGrade = getFinishedGrade(studentId, courseId);
					if(curGrade != -1)
					{
						sum+= curGrade;
						cnt++;
					}
					
				}
			}
			
			TeacherWithGrade classGrade = new TeacherWithGrade((float)(sum/cnt) , getUserName(getTeacherUserId(teacher)));
			myList.add(classGrade);
		}
		return myList;
	}
	
	
	public ArrayList<CourseWithGrade> getClassesCoursesStatistics(int classId, int semesterId){
		ArrayList<CourseWithGrade> myList = new ArrayList<CourseWithGrade>();
		ArrayList<Integer> courses = getCourseInClass(classId, semesterId);

		for (int course : courses) {
			ArrayList<Integer> studentList = getStudensInCourse(course,semesterId);
			int sum = 0;
			int cnt = 0;
			for (int studentId : studentList) {
				int curGrade = getFinishedGrade(studentId, course);
				if(curGrade != -1)
				{
					sum+= curGrade;
					cnt++;
				}
				
			}
			CourseWithGrade courseGrade = new CourseWithGrade((float)(sum/cnt) , getCourseName(course));
			myList.add(courseGrade);
		}
		return myList;
	}
	
	
	public static boolean createNewSemester(Date start, Date end)
	{
		boolean retVal = true;
		int curSemester = getCurrentSemester();
		if(curSemester != 0)
		{
			if(!closeCurrentSemester())
			{
				return false;
			}
		}
		
		try{
			Statement stmt = connection.createStatement();
			if(stmt.executeUpdate("INSERT INTO semester (startDate, endDate) VALUES "
					+ "('" +start.getYear()+"-"+(start.getMonth() + 1)+"-"+(start.getDate()+1) +"','"+end.getYear()+"-"+(end.getMonth()+1)+"-"+(end.getDate()+1) +"')") != 0)
			{
				retVal = false;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();	
		}
		return retVal;
	}
	
	public static int getCurrentSemester()
	{
		int retVal = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT semesterId FROM semester WHERE semester.isCurrent = 1;");
			if(resultSet.first()) {

				retVal = resultSet.getInt(1);
			}
			
		}
		catch (SQLException e) 
		{
			e.printStackTrace();			
		}
		return retVal;
	}
	
	private static boolean closeCurrentSemester()
	{
		boolean retVal = true;
		try 
		{
			Statement stmt = connection.createStatement();
			return (stmt.executeUpdate("UPDATE semester SET isCurrent = 0 WHERE isCurrent = 1;") > 0);	 	
		}
		catch (SQLException e) 
		{
			e.printStackTrace();			
		}
		return false;
	}
	
	public static int getParentId(int userId){
		int retVal = 0;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT parentId FROM parent WHERE parent.user_id = '" +userId + "';");
			if(resultSet.first()) {

				retVal = resultSet.getInt(1);
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static boolean isParentHasStudent(int parentId, int studentId)
	{
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT student_idstudent FROM parent_has_student "
					+ "WHERE parent_has_student.parent_parentId = " +parentId + " "
					+ "AND parent_has_student.student_idstudent =" +studentId + ";");
			if(resultSet.first()) {

				retVal = true;
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static boolean addStudentToParent(int parentUserId, int studentUserId)
	{	
		boolean retVal = true;
		int studentId = getStudentId(studentUserId);
		if(studentId != 0)
		{
			int parentId = getParentId(parentUserId);
			if(parentId != 0)
			{
				
				if(!isParentHasStudent(parentId, studentId))
				{
					try{
						Statement stmt = connection.createStatement();
						if(stmt.executeUpdate("INSERT INTO parent_has_student  "
											+ "(parent_has_student.parent_parentId, "
											+ "parent_has_student.student_idstudent, "
											+ "parent_has_student.student_user_id) "
											+ "values ("+parentId+ "," + studentId +","+ studentUserId +");") == 0)
						{
							retVal = false;
						}
					}
					catch (SQLException e) {
						retVal = false;
						e.printStackTrace();			
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
				
		return retVal;
	
		
	}
	
	public static boolean blockParent(int parentId, int studentId ,boolean toBlock)
	{
		boolean retVal = true;
		if(isParentHasStudent(parentId, studentId))
		{		
			boolean isBlocked  = isParentHasStudentBlocked(parentId, studentId);
			if(toBlock)
			{
				if(isBlocked)
				{
					retVal = false;
				}
				else
				{
					try{ 
						Statement stmt = connection.createStatement();
						retVal = (stmt.executeUpdate("UPDATE parent_has_student SET isBlocked = 1 "
								+ "WHERE parent_has_student.parent_parentId = " + parentId +" "
								+ " AND parent_has_student.student_idstudent = "+studentId+";") > 0);
					}
					catch (SQLException e) {
						retVal = false;
						e.printStackTrace();			
					}
				}
			}
			else
			{
				if(!isBlocked)
				{
					retVal = false;
				}
				else
				{
					try{ 
						Statement stmt = connection.createStatement();
						retVal = (stmt.executeUpdate("UPDATE parent_has_student SET isBlocked = 0 "
								+ "WHERE parent_has_student.parent_parentId = " + parentId +" "
								+ " AND parent_has_student.student_idstudent = "+studentId+";") > 0);
					}
					catch (SQLException e) {
						retVal = false;
						e.printStackTrace();			
					}
				}
			}

		}
		else
		{
			retVal = false;
		}
		return retVal;
	}

	public static ArrayList<Integer> getParentsChildrens(int parentId)
	{
		ArrayList<Integer> myList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT student_idstudent FROM parent_has_student "
					+ "WHERE parent_has_student.parent_parentId = " +parentId +";");
			
			
			while(resultSet.next())
	 		{				
				myList.add(resultSet.getInt(1));
	 		} 
		}
		catch (SQLException e) {e.printStackTrace();}
		return myList;
	}
	
	public static ArrayList<Integer> getChildrenParents(int studentId)
	{
		ArrayList<Integer> myList = new ArrayList<Integer>();
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT parent_parentId FROM parent_has_student "
					+ "WHERE parent_has_student.student_idstudent = " +studentId +";");
			
			
			while(resultSet.next())
	 		{				
				myList.add(resultSet.getInt(1));
	 		} 
		}
		catch (SQLException e) {e.printStackTrace();}
		return myList;
	}
	
	public static boolean isParentHasStudentBlocked(int parentId, int studentId)
	{
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT isBlocked FROM parent_has_student "
					+ "WHERE parent_has_student.parent_parentId = " +parentId + " "
					+ "AND parent_has_student.student_idstudent = " + studentId + ";");
			if(resultSet.first()) {

				retVal = resultSet.getBoolean(1);
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static boolean isParentExist(int userId)
	{
		boolean retVal = false;
		try 
		{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT parentId FROM parent WHERE parent.user_id = '" +userId + "';");
			if(resultSet.first()) {

				retVal = true;
			}
		}
		catch (SQLException e) {e.printStackTrace();}
		return retVal;
	}
	
	public static boolean createParant(int userId)
	{
		boolean retVal = true;
		if(isParentExist(userId))
		{
			retVal = false;
		}
		else
		{
			if(getUserType(userId)  == EUserType.EUserParent)
			{
				
				try{ 
					Statement stmt = connection.createStatement();
					stmt.executeUpdate("INSERT INTO parent (user_id) VALUES ('" +userId+"')");
				}
				catch (SQLException e) {
					e.printStackTrace();			
				}
			}
			else
			{
				retVal = false;
			}
		}
		return retVal;
	}
	
	public static boolean addStudentToCourseWithClass(int courseId, int ClassId, int userId){
		boolean retVal = true;
		
		if(getUserType(userId) == EUserType.EUserStudent)
		{

			try 
			{
				int studentId = getStudentId(userId);
				if(studentId != 0)
				{
					if(isStudentFinishedPrevCourse(studentId,courseId))
					{
						int curSemester = getCurrentSemester();
						if(curSemester != 0)
						{
							int studentCourseId = getStudentInCourseId(courseId, studentId, curSemester);
							if(studentCourseId == 0)
							{
								if(isCourseInClass(ClassId, courseId , curSemester))
								{
									int newCourseDetailesId = createNewCourseDetailesToStudentWithCourseId(curSemester);
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
																+ "student_has_course.finished_course_detailes_finished_course_id, "
																+ "student_has_course.class_classId, "
																+ "semester_semesterId) "
																+ "values ("+studentId+ "," + userId +","+ courseId +","+newCourseDetailesId+ "," + ClassId +","+ +curSemester+");") == 0)
											
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
						else
						{
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
	
	private static boolean removeStudentCourseDetails(int studentCourseId)
	{
		boolean retVal = true;
		try{
			Statement stmt = connection.createStatement();
			if(stmt.executeUpdate("DELETE from finished_course_detailes "
					+ "WHERE finished_course_detailes.finished_course_id = "+studentCourseId +" ")== 0)
			{
				retVal = false;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();			
		}	
		return retVal;
	}
	
	public static boolean removeStudentFromCourseWithClass(int courseId, int classId, int userId){
		boolean retVal = true;
	
		try{
			int curSemester = getCurrentSemester();
			if(curSemester != 0)
			{
				int studentId = getStudentId(userId);
				if(studentId != 0)
				{
					int StudentCourseDetailesId = getStudentCourseDetailesId(courseId, studentId, curSemester);
					if(StudentCourseDetailesId != 0)
					{
						Statement stmt = connection.createStatement();
						if(stmt.executeUpdate("DELETE from student_has_course "
								+ "WHERE student_has_course.student_user_id = "+userId +" "
								+ "AND student_has_course.class_classId = "+ classId+" "
								+ "AND student_has_course.course_courseId ="+  courseId+";")== 0)
						{
							retVal = false;
						}
						else
						{
							if(removeStudentCourseDetails(StudentCourseDetailesId))
							{
								
							}
							else
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
	
	private static boolean isRequestExist( int type, int userId, int classId, int courseId, int semester)
	{
		boolean retVal = false;
		try{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT requestId FROM request "
					+ "WHERE request.classId = " +classId + " "
					+ "AND request.courseId = " +courseId + " "
					+ "AND request.requestType = " +type + " "
					+ "AND request.semester_semesterId = " +semester + " "
					+ "AND request.userId = " +userId + " "
					+ "AND request.isHandled = 0;");
			if(resultSet.first()) {
				retVal = true;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();	
		}	

		
		return retVal;
	}
	
	public static boolean isRequestHandled(int reqNumber)
	{
		boolean retVal = true;
		try{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT isHandled FROM request "
					+ "WHERE request.requestId = " +reqNumber + ";");
			if(resultSet.first()) {
				retVal = resultSet.getBoolean(1);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();	
	}
		return retVal;
	}
	
	public static boolean confirmRequest(int reqNumber, boolean toConfirm)
	{		
		boolean retVal = true;
		if(!isRequestHandled(reqNumber))
		{
			try{
				Statement stmt = connection.createStatement();
				retVal = (stmt.executeUpdate("UPDATE request SET isConfirmed = " + toConfirm + ", isHandled = 1 "
						+ "WHERE request.requestId = " + reqNumber +";") > 0);
			}
			catch (SQLException e) {
				e.printStackTrace();	
			}	
		}
		else
		{
			
		}

		return retVal;
	}
	
	public static Request getRequest(int reqNumber, Request req)
	{
		try{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT * FROM request "
					+ "WHERE request.requestId = " + reqNumber + ";");
			if(resultSet.first()) {	
				ERequestType reqType = ERequestType.addStudent;
				switch(resultSet.getInt(2))
				{
					case 1:
						reqType = ERequestType.addStudent;
						break;
					case 2:
						reqType = ERequestType.removeStudent;
						break;
					case 3:
						reqType = ERequestType.changeTeacher;
						break;
				}
				req = new Request(resultSet.getInt(1), resultSet.getInt(3) , resultSet.getInt(4), resultSet.getInt(5), resultSet.getBoolean(7),resultSet.getBoolean(6), reqType);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();	
		}	
		return req;
	}
	
	
	
	public static ArrayList<Request> getRequests(int semester)
	{
		ArrayList<Request> reqArr = new ArrayList<Request>(); 
		try{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT * FROM request "
					+ "WHERE request.isHandled = 0;");
			while(resultSet.next())
	 		{				
				ERequestType reqType = ERequestType.addStudent;
				switch(resultSet.getInt(2))
				{
				case 1:
					reqType = ERequestType.addStudent;
					break;
				case 2:
					reqType = ERequestType.removeStudent;
					break;
				case 3:
					reqType = ERequestType.changeTeacher;
					break;
				}
				Request req = new Request(resultSet.getInt(1), resultSet.getInt(3) , resultSet.getInt(4), resultSet.getInt(5), resultSet.getBoolean(7),resultSet.getBoolean(6), reqType);
				reqArr.add(req);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();	
		}	

		
		return reqArr;
	}
	
	private static void printMetaData(ResultSet resultSet)
	{
		try{
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i <= columnCount; i++ ) {
			  String name = rsmd.getColumnName(i);
			  System.out.println(name);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();	
		}	
	}
	
	public static boolean isRequestInputValid( ERequestType type, int userId, int classId, int courseId, int semesterId)
	{
		boolean retVal = true;
		switch(type)
		{
			case addStudent:
			{
				int studentId = getStudentId(userId);
				if(studentId != 0)
				{
					if(isCourseInClass(classId, courseId, semesterId))
					{
						if(getStudentHasCourseId(studentId, courseId, semesterId) != 0)
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
				break;
			}
			case removeStudent:
			{
				int studentId = getStudentId(userId);
				if(studentId != 0)
				{
					if(isCourseInClass(classId, courseId, semesterId))
					{
						if(getStudentHasCourseId(studentId, courseId, semesterId) == 0)
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
				break;
			}
			case changeTeacher:
			{
				int teacherId = getTeacherId(userId);
				if(teacherId != 0)
				{
					if(isCourseInClass(classId, courseId, semesterId))
					{
						if(isTeacherInClassWithCourse(teacherId, classId, courseId, semesterId))
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
				break;
			}
			default:
				retVal = false;
				break;
		}
		return retVal;
	}
	
	
	
	public static boolean createRequest( ERequestType type, int userId, int classId, int courseId)
	{
		boolean retVal = true;
		int curSemester = getCurrentSemester();
		if(curSemester != 0)
		{
			if(isRequestInputValid(type, userId, classId, courseId, curSemester))
			{
				boolean errorType = false;
				int reqType = 0;
				switch(type)
				{
				case addStudent:
					reqType = 1;
					break;
				case removeStudent:
					reqType = 2;
					break;
				case changeTeacher:
					reqType = 3;
					break;
				default:
					errorType = true;
					break;
				}
				if(!errorType)
				{
					if(!isRequestExist(reqType, userId, classId, courseId, curSemester))
					{
						try{ 
							Statement stmt = connection.createStatement();
							stmt.executeUpdate("INSERT INTO request "
									+ "(classId, courseId, requestType, semester_semesterId, userId) "
									+ "VALUES ("+classId+","+courseId+","+reqType+","+curSemester+","+userId+")");
						}
						catch (SQLException e) {
							e.printStackTrace();	
						}	
					}
					else
					{
						retVal = false;
					}
						
				}
			}
		}
		
		return retVal;
	}
		

	public static boolean addStudentToCourse(int courseId, int studentID, CDALError error) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean addDeleteStudentFromCourseRequest(int courseId, int studentID, CDALError error) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean addChangeTeacherRequest(Request request, CDALError error) {
		// TODO Auto-generated method stub
		// Yinon: Add the request to db and return the request number to user
		return false;
	}

	public static boolean setPrincipalDecision(Request request, CDALError error) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean getPendingRequests(ArrayList<Request> requests, CDALError error) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean getStudentData(int userId, Student studentData, CDALError error) {
		boolean retVal = true;
		Student student = new Student();
		try{
			Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT * FROM student "
					+ "WHERE student.user_id = " + userId + ";");
			if(resultSet.first()) {
				User user = new User();
				if(getUserData(userId, user))
				{
					int studentId = getStudentId(userId);
					if(studentId != 0)
					{
						student.setAllUserData(user);	
						student.setCourse(getStudentCourses(userId));
						student.setClassID(getStudentClasses(userId));
						student.setParentID(getChildrenParents(studentId));
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
	
	public static boolean getParentData(int userId, Parent parentData, CDALError error) {
	
	boolean retVal = true;
	parentData  = new Parent();
	try{
	catch (SQLException e) {
		e.printStackTrace();	
	}	
	return retVal;
	}
	
	
}



