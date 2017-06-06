import communication.*;


public class MATServerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int port = 0; //Port to listen on
		String pass = "";
		
	    try
	    {
	    	pass = args[0];
	    	port = Integer.parseInt(args[1]); //Get port from command line	      
	    }
	    catch(Throwable t)
	    {
	      port = 5555; //DEFAULT_PORT; //Set port to 5555
	    }
			   
	    MATServerController serverController = new MATServerController(pass, port);
	    
	    try 
	    {
	      serverController.listen(); //Start listening for connections
	    } 
	    catch (Exception ex) 
	    {
	      System.out.println("ERROR - Could not listen for clients!");
	    }
	}

}
