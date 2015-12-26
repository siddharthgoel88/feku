package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Rampybot
 */
public class Rampybot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"RAMPyBot - www.giveRAMP.com/0.1 (RAMPyBot - www.giveRAMP.com; http://www.giveramp.com/bot.html; support@giveRAMP.com)"
		};
		return userAgentStrings;
	}
}