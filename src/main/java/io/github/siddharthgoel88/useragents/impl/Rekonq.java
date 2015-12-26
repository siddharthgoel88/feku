package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Rekonq
 */
public class Rekonq extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (X11; U; Linux x86_64; cs-CZ) AppleWebKit/533.3 (KHTML, like Gecko) rekonq Safari/533.3",
			"Mozilla/5.0 (X11; U; Linux i686; pl-PL) AppleWebKit/533.3 (KHTML, like Gecko) rekonq Safari/533.3",
			"Mozilla/5.0 (X11; U; Linux i686; en-GB) AppleWebKit/533.3 (KHTML, like Gecko) rekonq Safari/533.3"
		};
		return userAgentStrings;
	}
}