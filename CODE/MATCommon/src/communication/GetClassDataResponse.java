package communication;

import entities.CClass;

public class GetClassDataResponse extends Message {

	private static final long serialVersionUID = 1L;
	
	private String errText;
	CClass classData;
	
	public GetClassDataResponse(CClass classData, String errText) {
		super();
		this.errText = errText;
		this.classData = classData;
	}
	
	public String getErrText() {
		return errText;
	}
	public void setErrText(String errText) {
		this.errText = errText;
	}
	public CClass getclassData() {
		return classData;
	}
	public void setclassData(CClass classData) {
		this.classData = classData;
	}
}

