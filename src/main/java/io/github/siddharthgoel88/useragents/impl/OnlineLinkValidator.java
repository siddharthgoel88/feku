package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for OnlineLinkValidator
 */
public class OnlineLinkValidator extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"online link validator (http://www.dead-links.com/)"
		};
		return userAgentStrings;
	}
}