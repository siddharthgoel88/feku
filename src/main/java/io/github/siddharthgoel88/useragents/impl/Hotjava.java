package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Hotjava
 */
public class Hotjava extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"HotJava/1.1.2 FCS",
			"HotJava/1.0.1/JRE1.1.x"
		};
		return userAgentStrings;
	}
}