package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Lftp
 */
public class Lftp extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"lftp/4.3.8",
			"lftp/4.3.5"
		};
		return userAgentStrings;
	}
}