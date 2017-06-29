package communication;

import java.util.ArrayList;


public class GetAssignmentsOfStudentResponse extends Message 
{
	private static final long serialVersionUID = 1L;
	
	ArrayList<Integer> ListOfStudentAssignment = new ArrayList<Integer>();
	
	public GetAssignmentsOfStudentResponse(ArrayList<Integer> listOfStudentAssignment) {
		super();
		ListOfStudentAssignment = listOfStudentAssignment;
	}
	
	public ArrayList<Integer> getListOfStudentAssignment() {
		return ListOfStudentAssignment;
	}

	public void setListOfStudentAssignment(ArrayList<Integer> listOfStudentAssignment) {
		ListOfStudentAssignment = listOfStudentAssignment;
	}
}
