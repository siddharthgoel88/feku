package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Urlfilebot
 */
public class Urlfilebot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; Urlfilebot/2.2; +http://urlfile.com/bot.html)"
		};
		return userAgentStrings;
	}
}