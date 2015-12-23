package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Webcopier
 */
public class Webcopier extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"WebCopier v4.6",
			"WebCopier v4.5.2",
			"WebCopier v3.3",
			"WebCopier v3.2a",
			"WebCopier v3.2a",
			"WebCopier v3.2",
			"WebCopier v3.0",
			"WebCopier v2.8"
		};
		return userAgentStrings;
	}
}