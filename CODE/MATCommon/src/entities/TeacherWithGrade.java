package entities;

import java.io.Serializable;


/**
 * The Class TeacherWithGrade.
 */
public class TeacherWithGrade implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The m grade. */
	private float m_grade;
	
	/** The m teacher name. */
	private String m_teacherName;
    
    /**
     * Instantiates a new teacher with grade.
     *
     * @param grade the grade
     * @param name the name
     */
    public TeacherWithGrade(float grade, String name) {
    	m_grade = grade;
    	m_teacherName = name;
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
    	return m_teacherName;
    }
}
