package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Terrawizbot
 */
public class Terrawizbot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"TerrawizBot/1.0 (+http://www.terrawiz.com/bot.html)"
		};
		return userAgentStrings;
	}
}