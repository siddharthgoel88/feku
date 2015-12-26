package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Nymesis
 */
public class Nymesis extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Nymesis/1.0 (http://nymesis.com)"
		};
		return userAgentStrings;
	}
}