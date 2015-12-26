package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for EveryfeedSpider
 */
public class EveryfeedSpider extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"everyfeed-spider/2.0 (http://www.everyfeed.com)"
		};
		return userAgentStrings;
	}
}