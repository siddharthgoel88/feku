package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for FastEnterpriseCrawler
 */
public class FastEnterpriseCrawler extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"FAST Enterprise Crawler 6 used by Schibsted (webcrawl@schibstedsok.no)",
			"FAST Enterprise Crawler 6 / Scirus scirus-crawler@fast.no; http://www.scirus.com/srsapp/contactus/",
			"FAST Enteprise Crawler/6 (www dot fastsearch dot com)"
		};
		return userAgentStrings;
	}
}