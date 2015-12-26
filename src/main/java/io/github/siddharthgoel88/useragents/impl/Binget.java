package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Binget
 */
public class Binget extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"BinGet/1.00.A (http://www.bin-co.com/php/scripts/load/)"
		};
		return userAgentStrings;
	}
}