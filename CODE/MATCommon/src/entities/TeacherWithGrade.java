package entities;

public class TeacherWithGrade {
	private float m_grade;
	private String m_teacherName;
    
    public TeacherWithGrade(float grade, String name) {
    	m_grade = grade;
    	m_teacherName = name;
    }  
    
    public float getGrade(){
    	return m_grade;
    }
    
    public String getName(){
    	return m_teacherName;
    }
}
