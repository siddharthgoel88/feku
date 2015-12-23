package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Pycurl
 */
public class Pycurl extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"PycURL/7.23.1",
			"PycURL/7.19.7",
			"PycURL/7.19.5",
			"PycURL/7.19.3",
			"PycURL/7.19.0",
			"PycURL/7.18.2",
			"PycURL/7.18.0",
			"PycURL/7.16.4",
			"PycURL/7.15.5",
			"PycURL/7.13.2",
			"PycURL"
		};
		return userAgentStrings;
	}
}