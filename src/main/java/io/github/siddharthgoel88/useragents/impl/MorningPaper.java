package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for MorningPaper
 */
public class MorningPaper extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Morning Paper 1.0 (robots.txt compliant!)"
		};
		return userAgentStrings;
	}
}