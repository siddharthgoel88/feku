package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Dooble
 */
public class Dooble extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Dooble/0.07 (de_CH) WebKit"
		};
		return userAgentStrings;
	}
}