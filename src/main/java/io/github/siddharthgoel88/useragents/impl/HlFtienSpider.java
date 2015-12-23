package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for HlFtienSpider
 */
public class HlFtienSpider extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"hl_ftien_spider_v1.1",
			"hl_ftien_spider"
		};
		return userAgentStrings;
	}
}