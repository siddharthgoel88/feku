package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Orbiter
 */
public class Orbiter extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Orbiter (+http://www.dailyorbit.com/bot.htm)"
		};
		return userAgentStrings;
	}
}