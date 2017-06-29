package communication;

public class AddEvaluationFormRequest extends Message 
{
	private static final long serialVersionUID = 1L;
	int grade;
	String comment;
	
	
	public AddEvaluationFormRequest(int grade, String comment) 
	{
		super();
		this.grade = grade;
		this.comment = comment;
	}
	
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
