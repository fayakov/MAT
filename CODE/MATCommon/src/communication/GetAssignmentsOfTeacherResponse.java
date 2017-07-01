package communication;

import java.util.ArrayList;

import entities.SubmissionsForTeacherCheck;

public class GetAssignmentsOfTeacherResponse extends Message 
{
private static final long serialVersionUID = 1L;
	
	boolean requestSecceded;
	private String errText;
	private SubmissionsForTeacherCheck subsTeaCheck;
	
	
public GetAssignmentsOfTeacherResponse(boolean requestSecceded, String errText,
			SubmissionsForTeacherCheck subsTeaCheck) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
		this.subsTeaCheck = subsTeaCheck;
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
	public SubmissionsForTeacherCheck getSubsTeaCheck() {
		return subsTeaCheck;
	}
	public void setSubsTeaCheck(SubmissionsForTeacherCheck subsTeaCheck) {
		this.subsTeaCheck = subsTeaCheck;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
}
