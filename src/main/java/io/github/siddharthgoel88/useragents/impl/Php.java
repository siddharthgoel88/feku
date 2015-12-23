package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Php
 */
public class Php extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"PHP/5.2.9",
			"PHP/5.2.8",
			"PHP/5.2.14",
			"PHP/5.2.11",
			"PHP/5.2.10"
		};
		return userAgentStrings;
	}
}