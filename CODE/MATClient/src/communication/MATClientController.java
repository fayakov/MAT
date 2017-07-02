package communication;

import ocsf.client.*;

import java.io.*;

import entities.Teacher;
//import logic.LoginRequestHandler;

public class MATClientController extends AbstractClient
{
	final private static String	DEFAULT_HOST = "127.0.0.1";
	final private static int	DEFAULT_PORT = 5555;

	private static MATClientController instance = null;
	
	private MATClientController(String host, int port) throws IOException 
	{
		super(host, port); //Call the superclass constructor

		openConnection();
	}
	
	public static MATClientController getInstance() {
		if (instance == null)
			try {
				instance = new MATClientController(DEFAULT_HOST, DEFAULT_PORT);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return instance;
	}
	

	private void bindHandlersToMessages() {
		//Dispatcher.addHandler(LoginMsgRes.class.getCanonicalName(), new LoginResHandler());
	
	}
	
	protected void handleMessageFromServer(Object msg) 
	{
		Dispatcher.handleMessage((Message)msg, null);
		
		/*
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
		}*/		
	}

	public void sendRequestToServer(Object message) 
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

	public static MATClientController getInstance(String ip, int port) {
		if (instance == null)
			try {
				instance = new MATClientController(ip, port);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return instance;
	}
}
