package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Sandcrawler
 */
public class Sandcrawler extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"SandCrawler - Compatibility Testing"
		};
		return userAgentStrings;
	}
}