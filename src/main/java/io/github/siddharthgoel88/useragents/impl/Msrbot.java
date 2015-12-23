package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Msrbot
 */
public class Msrbot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"MSRBOT (http://research.microsoft.com/research/sv/msrbot/)",
			"MSRBOT"
		};
		return userAgentStrings;
	}
}