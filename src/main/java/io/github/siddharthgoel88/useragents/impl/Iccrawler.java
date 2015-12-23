package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Iccrawler
 */
public class Iccrawler extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"iCCrawler (http://www.iccenter.net/bot.htm)"
		};
		return userAgentStrings;
	}
}