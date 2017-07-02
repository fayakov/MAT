package entities;


/**
 * The Class ClassWithGrade.
 */
public class ClassWithGrade {
	
	/** The m grade. */
	private float m_grade;
	
	/** The m class name. */
	private String m_className;
    
    /**
     * Instantiates a new class with grade.
     *
     * @param grade the grade
     * @param name the name
     */
    public ClassWithGrade(float grade, String name) {
    	m_grade = grade;
    	m_className = name;
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
    	return m_className;
    }
    

}
