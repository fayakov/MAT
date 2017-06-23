package entities;


public class Semester {

	private String semesterNumber;
	private String semesterName;
	private String semesterAB;   //{ A, B}
	
	//private Date startDate = new Date();
	//private Date endDate = new Date();
	
	public Semester(String num, String name, String semester){
		semesterNumber = num;
		semesterName = name;
		semesterAB = semester;
	}
	
	public String getSemesterNumber() {
		return semesterNumber;
	}
	public void setSemesterNumber(String semesterNum) {
		this.semesterNumber = semesterNum;
	}
	public String getSemesterName() {
		return semesterName;
	}
	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}
	public String getSemester() {
		return semesterAB;
	}
	public void setSemester(String semester) {
		this.semesterAB = semester;
	}

}
