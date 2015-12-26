package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Nfreader
 */
public class Nfreader extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"NFReader/1.4.1.0 (http://www.gaijin.at/)"
		};
		return userAgentStrings;
	}
}