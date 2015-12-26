package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Sitebar
 */
public class Sitebar extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"SiteBar/3.3.8 (Bookmark Server; http://sitebar.org/)",
			"SiteBar/3.3.5 (Bookmark Server; http://sitebar.org/)"
		};
		return userAgentStrings;
	}
}