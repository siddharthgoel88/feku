package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Koepabot
 */
public class Koepabot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; KoepaBot BETA; http://www.koepa.nl/bot.html)"
		};
		return userAgentStrings;
	}
}