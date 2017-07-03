package entities;

import java.io.Serializable;


/**
 * The Class EvaluationForm.
 */
public class EvaluationForm implements Serializable 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The comment. */
	private String comment;
	
	/** The grade. */
	private int grade;
	
	
	/**
	 * Gets the comment.
	 *
	 * @return the comment
	 */
	public String getComment() 
	{
		return comment;
	}
	
	/**
	 * Sets the comment.
	 *
	 * @param comment the new comment
	 */
	public void setComment(String comment) 
	{
		this.comment = comment;
	}
	
	/**
	 * Gets the grade.
	 *
	 * @return the grade
	 */
	public int getGrade() 
	{
		return grade;
	}
	
	/**
	 * Sets the grade.
	 *
	 * @param grade the new grade
	 */
	public void setGrade(int grade) 
	{
		this.grade = grade;
	}
}
