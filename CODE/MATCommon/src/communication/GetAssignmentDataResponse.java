package communication;

import java.util.ArrayList;

public class GetAssignmentDataResponse extends Message 
{
private static final long serialVersionUID = 1L;
	
	boolean requestSecceded;
	private String errText;
	
	String courseName;
	String teacherName;
	String LastDate;
	//file
	
	
public GetAssignmentDataResponse(boolean requestSecceded, String errText, String courseName, String teacherName,
			String lastDate) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
		this.courseName = courseName;
		this.teacherName = teacherName;
		LastDate = lastDate;
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


public String getCourseName() {
	return courseName;
}


public void setCourseName(String courseName) {
	this.courseName = courseName;
}


public String getTeacherName() {
	return teacherName;
}


public void setTeacherName(String teacherName) {
	this.teacherName = teacherName;
}


public String getLastDate() {
	return LastDate;
}


public void setLastDate(String lastDate) {
	LastDate = lastDate;
}


public static long getSerialversionuid() {
	return serialVersionUID;
}

	
	
	
	
	

}
