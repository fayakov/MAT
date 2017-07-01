package entities;

public class SubmissionResponse  extends Submission {
	private int grade;
	
	public void setGrade(int grade){
		this.grade = grade;
	}
	
	public int getGrade(){
		return grade;
	}
}
