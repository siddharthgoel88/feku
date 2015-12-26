package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for FastWebcrawler
 */
public class FastWebcrawler extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"FAST-WebCrawler/3.8 (atw-crawler at fast dot no; http://fast.no/support/crawler.asp)",
			"FAST-WebCrawler/3.7/FirstPage (atw-crawler at fast dot no;http://fast.no/support/crawler.asp)",
			"FAST-WebCrawler/3.7 (atw-crawler at fast dot no; http://fast.no/support/crawler.asp)",
			"FAST-WebCrawler/3.6/FirstPage (atw-crawler at fast dot no;http://fast.no/support/crawler.asp)",
			"FAST-WebCrawler/3.6 (atw-crawler at fast dot no; http://fast.no/support/crawler.asp)",
			"FAST-WebCrawler/3.6",
			"FAST-WebCrawler/3.x Multimedia (mm dash crawler at fast dot no)",
			"FAST-WebCrawler/3.x Multimedia"
		};
		return userAgentStrings;
	}
}