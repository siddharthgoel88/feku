package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Anyapexbot
 */
public class Anyapexbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; AnyApexBot/1.0; +http://www.anyapex.com/bot.html)"
		};
		return userAgentStrings;
	}
}