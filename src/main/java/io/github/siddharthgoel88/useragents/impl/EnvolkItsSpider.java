package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for EnvolkItsSpider
 */
public class EnvolkItsSpider extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"envolk[ITS]spider/1.6 (+http://www.envolk.com/envolkspider.html)",
			"envolk[ITS]spider/1.6 ( http://www.envolk.com/envolkspider.html)"
		};
		return userAgentStrings;
	}
}