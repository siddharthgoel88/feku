package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for W3M
 */
public class W3M extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"w3m/0.52",
			"w3m/0.5.2 (Linux i686; it; Debian-3.0.6-3)",
			"w3m/0.5.2 (Linux i686; en; Debian-3.0.6-3)",
			"w3m/0.5.2 (Debian-3.0.6-3)",
			"w3m/0.5.2",
			"w3m/0.5.1+cvs-1.968",
			"w3m/0.5.1",
			"w3m/0.2.1",
			"w3m/0.1.9"
		};
		return userAgentStrings;
	}
}