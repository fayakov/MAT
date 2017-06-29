package communication;

public class GetClassDataRequest extends Message {
	private static final long serialVersionUID = 1L;
	
<<<<<<< HEAD
	private String classNum;

	public GetClassDataRequest(String classNum) {
		super();
		this.classNum = classNum;
	}

	public String getClassNum() {
		return classNum;
	}

	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}	
=======
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
	

>>>>>>> master
}

