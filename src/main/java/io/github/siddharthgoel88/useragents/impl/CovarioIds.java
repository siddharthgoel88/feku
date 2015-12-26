package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for CovarioIds
 */
public class CovarioIds extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Covario-IDS/1.0 (Covario; http://www.covario.com/ids; support at covario dot com)"
		};
		return userAgentStrings;
	}
}