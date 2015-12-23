package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Esperanzabot
 */
public class Esperanzabot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"EsperanzaBot(+http://www.esperanza.to/bot/)"
		};
		return userAgentStrings;
	}
}