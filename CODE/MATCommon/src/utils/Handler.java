package utils;

import communication.Message;

/**
 * The Interface Handler is the basic interface that operated when message arrived.
 */
public interface Handler {
	 
 	/**
 	 * The handle function need to contain the business logic that the application need to do when a specific
 	 * request arrived to client/server.
 	 *
 	 * @param msg the msg
 	 * @param obj the obj
 	 */
 	void handle(Message msg, Object obj);
}
