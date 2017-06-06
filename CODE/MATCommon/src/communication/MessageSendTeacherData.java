package communication;

import entities.Teacher;

public class MessageSendTeacherData {
	protected String[] tokens;
	protected StringBuilder str;
	Teacher teacherData;
	
	public void SetTeacherData(Teacher teacher)
	{
		this.teacherData = teacher; 
	}
	
	public MessageSendTeacherData(Message msg)
	{
		tokens = msg.tokens;
		str = msg.str;
	}
	public int getTeacherID()
	{
		return Integer.parseInt(tokens[1]);
	}
	
	public void setTeacherID(int teacherId)
	{
		str.append(String.valueOf(teacherId) + ",");
	}
	public String getString()
	{
		return str.toString();
	}

	public String getTeacherName()
	{
		return tokens[2] + " " + tokens[3];
	}
	
	public int getTeachingUnit()
	{
		return Integer.parseInt(tokens[6]);
	}
	
	public int getMaxHours()
	{
		return Integer.parseInt(tokens[5]);
	}
	public void setString(String string)
	{
		str.append(string);
	}
}