package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Abilogicbot
 */
public class Abilogicbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; AbiLogicBot/1.0; +http://www.abilogic.com/bot.html)",
			"Mozilla/5.0 (compatible; AbiLogicBot/1.0; +http://www.abilogic.com)"
		};
		return userAgentStrings;
	}
}