package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for VivanteLinkChecker
 */
public class VivanteLinkChecker extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Vivante Link Checker (http://www.vivante.com)"
		};
		return userAgentStrings;
	}
}