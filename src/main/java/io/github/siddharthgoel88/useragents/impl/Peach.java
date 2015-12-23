package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Peach
 */
public class Peach extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Peach/1.01 (Ubuntu 8.04 LTS; U; en)"
		};
		return userAgentStrings;
	}
}