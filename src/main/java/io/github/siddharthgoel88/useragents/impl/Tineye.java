package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Tineye
 */
public class Tineye extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"TinEye/1.1 (http://tineye.com/crawler.html)",
			"TinEye"
		};
		return userAgentStrings;
	}
}