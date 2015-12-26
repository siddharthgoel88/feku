package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Converacrawler
 */
public class Converacrawler extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"ConveraCrawler/0.9e (+http://ews.converasearch.com/crawl.htm)",
			"ConveraCrawler/0.9d (+http://www.authoritativeweb.com/crawl)",
			"ConveraCrawler/0.9d ( http://www.authoritativeweb.com/crawl)",
			"ConveraCrawler/0.9 (+http://www.authoritativeweb.com/crawl)"
		};
		return userAgentStrings;
	}
}