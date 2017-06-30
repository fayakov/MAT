package communication;

public class GetClassToTeachersStatsRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int ClassNumber;

	public GetClassToTeachersStatsRequest(int classNumber) {
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

