import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

import controller.loginController;

/**
 * The Class MATClientMain.
 */
public class MATClientMain extends Application {
			
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main( String args[] ) throws Exception
	{ 
        launch(args);		
	} // end main
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage arg0) throws Exception {

		loginController loginCont = new loginController();		
		loginCont.start(arg0);
	}

	/* (non-Javadoc)
	 * @see javafx.application.Application#stop()
	 */
	@Override
	public void stop() throws Exception {
				
		super.stop();
		Platform.exit();
		System.exit(0);
	}
	
}
