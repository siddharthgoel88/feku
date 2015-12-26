package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Btbot
 */
public class Btbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"btbot/0.4 (+http://www.btbot.com/btbot.html)"
		};
		return userAgentStrings;
	}
}