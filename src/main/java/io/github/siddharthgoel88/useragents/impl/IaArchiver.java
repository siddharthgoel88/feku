package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for IaArchiver
 */
public class IaArchiver extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"ia_archiver/8.9 (Windows NT 3.1; en-US;)",
			"ia_archiver/8.9 (Windows 3.9; en-US;)",
			"ia_archiver/8.9 (Linux 1.0; en-US;)",
			"ia_archiver/8.8 (Windows XP 7.2; en-US;)",
			"ia_archiver/8.8 (Windows XP 3.0; en-US;)",
			"ia_archiver/8.2 (Windows 7.6; en-US;)",
			"ia_archiver/8.1 (Windows 2000 1.9; en-US;)",
			"ia_archiver/8.0 (Windows 2.4; en-US;)",
			"ia_archiver"
		};
		return userAgentStrings;
	}
}