package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Myibrow
 */
public class Myibrow extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (Windows; U; Windows NT 6.1; cs; rv:1.9.2.6) Gecko/20100628 myibrow/4alpha2",
			"Mozilla/5.0 (Windows; U; Windows NT 6.1; WOW64; cs; rv:1.9.2.6) Gecko/20100723 myibrow/4.0.0.0 (Firefox/3.6 compatible)"
		};
		return userAgentStrings;
	}
}