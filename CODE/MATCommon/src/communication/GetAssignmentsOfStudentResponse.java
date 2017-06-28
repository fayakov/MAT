package communication;

import java.util.ArrayList;

import entities.Assignment;


public class GetAssignmentsOfStudentResponse extends Message 
{
	private static final long serialVersionUID = 1L;
	
	boolean requestSecceded;
	private String errText;
	ArrayList<Integer> ListOfStudentAssignment = new ArrayList<Integer>();
	
	public GetAssignmentsOfStudentResponse(boolean requestSecceded, String errText,
			ArrayList<Integer> listOfStudentAssignment) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
		ListOfStudentAssignment = listOfStudentAssignment;
	}

	
	public boolean isRequestSecceded() {
		return requestSecceded;
	}

	public void setRequestSecceded(boolean requestSecceded) {
		this.requestSecceded = requestSecceded;
	}

	public String getErrText() {
		return errText;
	}

	public void setErrText(String errText) {
		this.errText = errText;
	}

	public ArrayList<Integer> getListOfStudentAssignment() {
		return ListOfStudentAssignment;
	}

	public void setListOfStudentAssignment(ArrayList<Integer> listOfStudentAssignment) {
		ListOfStudentAssignment = listOfStudentAssignment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
}
