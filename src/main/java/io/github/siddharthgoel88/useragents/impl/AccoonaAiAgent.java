package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for AccoonaAiAgent
 */
public class AccoonaAiAgent extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Accoona-AI-Agent/1.1.2 (aicrawler at accoonabot dot com)",
			"Accoona-AI-Agent/1.1.2",
			"Accoona-AI-Agent/1.1.1 (crawler at accoona dot com)"
		};
		return userAgentStrings;
	}
}