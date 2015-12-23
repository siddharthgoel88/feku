package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Linkexaminer
 */
public class Linkexaminer extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"LinkExaminer/1.01 (Windows)"
		};
		return userAgentStrings;
	}
}