package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Bloglines
 */
public class Bloglines extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Bloglines/3.1 (http://www.bloglines.com)",
			"Bloglines/3.0-rho (http://www.bloglines.com; 3 subscribers)"
		};
		return userAgentStrings;
	}
}