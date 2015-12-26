package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for BoithoComRobot
 */
public class BoithoComRobot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"boitho.com-robot/1.1",
			"boitho.com-robot/1.0"
		};
		return userAgentStrings;
	}
}