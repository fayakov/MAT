package entities;

import java.io.Serializable;

public class TeacherWithGrade implements Serializable {
	
	private static final long serialVersionUID = -2991536140659722413L;
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
