package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Mj12Bot
 */
public class Mj12Bot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; MJ12bot/v1.2.4; http://www.majestic12.co.uk/bot.php?+)",
			"Mozilla/5.0 (compatible; MJ12bot/v1.2.3; http://www.majestic12.co.uk/bot.php?+)",
			"MJ12bot/v1.0.8 (http://majestic12.co.uk/bot.php?+)",
			"MJ12bot/v1.0.7 (http://majestic12.co.uk/bot.php?+)",
			"MJ12bot/v1.0.6 (http://majestic12.co.uk/bot.php?+)",
			"MJ12bot/v1.0.5 (http://majestic12.co.uk/bot.php?+)"
		};
		return userAgentStrings;
	}
}