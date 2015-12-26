package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Irlbot
 */
public class Irlbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"IRLbot/3.0 (compatible; MSIE 6.0; http://irl.cs.tamu.edu/crawler/)",
			"IRLbot/3.0 (compatible; MSIE 6.0; http://irl.cs.tamu.edu/crawler)",
			"IRLbot/2.0 (compatible; MSIE 6.0; http://irl.cs.tamu.edu/crawler)",
			"IRLbot/2.0 (+http://irl.cs.tamu.edu/crawler)",
			"IRLbot/2.0 ( http://irl.cs.tamu.edu/crawler)"
		};
		return userAgentStrings;
	}
}