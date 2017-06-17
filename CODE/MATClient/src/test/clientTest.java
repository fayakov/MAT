package test;

public class clientTest{
	int num;
	
	public static staticClient staticController = null;
    
	public void setNums(int number){
		num = number;
	}
	
	public void startClient()
	{
		staticController = new staticClient();
	}
}

