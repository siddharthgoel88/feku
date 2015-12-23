package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for OfflineExplorer
 */
public class OfflineExplorer extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Offline Explorer/2.5",
			"Offline Explorer/1.9",
			"Offline Explorer/1.4"
		};
		return userAgentStrings;
	}
}