package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Gsitecrawler
 */
public class Gsitecrawler extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"GSiteCrawler/v1.20 rev. 273 (http://gsitecrawler.com/)",
			"GSiteCrawler/v1.12 rev. 260 (http://gsitecrawler.com/)",
			"GSiteCrawler/v1.06 rev. 251 (http://gsitecrawler.com/)"
		};
		return userAgentStrings;
	}
}