package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Amigavoyager
 */
public class Amigavoyager extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"AmigaVoyager/3.2 (AmigaOS/MC680x0)",
			"AmigaVoyager/2.95 (compatible; MC680x0; AmigaOS; SV1)",
			"AmigaVoyager/2.95 (compatible; MC680x0; AmigaOS)"
		};
		return userAgentStrings;
	}
}