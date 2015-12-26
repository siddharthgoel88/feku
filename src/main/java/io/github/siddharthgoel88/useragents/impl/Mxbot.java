package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Mxbot
 */
public class Mxbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; mxbot/1.0; +http://www.chainn.com/mxbot.html)",
			"Mozilla/5.0 (compatible; mxbot/1.0;  http://www.chainn.com/mxbot.html)"
		};
		return userAgentStrings;
	}
}