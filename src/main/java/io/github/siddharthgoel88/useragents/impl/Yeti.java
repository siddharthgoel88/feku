package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Yeti
 */
public class Yeti extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Yeti/1.0 (NHN Corp.; http://help.naver.com/robots/)",
			"Yeti/1.0 (+http://help.naver.com/robots/)"
		};
		return userAgentStrings;
	}
}