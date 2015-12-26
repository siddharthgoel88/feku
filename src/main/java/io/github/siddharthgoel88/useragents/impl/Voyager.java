package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Voyager
 */
public class Voyager extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"voyager/2.0 (http://www.kosmix.com/crawler.html)",
			"voyager/1.0"
		};
		return userAgentStrings;
	}
}