package DAL;

import java.sql.*;

import entities.Teacher;
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
			//connection = DriverManager.getConnection(connectionString);
			System.out.println("SQL connection succeed");
		}
		catch(SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
	
	public static Teacher getTeacher(StringBuilder teacher, int id)
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
/*	        	for  (int i = 1; i<=numColumn ; i++)
	        	{
	        		if (i > 1) teacher.append(", ");
	                String columnValue = resultSet.getString(i);
	                //System.out.print(columnValue + " " + rsmd.getColumnName(i));
	            	
	        		//teacher.append(resultSet.getString(i) + "," );
	                teacher.append(columnValue);
	        	}
	            System.out.println("");*/
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
	
    private static void writeMetaData(){

    	try{
	    		
	    	Statement stmt = connection.createStatement();
			ResultSet resultSet  = stmt.executeQuery("SELECT * FROM teacher;");
	        System.out.println("The columns in the table are: ");
	
	        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
	        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
	                System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
	        }
	    }
    	catch (SQLException e) {e.printStackTrace();}
    }
	
}
