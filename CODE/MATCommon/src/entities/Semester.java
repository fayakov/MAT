package entities;


public class Semester {

	private int semesterNumber;
	private int year;
	private String semesterAB;   //{ A, B}
	
	//private Date startDate = new Date();
	//private Date endDate = new Date();
	
	public Semester(int num, int getYear, String semester){
		semesterNumber = num;
		year = getYear;
		semesterAB = semester;
	}
	
	public int getSemesterNumber() {
		return semesterNumber;
	}
	public void setSemesterNumber(int semesterNum) {
		this.semesterNumber = semesterNum;
	}
	public int getSemesterYear() {
		return year;
	}
	public void setSemesterYear(int semesterYear) {
		this.year = semesterYear;
	}
	public String getSemester() {
		return semesterAB;
	}
	public void setSemester(String semester) {
		this.semesterAB = semester;
	}
}
