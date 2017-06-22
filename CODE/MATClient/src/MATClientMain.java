import controller.MATClientConsole;


public class MATClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host = "";
	    int port = 5555;  //The port number

	    try
	    {
	      host = args[0];
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	      host = "localhost";
	    }
	    
	    MATClientConsole client = new MATClientConsole(host, 5555);
	    client.accept();  //Wait for console data
	}

}
