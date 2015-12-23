package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Stackrambler
 */
public class Stackrambler extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"StackRambler/2.0 (MSIE incompatible)",
			"StackRambler/2.0"
		};
		return userAgentStrings;
	}
}