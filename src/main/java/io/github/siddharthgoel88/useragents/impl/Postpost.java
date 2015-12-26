package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Postpost
 */
public class Postpost extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"PostPost/1.0 (+http://postpo.st/crawlers)"
		};
		return userAgentStrings;
	}
}