package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Playstation3
 */
public class Playstation3 extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (PLAYSTATION 3; 3.55)",
			"Mozilla/5.0 (PLAYSTATION 3; 2.00)",
			"Mozilla/5.0 (PLAYSTATION 3; 1.90)",
			"Mozilla/5.0 (PLAYSTATION 3; 1.70)",
			"Mozilla/5.0 (PLAYSTATION 3; 1.5)",
			"Mozilla/5.0 (PLAYSTATION 3; 1.10)",
			"Mozilla/5.0 (PLAYSTATION 3; 1.00)",
			"Mozilla/4.0 (PS3 (PlayStation 3); 1.00)",
			"Mozilla/5.0 (PLAYSTATION 3; 1.0)"
		};
		return userAgentStrings;
	}
}