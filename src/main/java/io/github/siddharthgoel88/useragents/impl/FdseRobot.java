package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for FdseRobot
 */
public class FdseRobot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/4.0 (compatible: FDSE robot)"
		};
		return userAgentStrings;
	}
}