package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Galaxybot
 */
public class Galaxybot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"GalaxyBot/1.0 (http://www.galaxy.com/galaxybot.html)"
		};
		return userAgentStrings;
	}
}