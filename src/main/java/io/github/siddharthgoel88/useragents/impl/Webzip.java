package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Webzip
 */
public class Webzip extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"WebZIP/3.5 (http://www.spidersoft.com)"
		};
		return userAgentStrings;
	}
}