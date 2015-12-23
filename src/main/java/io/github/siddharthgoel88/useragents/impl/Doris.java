package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Doris
 */
public class Doris extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Doris/1.15 [en] (Symbian)"
		};
		return userAgentStrings;
	}
}