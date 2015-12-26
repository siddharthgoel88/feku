package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Furlbot
 */
public class Furlbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/4.0 compatible FurlBot/Furl Search 2.0 (FurlBot; http://www.furl.net; wn.furlbot@looksmart.net)"
		};
		return userAgentStrings;
	}
}