package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Billybobbot
 */
public class Billybobbot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"BillyBobBot/1.0 (+http://www.billybobbot.com/crawler/)"
		};
		return userAgentStrings;
	}
}