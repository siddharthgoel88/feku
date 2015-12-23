package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Catchbot
 */
public class Catchbot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"CatchBot/2.0; +http://www.catchbot.com",
			"CatchBot/1.0; +http://www.catchbot.com",
			"CatchBot/1.0;  http://www.catchbot.com"
		};
		return userAgentStrings;
	}
}