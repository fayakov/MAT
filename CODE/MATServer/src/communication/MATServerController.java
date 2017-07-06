/*
 * 
 */
package communication;

import java.io.IOException;

import DAL.*;
import logic.*;
import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;

/**
 * The Class MATServerController is singleton class that provide all the communication capability for the server to the clients.
 * The class extends AbstractServer of OCSF library.
 */
public class MATServerController extends AbstractServer
{
	
	/** The Constant DEFAULT_PORT. */
	final public static int DEFAULT_PORT = 5555;	  

	/** The mat DAL. */
	CDal matDAL;
	
	/** The instance. */
	private static MATServerController instance = null;
	
	/** The current logged in user id. */
	private static int currentLoggedInUserId = 0;
	
	/** The current logged in user password. */
	private static String currentLoggedInUserPassword = "";
	
	/**
	 * Instantiates a new MAT server controller.
	 *
	 * @param db_password the db password
	 * @param port the port
	 */
	private MATServerController(String db_password, int port) {
		super(port);
		
		bindHandlersToMessages();
		
		//matDAL = new CDal();
		CDal.connect(db_password);
		CDal.logoutAllUsers();
	}
	
	/**
	 * Gets the single instance of MATServerController.
	 *
	 * @return single instance of MATServerController
	 */
	public static MATServerController getInstance() {
		if (instance == null)
			instance = new MATServerController("admin", DEFAULT_PORT);
		
		return instance;
	}

	/**
	 * Bind handlers to messages.
	 * This method bind request messages to server handlers via the server's Dispatcher.
	 */
	private void bindHandlersToMessages() {
		
		
		Dispatcher.addHandler(LoginRequestMsg.class.getCanonicalName(), new LoginRequestHandler());
		Dispatcher.addHandler(DefineCourseRequest.class.getCanonicalName(), new DefineCourseRequestHandler());
		Dispatcher.addHandler(AddAssignmentForStudentRequest.class.getCanonicalName(), new AddAssignmentForStudentRequestHandler());
		Dispatcher.addHandler(AddCheckAssignmentRequest.class.getCanonicalName(), new AddCheckAssignmentRequestHandler());				
		Dispatcher.addHandler(AddClassToCourseRequest.class.getCanonicalName(), new AddClassToCourseRequestHandler());
		Dispatcher.addHandler(AddEvaluationFormRequest.class.getCanonicalName(), new AddEvaluationFormRequestHandler());
		Dispatcher.addHandler(AddStudentToClassRequest.class.getCanonicalName(), new AddStudentToClassRequestHandler());
		Dispatcher.addHandler(AddStudentToCourseRequest.class.getCanonicalName(), new AddStudentToCourseRequestHandler());
		Dispatcher.addHandler(AddTeacherToCourseClassRequest.class.getCanonicalName(), new AddTeacherToCourseClassRequestHandler());		
		Dispatcher.addHandler(BlockParentRequest.class.getCanonicalName(), new BlockParentRequestHandler());
		Dispatcher.addHandler(ChangeTeacherRequest.class.getCanonicalName(), new ChangeTeacherRequestHandler());
		Dispatcher.addHandler(CreateAssignmentRequest.class.getCanonicalName(), new CreateAssignmentRequestHandler());
		Dispatcher.addHandler(OpenSemesterRequest.class.getCanonicalName(), new CreateNewSemesterRequestHandler());
		Dispatcher.addHandler(DefineClassRequest.class.getCanonicalName(), new DefineClassRequestHandler());
		Dispatcher.addHandler(DeleteStudentFromCourseRequest.class.getCanonicalName(), new DeleteStudentFromCourseRequestHandler());
		Dispatcher.addHandler(GetAssignmentsOfStudentRequest.class.getCanonicalName(), new GetAssignmentsOfStudentRequestHandler());
		Dispatcher.addHandler(GetAssignmentsOfTeacherRequest.class.getCanonicalName(), new GetAssignmentsOfTeacherRequestHandler());		
		Dispatcher.addHandler(GetClassDataRequest.class.getCanonicalName(), new GetClassDataRequestHandler());
		Dispatcher.addHandler(GetClassDataRequest.class.getCanonicalName(), new GetClassDataRequestHandler());
		Dispatcher.addHandler(GetParentDataRequest.class.getCanonicalName(), new GetParentDataRequestHandler());
		Dispatcher.addHandler(GetPendingRequestsRequest.class.getCanonicalName(), new GetPendingRequestsRequestHandler());
		Dispatcher.addHandler(GetStudentDataByUserIDRequest.class.getCanonicalName(), new GetStudentDataRequestByUserIdHandler());
		Dispatcher.addHandler(GetStudentDataByStudentIDRequest.class.getCanonicalName(), new GetStudentDataRequestByStudentIdHandler());
		Dispatcher.addHandler(GetTeacherDataRequest.class.getCanonicalName(), new GetTeacherDataRequestHandler());
		Dispatcher.addHandler(GetTeacherStatsRequest.class.getCanonicalName(), new GetTeacherStatsRequestHandler());
		Dispatcher.addHandler(OpenSemesterRequest.class.getCanonicalName(), new OpenSemesterRequestHandler());
		Dispatcher.addHandler(PrincipalDecisionRequest.class.getCanonicalName(), new PrincipalDecisionRequestHandler());
		Dispatcher.addHandler(GetClassTeachersStatsRequest.class.getCanonicalName(), new GetClassTeachersStatsRequestHandler());
		Dispatcher.addHandler(GetClassCoursesStatsRequest.class.getCanonicalName(), new GetClassCoursesStatsRequestHandler());
		Dispatcher.addHandler(DefineAssignmentRequest.class.getCanonicalName(), new DefineAssignmentRequestHandler());
		
	}
	
	/* (non-Javadoc)
	 * @see ocsf.server.AbstractServer#handleMessageFromClient(java.lang.Object, ocsf.server.ConnectionToClient)
	 */
	protected void handleMessageFromClient(Object msg, ConnectionToClient client) 
	{		
		Dispatcher.handleMessage((Message)msg, client);
	}
	
	/* (non-Javadoc)
	 * @see ocsf.server.AbstractServer#serverStarted()
	 */
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

	/* (non-Javadoc)
	 * @see ocsf.server.AbstractServer#clientDisconnected(ocsf.server.ConnectionToClient)
	 */
	@Override
	protected synchronized void clientDisconnected(ConnectionToClient client) {
					
		logoutUser(client);
	}

	/**
	 * Logout user.
	 *
	 * @param client the client
	 */
	private void logoutUser(ConnectionToClient client) {
		CDALError error = new CDALError();
		
		boolean connectionSecceded = CDal.connectUser(false, getCurrentLoggedInUserId(), getCurrentLoggedInUserPassword(), error);
		
		super.clientDisconnected(client);
	}

	/* (non-Javadoc)
	 * @see ocsf.server.AbstractServer#clientException(ocsf.server.ConnectionToClient, java.lang.Throwable)
	 */
	/**
	 * synchronized void clientException(ConnectionToClient client, Throwable exception)
	 * MATServerConroller override the AbstractServer of OCSF library to identify user connection closed
	 * and need to update the user status in databse to logged out.
	 *
	 * @param client the client that disconnected from server.
	 */
	@Override
	protected synchronized void clientException(ConnectionToClient client, Throwable exception) {
		
		logoutUser(client);

		super.clientException(client, exception);
	}

	/**
	 * Gets the current logged in user id.
	 *
	 * @return the current logged in user id
	 */
	public static int getCurrentLoggedInUserId() {
		return currentLoggedInUserId;
	}

	/**
	 * Sets the current logged in user id.
	 *
	 * @param currentLoggedInUserId the new current logged in user id
	 */
	public static void setCurrentLoggedInUserId(int currentLoggedInUserId) {
		MATServerController.currentLoggedInUserId = currentLoggedInUserId;
	}

	/**
	 * Gets the current logged in user password.
	 *
	 * @return the current logged in user password
	 */
	public static String getCurrentLoggedInUserPassword() {
		return currentLoggedInUserPassword;
	}

	/**
	 * Sets the current logged in user password.
	 *
	 * @param currentLoggedInUserPassword the new current logged in user password
	 */
	public static void setCurrentLoggedInUserPassword(String currentLoggedInUserPassword) {
		MATServerController.currentLoggedInUserPassword = currentLoggedInUserPassword;
	}
}
