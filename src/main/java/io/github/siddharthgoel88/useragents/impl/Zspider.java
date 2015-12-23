package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Zspider
 */
public class Zspider extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"zspider/0.9-dev http://feedback.redkolibri.com/"
		};
		return userAgentStrings;
	}
}