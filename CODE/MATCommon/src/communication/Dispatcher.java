package communication;

import java.util.HashMap;
import java.util.Map;

import utils.Handler;

public class Dispatcher {
	private static Map<String,Handler> dispatch = new HashMap<String,Handler>();
	
	public static void addHandler(String msgName, Handler h) {
		dispatch.put(msgName, h);
	}
	
	public static void handleMessage(Message msg, Object obj) {
	    Handler h = dispatch.get(msg.getClass().getCanonicalName());
	    if (h != null) {
	    	h.handle(msg, obj);
	    }
	}
}
