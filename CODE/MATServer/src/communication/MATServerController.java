package communication;

import java.io.IOException;

import DAL.*;
import logic.LoginRequestHandler;
import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;

public class MATServerController extends AbstractServer
{
	final public static int DEFAULT_PORT = 5555;	  

	CDal matDAL;
	
	private static MATServerController instance = null;
	private static int currentLoggedInUserId = 0;
	private static String currentLoggedInUserPassword = "";
	
	private MATServerController(String db_password, int port) {
		super(port);
		
		bindHandlersToMessages();
		
		//matDAL = new CDal();
		CDal.connect(db_password);
	}
	
	public static MATServerController getInstance() {
		if (instance == null)
			instance = new MATServerController("admin", DEFAULT_PORT);
		
		return instance;
	}

	private void bindHandlersToMessages() {
		
		Dispatcher.addHandler(LoginRequestMsg.class.getCanonicalName(), new LoginRequestHandler());
				
	}
	
	protected void handleMessageFromClient(Object msg, ConnectionToClient client) 
	{		
		Dispatcher.handleMessage((Message)msg, client);
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

	@Override
	protected synchronized void clientDisconnected(ConnectionToClient client) {
					
		logoutUser(client);
	}

	private void logoutUser(ConnectionToClient client) {
		CDALError error = new CDALError();
		boolean connectionSecceded = CDal.connectUser(false, getCurrentLoggedInUserId(), getCurrentLoggedInUserPassword(), error);		
		
		LoginResponseMsg res = new LoginResponseMsg(connectionSecceded, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		super.clientDisconnected(client);
	}

	@Override
	protected synchronized void clientException(ConnectionToClient client, Throwable exception) {
		// TODO Auto-generated method stub
		logoutUser(client);

		super.clientException(client, exception);
	}

	public static int getCurrentLoggedInUserId() {
		return currentLoggedInUserId;
	}

	public static void setCurrentLoggedInUserId(int currentLoggedInUserId) {
		MATServerController.currentLoggedInUserId = currentLoggedInUserId;
	}

	public static String getCurrentLoggedInUserPassword() {
		return currentLoggedInUserPassword;
	}

	public static void setCurrentLoggedInUserPassword(String currentLoggedInUserPassword) {
		MATServerController.currentLoggedInUserPassword = currentLoggedInUserPassword;
	}
}
