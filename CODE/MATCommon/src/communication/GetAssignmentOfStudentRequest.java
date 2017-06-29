package communication;

public class GetAssignmentOfStudentRequest extends Message 
{
private static final long serialVersionUID = 1L;
	
	private int submissionNumber;
	
public GetAssignmentOfStudentRequest(int submissionNumber) {
		super();
		this.submissionNumber = submissionNumber;
	}



	public int getSubmissionNumber() {
		return submissionNumber;
	}

	public void setSubmissionNumber(int submissionNumber) {
		this.submissionNumber = submissionNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
