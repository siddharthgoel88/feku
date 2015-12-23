package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Gregarius
 */
public class Gregarius extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Gregarius/0.5.2 (+http://devlog.gregarius.net/docs/ua)"
		};
		return userAgentStrings;
	}
}