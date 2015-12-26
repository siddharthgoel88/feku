package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Lapozzbot
 */
public class Lapozzbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"LapozzBot/1.4 (+http://robot.lapozz.com)"
		};
		return userAgentStrings;
	}
}