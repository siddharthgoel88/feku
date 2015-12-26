package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Psbot
 */
public class Psbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"psbot/0.1 (+http://www.picsearch.com/bot.html)"
		};
		return userAgentStrings;
	}
}