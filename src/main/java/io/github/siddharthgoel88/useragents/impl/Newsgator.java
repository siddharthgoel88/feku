package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Newsgator
 */
public class Newsgator extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"NewsGator/2.5 (http://www.newsgator.com; Microsoft Windows NT 5.1.2600.0; .NET  CLR 1.1.4322.2032)",
			"NewsGator/2.0 Bot (http://www.newsgator.com)"
		};
		return userAgentStrings;
	}
}