package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for LinksmanagerComBot
 */
public class LinksmanagerComBot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; LinksManager.com_bot  http://linksmanager.com/linkchecker.html)",
			"Mozilla/5.0 (compatible; LinksManager.com_bot +http://linksmanager.com/linkchecker.html)"
		};
		return userAgentStrings;
	}
}