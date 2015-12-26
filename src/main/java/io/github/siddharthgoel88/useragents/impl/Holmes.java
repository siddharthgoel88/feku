package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Holmes
 */
public class Holmes extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"holmes/3.9 (someurl.co.cc)",
			"holmes/3.12.4 (http://morfeo.centrum.cz/bot)",
			"holmes/3.12.3 (http://morfeo.centrum.cz/bot)",
			"holmes/3.12.2 (http://morfeo.centrum.cz/bot)",
			"holmes/3.12.1 (http://morfeo.centrum.cz/bot)"
		};
		return userAgentStrings;
	}
}