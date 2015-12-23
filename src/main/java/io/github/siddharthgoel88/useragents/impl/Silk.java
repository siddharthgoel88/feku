package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Silk
 */
public class Silk extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"silk/1.0 (+http://www.slider.com/silk.htm)/3.7",
			"Silk/1.0"
		};
		return userAgentStrings;
	}
}