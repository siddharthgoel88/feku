package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Scoutjet
 */
public class Scoutjet extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; ScoutJet;  http://www.scoutjet.com/)"
		};
		return userAgentStrings;
	}
}