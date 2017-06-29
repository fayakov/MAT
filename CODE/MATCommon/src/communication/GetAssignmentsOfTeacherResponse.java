package communication;

import java.util.ArrayList;

public class GetAssignmentsOfTeacherResponse extends Message 
{
	
private static final long serialVersionUID = 1L;
	
	boolean requestSecceded;
	private String errText;
	ArrayList<Integer> ListOfStudenstSubmissions = new ArrayList<Integer>();
	
	
public GetAssignmentsOfTeacherResponse(boolean requestSecceded, String errText,
			ArrayList<Integer> listOfStudenstSubmissions) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
		ListOfStudenstSubmissions = listOfStudenstSubmissions;
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


public ArrayList<Integer> getListOfStudenstSubmissions() {
	return ListOfStudenstSubmissions;
}


public void setListOfStudenstSubmissions(ArrayList<Integer> listOfStudenstSubmissions) {
	ListOfStudenstSubmissions = listOfStudenstSubmissions;
}


public static long getSerialversionuid() {
	return serialVersionUID;
}

	
	
	
}
