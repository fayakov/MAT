package communication;

import java.io.Serializable;

public class Message implements Serializable 
{
	int msgType;
	protected String[] tokens;
	protected StringBuilder str;
	public Message()
	{
	}
	
	public Message(int type)
	{
		str = new StringBuilder();
		msgType = type;
		str.append(String.valueOf(msgType) + ",");
	}
	
	public String getString()
	{
		return str.toString();
	}
	public void toData(String str)
	{
		tokens = str.split(",");
		msgType = Integer.parseInt(tokens[0]);
	}
	public int getType()
	{
		return msgType;
	}
}
