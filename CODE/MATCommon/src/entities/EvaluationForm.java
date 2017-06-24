package entities;

import java.io.Serializable;

public class EvaluationForm implements Serializable 
{
	private String comment;
	private int grade;
	
	
	public String getComment() 
	{
		return comment;
	}
	public void setComment(String comment) 
	{
		this.comment = comment;
	}
	public int getGrade() 
	{
		return grade;
	}
	public void setGrade(int grade) 
	{
		this.grade = grade;
	}
}
