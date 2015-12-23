package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Seznambot
 */
public class Seznambot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"SeznamBot/2.0 (+http://fulltext.seznam.cz/)",
			"SeznamBot/2.0 (+http://fulltext.sblog.cz/robot/)"
		};
		return userAgentStrings;
	}
}