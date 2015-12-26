package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Blitzbot
 */
public class Blitzbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/4.0 (compatible; BlitzBot)",
			"BlitzBOT@tricus.net (Mozilla compatible)",
			"BlitzBOT@tricus.com (Mozilla compatible)"
		};
		return userAgentStrings;
	}
}