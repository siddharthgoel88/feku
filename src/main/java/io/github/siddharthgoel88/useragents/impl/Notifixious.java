package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Notifixious
 */
public class Notifixious extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Notifixious/LinkChecker (http://notifixio.us)"
		};
		return userAgentStrings;
	}
}