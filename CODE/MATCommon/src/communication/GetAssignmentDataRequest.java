package communication;

public class GetAssignmentDataRequest extends Message 
{
	private static final long serialVersionUID = 1L;
	
	private int assignmentNumber;
	
	public GetAssignmentDataRequest(int assignmentNumber) {
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
