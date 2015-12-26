package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Classilla
 */
public class Classilla extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (Macintosh; U; PPC; en-US; mimic; rv:9.3.0) Gecko/20120117 Firefox/3.6.25 Classilla/CFM",
			"Mozilla/5.0 (Macintosh; U; PPC; en-US; mimic; rv:9.3.0) Clecko/20120101 Classilla/CFM"
		};
		return userAgentStrings;
	}
}