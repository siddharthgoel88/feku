package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Polybot
 */
public class Polybot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"polybot 1.0 (http://cis.poly.edu/polybot/)"
		};
		return userAgentStrings;
	}
}