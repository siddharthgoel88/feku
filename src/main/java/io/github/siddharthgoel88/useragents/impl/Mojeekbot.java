package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Mojeekbot
 */
public class Mojeekbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; MojeekBot/2.0; http://www.mojeek.com/bot.html)",
			"MojeekBot/0.2 (archi; http://www.mojeek.com/bot.html)"
		};
		return userAgentStrings;
	}
}