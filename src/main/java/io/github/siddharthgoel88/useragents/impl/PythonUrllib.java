package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for PythonUrllib
 */
public class PythonUrllib extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Python-urllib/3.1",
			"Python-urllib/3.0",
			"Python-urllib/2.7",
			"Python-urllib/2.6",
			"Python-urllib/2.5",
			"Python-urllib/2.4",
			"Python-urllib/2.1",
			"Python-urllib/2.0a1",
			"Python-urllib/1.17",
			"Python-urllib/1.16",
			"Python-urllib/1.15"
		};
		return userAgentStrings;
	}
}