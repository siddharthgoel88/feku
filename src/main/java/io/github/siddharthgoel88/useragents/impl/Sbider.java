package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Sbider
 */
public class Sbider extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"SBIder/0.8-dev (SBIder; http://www.sitesell.com/sbider.html; http://support.sitesell.com/contact-support.html)"
		};
		return userAgentStrings;
	}
}