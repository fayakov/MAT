package communication;

public class GetClassDataRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int ClassNumber;

	public GetClassDataRequest(int classNumber) {
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

