package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for SeochatBot
 */
public class SeochatBot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0) SEOChat::Bot v1.1"
		};
		return userAgentStrings;
	}
}