package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Msnbot
 */
public class Msnbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"msnbot/2.1",
			"msnbot/2.0b",
			"msnbot/1.1 (+http://search.msn.com/msnbot.htm)",
			"msnbot/1.1",
			"msnbot/1.0 (+http://search.msn.com/msnbot.htm)",
			"msnbot/0.9 (+http://search.msn.com/msnbot.htm)",
			"msnbot/0.11 ( http://search.msn.com/msnbot.htm)",
			"MSNBOT/0.1 (http://search.msn.com/msnbot.htm)"
		};
		return userAgentStrings;
	}
}