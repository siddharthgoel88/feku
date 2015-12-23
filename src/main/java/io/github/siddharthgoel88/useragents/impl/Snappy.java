package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Snappy
 */
public class Snappy extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Snappy/1.1 ( http://www.urltrends.com/ )"
		};
		return userAgentStrings;
	}
}