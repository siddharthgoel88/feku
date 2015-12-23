package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Universalfeedparser
 */
public class Universalfeedparser extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"UniversalFeedParser/3.3 +http://feedparser.org/"
		};
		return userAgentStrings;
	}
}