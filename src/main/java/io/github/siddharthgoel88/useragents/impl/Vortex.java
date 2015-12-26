package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Vortex
 */
public class Vortex extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Vortex/2.2 (+http://marty.anstey.ca/robots/vortex/)",
			"Vortex/2.2 ( http://marty.anstey.ca/robots/vortex/)",
			"VORTEX/1.2 ( http://marty.anstey.ca/robots/vortex/)"
		};
		return userAgentStrings;
	}
}