package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Ldspider
 */
public class Ldspider extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"ldspider (http://code.google.com/p/ldspider/wiki/Robots)"
		};
		return userAgentStrings;
	}
}