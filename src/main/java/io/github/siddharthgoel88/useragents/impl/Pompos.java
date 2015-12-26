package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Pompos
 */
public class Pompos extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Pompos/1.3 http://dir.com/pompos.html",
			"Pompos/1.2 http://pompos.iliad.fr",
			"Pompos/1.1 http://pompos.iliad.fr"
		};
		return userAgentStrings;
	}
}