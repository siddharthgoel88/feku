package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Cosmos
 */
public class Cosmos extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"cosmos/0.9_(robot@xyleme.com)"
		};
		return userAgentStrings;
	}
}