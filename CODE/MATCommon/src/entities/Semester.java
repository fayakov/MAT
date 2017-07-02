package entities;



/**
 * The Class Semester.
 */
public class Semester {

	/** The semester number. */
	private int semesterNumber;
	
	/** The year. */
	private int year;
	
	/** The semester AB. */
	private String semesterAB;   //{ A, B}
	
	//private Date startDate = new Date();
	//private Date endDate = new Date();
	
	/**
	 * Instantiates a new semester.
	 *
	 * @param num the num
	 * @param getYear the get year
	 * @param semester the semester
	 */
	public Semester(int num, int getYear, String semester){
		semesterNumber = num;
		year = getYear;
		semesterAB = semester;
	}
	
	/**
	 * Gets the semester number.
	 *
	 * @return the semester number
	 */
	public int getSemesterNumber() {
		return semesterNumber;
	}
	
	/**
	 * Sets the semester number.
	 *
	 * @param semesterNum the new semester number
	 */
	public void setSemesterNumber(int semesterNum) {
		this.semesterNumber = semesterNum;
	}
	
	/**
	 * Gets the semester year.
	 *
	 * @return the semester year
	 */
	public int getSemesterYear() {
		return year;
	}
	
	/**
	 * Sets the semester year.
	 *
	 * @param semesterYear the new semester year
	 */
	public void setSemesterYear(int semesterYear) {
		this.year = semesterYear;
	}
	
	/**
	 * Gets the semester.
	 *
	 * @return the semester
	 */
	public String getSemester() {
		return semesterAB;
	}
	
	/**
	 * Sets the semester.
	 *
	 * @param semester the new semester
	 */
	public void setSemester(String semester) {
		this.semesterAB = semester;
	}
}
