package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Zao
 */
public class Zao extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Zao/0.1 (http://www.kototoi.org/zao/)",
			"Zao/0.1 (http://www.kototoi.org/zao/)"
		};
		return userAgentStrings;
	}
}