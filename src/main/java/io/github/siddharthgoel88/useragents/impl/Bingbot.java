package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Bingbot
 */
public class Bingbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; bingbot/2.0; +http://www.bing.com/bingbot.htm)",
			"Mozilla/5.0 (compatible; bingbot/2.0 +http://www.bing.com/bingbot.htm)"
		};
		return userAgentStrings;
	}
}