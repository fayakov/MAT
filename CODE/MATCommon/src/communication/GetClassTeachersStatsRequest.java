package communication;

public class GetClassTeachersStatsRequest extends Message {

	private static final long serialVersionUID = 1L;

	private int classNumber;

	public GetClassTeachersStatsRequest(int classNumber) {
		super();
		this.classNumber = classNumber;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
}
