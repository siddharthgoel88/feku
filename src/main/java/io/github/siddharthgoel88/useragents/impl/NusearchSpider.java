package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for NusearchSpider
 */
public class NusearchSpider extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Nusearch Spider (www.nusearch.com)",
			"nuSearch Spider (compatible; MSIE 4.01; Windows NT)"
		};
		return userAgentStrings;
	}
}