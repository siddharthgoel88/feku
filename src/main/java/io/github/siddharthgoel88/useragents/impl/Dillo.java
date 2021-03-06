package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Dillo
 */
public class Dillo extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Dillo/2.0",
			"Dillo/0.8.6-i18n-misc",
			"Dillo/0.8.6",
			"Dillo/0.8.5-i18n-misc",
			"Dillo/0.8.5",
			"Dillo/0.8.3",
			"Dillo/0.7.3",
			"Dillo/0.6.4"
		};
		return userAgentStrings;
	}
}