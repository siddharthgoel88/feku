package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Geniebot
 */
public class Geniebot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"genieBot (http://64.5.245.11/faq/faq.html)",
			"genieBot ((http://64.5.245.11/faq/faq.html))"
		};
		return userAgentStrings;
	}
}