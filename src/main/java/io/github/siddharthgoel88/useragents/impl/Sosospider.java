package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Sosospider
 */
public class Sosospider extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Sosospider+(+http://help.soso.com/webspider.htm)"
		};
		return userAgentStrings;
	}
}