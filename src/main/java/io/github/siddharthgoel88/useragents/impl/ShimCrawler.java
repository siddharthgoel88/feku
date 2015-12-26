package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for ShimCrawler
 */
public class ShimCrawler extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Shim-Crawler(Mozilla-compatible; http://www.logos.ic.i.u-tokyo.ac.jp/crawler/; crawl@logos.ic.i.u-tokyo.ac.jp)",
			"Shim-Crawler"
		};
		return userAgentStrings;
	}
}