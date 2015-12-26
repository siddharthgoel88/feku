package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Searchsight
 */
public class Searchsight extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"SearchSight/2.0 (http://SearchSight.com/)"
		};
		return userAgentStrings;
	}
}