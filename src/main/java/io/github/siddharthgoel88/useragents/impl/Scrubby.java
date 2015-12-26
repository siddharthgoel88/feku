package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Scrubby
 */
public class Scrubby extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Scrubby/2.2 (http://www.scrubtheweb.com/)",
			"Mozilla/5.0 (compatible; Scrubby/2.2; +http://www.scrubtheweb.com/)",
			"Mozilla/5.0 (compatible; Scrubby/2.2;  http://www.scrubtheweb.com/)",
			"Scrubby/2.1 (http://www.scrubtheweb.com/)",
			"Mozilla/5.0 (compatible; Scrubby/2.1; +http://www.scrubtheweb.com/abs/meta-check.html)"
		};
		return userAgentStrings;
	}
}