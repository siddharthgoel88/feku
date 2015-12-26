package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Prism
 */
public class Prism extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.6; en-US; rv:1.9.2.3) Gecko/20100402 Prism/1.0b4",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.2.13) Gecko/20101206 Prism/1.0b3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.2pre) Gecko/20100115 Prism/1.0b3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.1.7) Gecko/20091221 Firefox/3.5.7 Prism/1.0b2",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.0.17) Gecko/2010010604 prism/0.8"
		};
		return userAgentStrings;
	}
}