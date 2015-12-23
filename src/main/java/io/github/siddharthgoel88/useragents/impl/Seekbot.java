package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Seekbot
 */
public class Seekbot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Seekbot/1.0 (http://www.seekbot.net/bot.html) RobotsTxtFetcher/1.2",
			"Seekbot/1.0 (http://www.seekbot.net/bot.html) HTTPFetcher/2.1",
			"Seekbot/1.0 (http://www.seekbot.net/bot.html) HTTPFetcher/0.3",
			"Seekbot/1.0 (http://www.seekbot.net/bot.html)"
		};
		return userAgentStrings;
	}
}