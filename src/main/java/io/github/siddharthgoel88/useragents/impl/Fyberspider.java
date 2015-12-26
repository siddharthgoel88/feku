package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Fyberspider
 */
public class Fyberspider extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"FyberSpider (+http://www.fybersearch.com/fyberspider.php)",
			"FyberSpider"
		};
		return userAgentStrings;
	}
}