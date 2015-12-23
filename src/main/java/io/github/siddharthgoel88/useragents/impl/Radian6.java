package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Radian6
 */
public class Radian6 extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"radian6_default_(www.radian6.com/crawler)"
		};
		return userAgentStrings;
	}
}