package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Superbot
 */
public class Superbot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"SuperBot/4.4.0.60 (Windows XP)"
		};
		return userAgentStrings;
	}
}