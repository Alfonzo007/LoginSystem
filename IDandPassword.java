package logingsystem;

import java.util.HashMap;

public class IDandPassword {
	HashMap<String, String> loginifo = new HashMap<String,String>();
	
	IDandPassword() {
		loginifo.put("bro", "pizza");
		loginifo.put("brometheus", "PASSWORD");
		loginifo.put("broCode", "abc123");
	}
	
	protected HashMap getLoginInfo() {
		return loginifo;
	}

}
