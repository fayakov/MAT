package communication;

public class AddAssignmentForStudentRequest extends Message 
{
private static final long serialVersionUID = 1L;
	
	String file;
	
	
	public AddAssignmentForStudentRequest(String file) 
	{
		super();
		this.file = file;
	}
	

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
