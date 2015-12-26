package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for MojooRobot
 */
public class MojooRobot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mojoo Robot (http://www.mojoo.com/)"
		};
		return userAgentStrings;
	}
}