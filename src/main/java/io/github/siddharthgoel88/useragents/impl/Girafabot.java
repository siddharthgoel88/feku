package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Girafabot
 */
public class Girafabot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; SV1; .NET CLR 1.1.4322; Girafabot [girafa.com])",
			"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 4.0; Girafabot; girafabot at girafa dot com; http://www.girafa.com)",
			"Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; Girafabot; girafabot at girafa dot com; http://www.girafa.com)"
		};
		return userAgentStrings;
	}
}