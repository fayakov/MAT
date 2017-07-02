package communication;

import java.util.HashMap;
import java.util.Map;

import utils.Handler;


/**
 * The Class Dispatcher.
 */
public class Dispatcher {
	
	/** The dispatch. */
	private static Map<String,Handler> dispatch = new HashMap<String,Handler>();
	
	/**
	 * Adds the handler.
	 *
	 * @param msgName the msg name
	 * @param h the h
	 */
	public static void addHandler(String msgName, Handler h) {
		dispatch.put(msgName, h);
	}
	
	/**
	 * Handle message.
	 *
	 * @param msg the msg
	 * @param obj the obj
	 */
	public static void handleMessage(Message msg, Object obj) {
	    Handler h = dispatch.get(msg.getClass().getCanonicalName());
	    if (h != null) {
	    	h.handle(msg, obj);
	    }
	}
}
