package entities;


/**
 * The Class CourseWithGrade.
 */
public class CourseWithGrade {
	
	/** The m grade. */
	private float m_grade;
	
	/** The m course name. */
	private String m_courseName;
    
    /**
     * Instantiates a new course with grade.
     *
     * @param grade the grade
     * @param name the name
     */
    public CourseWithGrade(float grade, String name) {
    	m_grade = grade;
    	m_courseName = name;
    }  
    
    /**
     * Gets the grade.
     *
     * @return the grade
     */
    public float getGrade(){
    	return m_grade;
    }
    
    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName(){
    	return m_courseName;
    }
}
