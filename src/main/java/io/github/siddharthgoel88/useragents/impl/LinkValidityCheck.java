package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for LinkValidityCheck
 */
public class LinkValidityCheck extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Link Validity Check From: http://www.w3dir.com/cgi-bin (Using: Hot Links SQL by Mrcgiguy.com)"
		};
		return userAgentStrings;
	}
}