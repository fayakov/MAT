package communication;

public class MessageSetTeacherUnit extends Message
{
	protected String[] tokens;
	protected StringBuilder str;
	
	public MessageSetTeacherUnit(Message msg)
	{
	//	tokens = msg.tokens;
	//	str = msg.str;
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

	public int getTeachingUnit() {
		// TODO Auto-generated method stub
		return Integer.parseInt(tokens[2]);
	}

	public void setTeachingUnit(int teachingUnit) {
		// TODO Auto-generated method stub
		str.append(String.valueOf(teachingUnit) + ",");
	}
}
