package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for SensisWebCrawler
 */
public class SensisWebCrawler extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Sensis Web Crawler (search_comments\\at\\sensis\\dot\\com\\dot\\au)"
		};
		return userAgentStrings;
	}
}