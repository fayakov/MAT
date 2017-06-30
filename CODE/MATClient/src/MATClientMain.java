import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

import controller.loginController;

public class MATClientMain extends Application {
			
	public static void main( String args[] ) throws Exception
	{ 
        launch(args);		
	} // end main
	
	@Override
	public void start(Stage arg0) throws Exception {

		loginController loginCont = new loginController();		
		loginCont.start(arg0);
	}

	@Override
	public void stop() throws Exception {
				
		super.stop();
		Platform.exit();
		System.exit(0);
	}
	
}
