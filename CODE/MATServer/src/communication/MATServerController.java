package communication;

import java.io.IOException;

import DAL.*;
import logic.*;
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
		Dispatcher.addHandler(GetTeacherToClassesStatsRequest.class.getCanonicalName(), new GetTeacherToClassesStatsRequestHandler());
		Dispatcher.addHandler(OpenSemesterRequest.class.getCanonicalName(), new OpenSemesterRequestHandler());
		Dispatcher.addHandler(PrincipalDecisionRequest.class.getCanonicalName(), new PrincipalDecisionRequestHandler());
		Dispatcher.addHandler(GetClassTeachersStatsRequest.class.getCanonicalName(), new GetClassTeachersStatsRequestHandler());
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
		
		LoginResponseMsg res = new LoginResponseMsg(connectionSecceded, CDal.getUserType(getCurrentLoggedInUserId()), error.getString());
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
