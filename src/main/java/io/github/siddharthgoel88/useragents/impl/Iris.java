package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Iris
 */
public class Iris extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (Windows NT; U; en) AppleWebKit/525.18.1 (KHTML, like Gecko) Version/3.1.1 Iris/1.1.7 Safari/525.20"
		};
		return userAgentStrings;
	}
}