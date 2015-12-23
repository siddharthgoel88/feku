package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for W3CChecklink
 */
public class W3CChecklink extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"W3C-checklink/4.5 [4.160] libwww-perl/5.823",
			"W3C-checklink/4.5 [4.154] libwww-perl/5.823",
			"W3C-checklink/4.3 [4.42] libwww-perl/5.820",
			"W3C-checklink/4.3 [4.42] libwww-perl/5.808",
			"W3C-checklink/4.3 [4.42] libwww-perl/5.805",
			"W3C-checklink/4.2.1 [4.21] libwww-perl/5.803",
			"W3C-checklink/4.2 [4.20] libwww-perl/5.803",
			"W3C-checklink/3.6.2.3 libwww-perl/5.64",
			"W3C-checklink/2.90 libwww-perl/5.64"
		};
		return userAgentStrings;
	}
}