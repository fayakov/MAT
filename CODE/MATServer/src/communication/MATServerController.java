package communication;

import java.io.IOException;

import DAL.*;
import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;

public class MATServerController extends AbstractServer
{
	final public static int DEFAULT_PORT = 5555;	  

	CDal matDAL;
	
	public MATServerController(String db_password, int port) {
		super(port);
		// TODO Auto-generated constructor stub
		
		// TODO Auto-generated method stub
		matDAL = new CDal();
		matDAL.connect(db_password);
	}

	protected void handleMessageFromClient(Object msg, ConnectionToClient client) 
	{
		
		Message rcvMessage = new Message();
		rcvMessage.toData(msg.toString());
		int command = rcvMessage.getType();
		if (command == 1)
		{
			MessageGetTeacher getTeacher = new MessageGetTeacher(rcvMessage);
/*			if(matDAL.getTeacher(teacher,getTeacher.getTeacherID()))
			{
				Message sendMessage = new Message(3);
				MessageSendTeacherData sendTeacher = new MessageSendTeacherData(sendMessage);
				sendTeacher.setString(teacher.toString());
				//System.out.println(teacher.toString());*/
				try
				{
					//client.sendToClient(sendTeacher.getString());
					client.sendToClient(matDAL.getTeacher(getTeacher.getTeacherID()));
				}
				catch(IOException ioExp)
				{
					System.out.println("cant send to client");
				}
			//}
	
		}
		else if (command == 2)
		{
			MessageSetTeacherUnit setTeacherUnit = new MessageSetTeacherUnit(rcvMessage);
			if(matDAL.setTeacherUnit(setTeacherUnit.getTeacherID(), setTeacherUnit.getTeachingUnit()))
			{
				System.out.println("update teching unit succeeded.");
/*				Message sendMessage = new Message(3);
				MessageSendTeacherData sendTeacher = new MessageSendTeacherData(sendMessage);
				sendTeacher.setString(Teacher.toString());
				try
				{
					client.sendToClient(sendTeacher.getString());
				}
				catch(IOException ioExp)
				{
					System.out.println("cant send to client");
				} */
			}
			else
				System.out.println("update teching unit failed.");
//			int teacherId = 123;
	//		int teachingUnit = 2;
		//	matDAL.setTeacherUnit(teacherId, teachingUnit);
			
		}
		else
		{
			System.out.println("Error: received unknown command <" + msg + "> from " + client);
		}
	}
	
	protected void serverStarted()
	{
		System.out.println ("Server listening for connections on port " + getPort());
	}
	  
	/**
	 * This method overrides the one in the superclass.  Called
	 * when the server stops listening for connections.
	*/
	protected void serverStopped()
	{
		System.out.println ("Server has stopped listening for connections.");
	}
}
