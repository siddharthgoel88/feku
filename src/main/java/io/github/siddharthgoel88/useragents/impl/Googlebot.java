package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Googlebot
 */
public class Googlebot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)",
			"Googlebot/2.1 (+http://www.googlebot.com/bot.html)",
			"Googlebot/2.1 (+http://www.google.com/bot.html)"
		};
		return userAgentStrings;
	}
}