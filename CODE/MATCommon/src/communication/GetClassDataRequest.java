package communication;

public class GetClassDataRequest extends Message {
	private static final long serialVersionUID = 1L;
	
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
}
