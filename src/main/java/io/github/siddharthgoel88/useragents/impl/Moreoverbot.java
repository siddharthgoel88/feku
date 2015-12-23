package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Moreoverbot
 */
public class Moreoverbot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Moreoverbot/5.1 ( http://w.moreover.com; webmaster@moreover.com) Mozilla/5.0",
			"Moreoverbot/5.00 (+http://www.moreover.com; webmaster@moreover.com)",
			"Moreoverbot/5.00 (+http://www.moreover.com)"
		};
		return userAgentStrings;
	}
}