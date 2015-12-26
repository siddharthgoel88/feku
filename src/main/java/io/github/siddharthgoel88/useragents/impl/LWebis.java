package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for LWebis
 */
public class LWebis extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"L.webis/0.87 (http://webalgo.iit.cnr.it/index.php?pg=lwebis)"
		};
		return userAgentStrings;
	}
}