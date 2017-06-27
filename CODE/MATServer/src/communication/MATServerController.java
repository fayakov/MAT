package communication;

import DAL.*;
import logic.LoginRequestHandler;
import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;

public class MATServerController extends AbstractServer
{
	final public static int DEFAULT_PORT = 5555;	  

	CDal matDAL;
	
	private static MATServerController instance = null;
	
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
}
