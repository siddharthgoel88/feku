package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for PlaystationPortable
 */
public class PlaystationPortable extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"PSP (PlayStation Portable); 2.00",
			"Mozilla/4.0 (PSP (PlayStation Portable); 2.00)"
		};
		return userAgentStrings;
	}
}