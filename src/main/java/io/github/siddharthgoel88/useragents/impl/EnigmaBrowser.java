package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for EnigmaBrowser
 */
public class EnigmaBrowser extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Enigma Browser"
		};
		return userAgentStrings;
	}
}