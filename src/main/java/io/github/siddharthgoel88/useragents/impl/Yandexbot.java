package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Yandexbot
 */
public class Yandexbot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; YandexBot/3.0; +http://yandex.com/bots)"
		};
		return userAgentStrings;
	}
}