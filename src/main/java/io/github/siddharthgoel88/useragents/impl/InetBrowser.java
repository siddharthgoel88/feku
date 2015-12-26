package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for InetBrowser
 */
public class InetBrowser extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (Future Star Technologies Corp.; Star-Blade OS; x86_64; U; en-US) iNet Browser 4.7",
			"Mozilla/6.0 (Future Star Technologies Corp. Star-Blade OS; U; en-US) iNet Browser 2.5"
		};
		return userAgentStrings;
	}
}