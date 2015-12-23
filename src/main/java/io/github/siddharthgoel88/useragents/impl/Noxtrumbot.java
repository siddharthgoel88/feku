package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Noxtrumbot
 */
public class Noxtrumbot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"noxtrumbot/1.0 (crawler@noxtrum.com)"
		};
		return userAgentStrings;
	}
}