package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Ibrowse
 */
public class Ibrowse extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; IBrowse 3.0; AmigaOS4.0)",
			"IBrowse/2.4demo (AmigaOS 3.9; 68K)",
			"IBrowse/2.4 (AmigaOS 3.9; 68K)",
			"Mozilla/4.0 (compatible; IBrowse 2.3; AmigaOS4.0)",
			"IBrowse/2.3 (AmigaOS 3.9)"
		};
		return userAgentStrings;
	}
}