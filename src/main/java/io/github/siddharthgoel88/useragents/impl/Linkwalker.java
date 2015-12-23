package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Linkwalker
 */
public class Linkwalker extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"LinkWalker/2.0",
			"LinkWalker"
		};
		return userAgentStrings;
	}
}