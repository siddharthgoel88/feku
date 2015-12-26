package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Discobot
 */
public class Discobot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; discobot/1.0; +http://discoveryengine.com/discobot.html)"
		};
		return userAgentStrings;
	}
}