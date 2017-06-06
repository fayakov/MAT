package communication;

import ocsf.client.*;

import java.io.*;

import entities.Teacher;

public class MATClientController extends AbstractClient
{
	public MATClientController(String host, int port) throws IOException 
	{
		super(host, port); //Call the superclass constructor

		openConnection();
	}

	protected void handleMessageFromServer(Object msg) 
	{
		if (msg instanceof Teacher)
		{
			Teacher teacher = (Teacher)msg;
			System.out.println("Id:" + teacher.getId());
			System.out.println("First Name:" + teacher.getFirstName());
			System.out.println("Last Name:" + teacher.getLastName());
			System.out.println("Teaching unit:" + teacher.getTeachingUnit());
			System.out.println("Max hours:" + teacher.getMaxHours());
		}
		else
		{
			Message rcvMessage = new Message();
			rcvMessage.toData(msg.toString());
			int command = rcvMessage.getType();
			if (command == 3)
			{
				MessageSendTeacherData teacherData = new MessageSendTeacherData(rcvMessage);			
				System.out.println("teacher Name:" + teacherData.getTeacherName());
				System.out.println("teaching unit:" + teacherData.getTeachingUnit());
				System.out.println("teaching max hours:" + teacherData.getMaxHours());
			}
			else
			{
				System.out.println("Error: received unknown command <" + msg + "> from server");
			}
		}		
	}

	public void handleMessageFromClientUI(Object message) 
	{
		// TODO Auto-generated method stub
		try
	    {			
	    	sendToServer(message);
	    }
	    catch(IOException e)
	    {
	    	System.out.println("Could not send message to server.  Terminating client.");	      
	    }
	}		
}
