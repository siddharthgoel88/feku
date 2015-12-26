package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Webcollage
 */
public class Webcollage extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"webcollage/1.93",
			"webcollage/1.129",
			"webcollage/1.125",
			"webcollage/1.117",
			"webcollage/1.114"
		};
		return userAgentStrings;
	}
}