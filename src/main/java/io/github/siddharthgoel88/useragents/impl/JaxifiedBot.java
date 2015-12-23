package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for JaxifiedBot
 */
public class JaxifiedBot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Jaxified Bot (+http://www.jaxified.com/crawler/)"
		};
		return userAgentStrings;
	}
}