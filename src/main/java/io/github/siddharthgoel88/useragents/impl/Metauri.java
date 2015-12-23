package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Metauri
 */
public class Metauri extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"MetaURI API/2.0  metauri.com"
		};
		return userAgentStrings;
	}
}