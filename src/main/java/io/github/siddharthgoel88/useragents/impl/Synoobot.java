package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Synoobot
 */
public class Synoobot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"SynooBot/0.7.1 (SynooBot; http://www.synoo.de/bot.html; webmaster@synoo.com)"
		};
		return userAgentStrings;
	}
}