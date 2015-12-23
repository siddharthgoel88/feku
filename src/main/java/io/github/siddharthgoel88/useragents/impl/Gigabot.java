package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Gigabot
 */
public class Gigabot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Gigabot/3.0 (http://www.gigablast.com/spider.html)",
			"Gigabot/2.0/gigablast.com/spider.html",
			"Gigabot/2.0 (http://www.gigablast.com/spider.html)",
			"Gigabot/2.0",
			"Gigabot/1.0"
		};
		return userAgentStrings;
	}
}