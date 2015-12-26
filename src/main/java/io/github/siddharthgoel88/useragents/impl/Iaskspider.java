package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Iaskspider
 */
public class Iaskspider extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"iaskspider/2.0(+http://iask.com/help/help_index.html)",
			"iaskspider"
		};
		return userAgentStrings;
	}
}