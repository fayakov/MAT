package communication;

public class MessageGetTeacher extends Message{
	protected String[] tokens;
	protected StringBuilder str;
	public MessageGetTeacher(Message msg)
	{
		//tokens = msg.tokens;
		//str = msg.str;
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
}
