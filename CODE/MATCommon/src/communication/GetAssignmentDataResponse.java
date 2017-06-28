package communication;

import java.util.ArrayList;

public class GetAssignmentDataResponse extends Message 
{
private static final long serialVersionUID = 1L;
	
	boolean requestSecceded;
	private String errText;
	ArrayList<Integer> ListOfStudentAssignment = new ArrayList<Integer>();

}
