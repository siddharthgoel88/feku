package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Yandeximages
 */
public class Yandeximages extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; YandexImages/3.0; +http://yandex.com/bots)"
		};
		return userAgentStrings;
	}
}