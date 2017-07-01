package communication;

public class GetClassCoursesStatsRequest extends Message {

	private static final long serialVersionUID = 1L;
	
	private int classNumber;

	public GetClassCoursesStatsRequest(int classNumber) {
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
