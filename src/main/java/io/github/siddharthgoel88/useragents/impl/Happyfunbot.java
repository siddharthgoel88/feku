package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Happyfunbot
 */
public class Happyfunbot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"HappyFunBot/1.1 ( http://www.happyfunsearch.com/bot.html)"
		};
		return userAgentStrings;
	}
}