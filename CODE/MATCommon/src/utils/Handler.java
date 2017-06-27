package utils;

import communication.Message;

public interface Handler {
	 void handle(Message msg, Object obj);
}
