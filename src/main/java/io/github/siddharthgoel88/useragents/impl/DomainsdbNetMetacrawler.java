package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for DomainsdbNetMetacrawler
 */
public class DomainsdbNetMetacrawler extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"DomainsDB.net MetaCrawler v.0.9.7c (http://domainsdb.net/)"
		};
		return userAgentStrings;
	}
}