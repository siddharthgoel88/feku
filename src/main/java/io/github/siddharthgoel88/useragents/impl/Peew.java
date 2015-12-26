package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Peew
 */
public class Peew extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; Peew/1.0; http://www.peew.de/crawler/)"
		};
		return userAgentStrings;
	}
}