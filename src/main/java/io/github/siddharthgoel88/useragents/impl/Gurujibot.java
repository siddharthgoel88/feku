package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Gurujibot
 */
public class Gurujibot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 GurujiBot/1.0 (+http://www.guruji.com/en/WebmasterFAQ.html)",
			"Mozilla/5.0 GurujiBot/1.0 ( http://www.guruji.com/en/WebmasterFAQ.html)",
			"Mozilla/5.0 (compatible; GurujiBot/1.0; +http://www.guruji.com/en/WebmasterFAQ.html)",
			"GurujiBot/1.0 (+http://www.guruji.com/WebmasterFAQ.html)",
			"GurujiBot/1.0 (+http://www.guruji.com/en/WebmasterFAQ.html)"
		};
		return userAgentStrings;
	}
}