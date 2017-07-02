package communication;

public class GetAssignmentsOfStudentRequest extends Message 
{
	private static final long serialVersionUID = 1L;
	
	private int userID;
	
	
	public GetAssignmentsOfStudentRequest(int userID) 
	{
		super();
		this.userID = userID;
	}

	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}


	
	
	
	

	
	
	
}
