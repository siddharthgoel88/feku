package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Susie
 */
public class Susie extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"!Susie (http://www.sync2it.com/susie)"
		};
		return userAgentStrings;
	}
}