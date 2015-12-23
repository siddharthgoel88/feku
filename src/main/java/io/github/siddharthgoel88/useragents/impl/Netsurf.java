package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Netsurf
 */
public class Netsurf extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"NetSurf/2.0 (RISC OS; armv5l)",
			"NetSurf/2.0 (RISC OS; armv3l)",
			"NetSurf/2.0 (Linux; i686)",
			"NetSurf/1.2 (RISC OS; armv4l)",
			"NetSurf/1.2 (NetBSD; i386; NetBSD 4.99.59 i386)",
			"NetSurf/1.2 (Linux; x86_64)",
			"NetSurf/1.2 (Linux; i686)",
			"NetSurf/1.1 (Linux; i686)",
			"NetSurf/1.0 (Linux; i686)"
		};
		return userAgentStrings;
	}
}