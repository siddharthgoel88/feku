package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Netpositive
 */
public class Netpositive extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/3.0 (compatible; NetPositive/2.2.2; BeOS)",
			"Mozilla/3.0 (compatible; NetPositive/2.2)",
			"Mozilla/3.0 (compatible; NetPositive/2.1.1; BeOS)"
		};
		return userAgentStrings;
	}
}