package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Sitebot
 */
public class Sitebot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; SiteBot/0.1; +http://www.sitebot.org/robot/)",
			"Mozilla/5.0 (compatible; SiteBot/0.1;  http://www.sitebot.org/robot/)"
		};
		return userAgentStrings;
	}
}