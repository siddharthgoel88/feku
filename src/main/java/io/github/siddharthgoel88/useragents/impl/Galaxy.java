package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Galaxy
 */
public class Galaxy extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Galaxy/1.0 [en] (Mac OS X 10.5.6; U; en)",
			"Galaxy/1.0 [en] (Mac OS X 10.5.6)"
		};
		return userAgentStrings;
	}
}