package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Lmspider
 */
public class Lmspider extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"lmspider lmspider@scansoft.com",
			"lmspider (lmspider@scansoft.com)"
		};
		return userAgentStrings;
	}
}