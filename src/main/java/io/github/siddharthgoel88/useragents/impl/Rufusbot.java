package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Rufusbot
 */
public class Rufusbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"RufusBot (Rufus Web Miner; http://64.124.122.252/feedback.html)"
		};
		return userAgentStrings;
	}
}