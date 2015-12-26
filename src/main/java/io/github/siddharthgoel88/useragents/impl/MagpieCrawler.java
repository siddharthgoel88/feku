package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for MagpieCrawler
 */
public class MagpieCrawler extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"magpie-crawler/1.1 (U; Linux amd64; en-GB; +http://www.brandwatch.net)"
		};
		return userAgentStrings;
	}
}