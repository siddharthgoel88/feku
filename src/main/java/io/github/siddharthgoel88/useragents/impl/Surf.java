package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Surf
 */
public class Surf extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Surf/0.4.1 (X11; U; Unix; en-US) AppleWebKit/531.2+ Compatible (Safari; MSIE 9.0)"
		};
		return userAgentStrings;
	}
}