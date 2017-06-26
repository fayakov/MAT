package entities;

public class CourseWithGrade {
	private float m_grade;
	private String m_courseName;
    
    public CourseWithGrade(float grade, String name) {
    	m_grade = grade;
    	m_courseName = name;
    }  
    
    public float getGrade(){
    	return m_grade;
    }
    
    public String getName(){
    	return m_courseName;
    }
}
