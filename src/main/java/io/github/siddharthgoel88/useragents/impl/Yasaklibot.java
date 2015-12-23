package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Yasaklibot
 */
public class Yasaklibot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Yasaklibot/v1.2 (http://www.Yasakli.com/bot.php)"
		};
		return userAgentStrings;
	}
}