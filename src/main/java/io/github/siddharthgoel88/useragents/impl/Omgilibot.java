package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Omgilibot
 */
public class Omgilibot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"omgilibot/0.4 +http://omgili.com",
			"omgilibot/0.3 +http://www.omgili.com/Crawler.html",
			"omgilibot/0.3  http://www.omgili.com/Crawler.html"
		};
		return userAgentStrings;
	}
}