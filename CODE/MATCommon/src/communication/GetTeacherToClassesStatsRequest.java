package communication;

public class GetTeacherToClassesStatsRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int ClassNumber;

	public GetTeacherToClassesStatsRequest(int classNumber) {
		super();
		ClassNumber = classNumber;
	}

	public int getClassNumber() {
		return ClassNumber;
	}

	public void setClassNumber(int classNumber) {
		ClassNumber = classNumber;
	}
	

}

