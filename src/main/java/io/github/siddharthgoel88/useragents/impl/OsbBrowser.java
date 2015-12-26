package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for OsbBrowser
 */
public class OsbBrowser extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (X11; U; Linux i686; en-us) AppleWebKit/146.1 (KHTML, like Gecko) osb-browser/0.5"
		};
		return userAgentStrings;
	}
}