package communication;

public class GetAssignmentsOfStudentRequest extends Message 
{
	private static final long serialVersionUID = 1L;
	
	private int assignmentNumber;
	
	
	public GetAssignmentsOfStudentRequest(int assignmentNumber) 
	{
		super();
		this.assignmentNumber = assignmentNumber;
	}

	
	public int getAssignmentNumber() {
		return assignmentNumber;
	}

	public void setAssignmentNumber(int assignmentNumber) {
		this.assignmentNumber = assignmentNumber;
	}


	
	
	
	

	
	
	
}
