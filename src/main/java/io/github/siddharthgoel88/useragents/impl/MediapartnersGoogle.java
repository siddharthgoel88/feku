package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for MediapartnersGoogle
 */
public class MediapartnersGoogle extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Mediapartners-Google/2.1"
		};
		return userAgentStrings;
	}
}