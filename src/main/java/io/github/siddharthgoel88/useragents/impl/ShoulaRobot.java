package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for ShoulaRobot
 */
public class ShoulaRobot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/4.0 (compatible: Shoula robot)"
		};
		return userAgentStrings;
	}
}