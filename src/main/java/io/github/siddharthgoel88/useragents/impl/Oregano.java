package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Oregano
 */
public class Oregano extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/1.10 [en] (Compatible; RISC OS 3.70; Oregano 1.10)",
			"Mozilla/1.10 [en]  (Compatible;  RISC OS 3.70;  Oregano 1.10)"
		};
		return userAgentStrings;
	}
}