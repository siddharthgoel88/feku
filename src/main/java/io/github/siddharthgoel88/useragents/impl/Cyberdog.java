package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Cyberdog
 */
public class Cyberdog extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Cyberdog/2.0 (Macintosh; PPC)",
			"Cyberdog/2.0 (Macintosh; 68k)"
		};
		return userAgentStrings;
	}
}