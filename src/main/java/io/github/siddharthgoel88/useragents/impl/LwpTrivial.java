package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for LwpTrivial
 */
public class LwpTrivial extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"lwp-trivial/1.41",
			"lwp-trivial/1.38",
			"lwp-trivial/1.36",
			"lwp-trivial/1.35",
			"lwp-trivial/1.33"
		};
		return userAgentStrings;
	}
}