package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Updated
 */
public class Updated extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"updated/0.1-beta (updated; http://www.updated.com; updated@updated.com)"
		};
		return userAgentStrings;
	}
}