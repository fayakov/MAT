package entities;

public class ClassWithGrade {
	private float m_grade;
	private String m_className;
    
    public ClassWithGrade(float grade, String name) {
    	m_grade = grade;
    	m_className = name;
    }  
    
    public float getGrade(){
    	return m_grade;
    }
    
    public String getName(){
    	return m_className;
    }
    

}
