package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Thesubot
 */
public class Thesubot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"TheSuBot/0.2 (www.thesubot.de)",
			"TheSuBot/0.1 (www.thesubot.de)"
		};
		return userAgentStrings;
	}
}