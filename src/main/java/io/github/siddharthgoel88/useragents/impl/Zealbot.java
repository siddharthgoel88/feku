package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Zealbot
 */
public class Zealbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/4.0 (compatible; Zealbot 1.0)"
		};
		return userAgentStrings;
	}
}