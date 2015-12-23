package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Oozbot
 */
public class Oozbot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"OOZBOT/0.20 ( -- ; http://www.setooz.com/oozbot.html ; agentname at setooz dot_com )",
			"OOZBOT/0.17 (--; http://www.setooz.com/oozbot.html; pvvpr at iiit dot ac dot in)"
		};
		return userAgentStrings;
	}
}