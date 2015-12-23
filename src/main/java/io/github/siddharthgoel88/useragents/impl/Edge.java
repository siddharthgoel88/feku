package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Edge
 */
public class Edge extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36 Edge/12.246"
		};
		return userAgentStrings;
	}
}