package communication;

public class GetAssignmentsOfStudentRequest extends Message 
{
	private static final long serialVersionUID = 1L;
	
	private int studentID;
	
	public GetAssignmentsOfStudentRequest(int assignmentNumber) {
		super();
		this.studentID = assignmentNumber;
	}
	
	public int getAssignmentNumber() {
		return studentID;
	}

	public void setAssignmentNumber(int assignmentNumber) {
		this.studentID = assignmentNumber;
	}
}
