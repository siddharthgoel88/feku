package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Sundance
 */
public class Sundance extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Sundance/0.9x(Compatible; Windows; U; en-US;)Version/0.9x",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; ) Sundance/0.9x",
			"Mozilla/5.0 (compatible; Sundance/0.9x)",
			"Sundance(Compatible; Windows; U; en-US;) Version/0.9.0.38",
			"Sundance(Compatible; Windows; U; en-US;) Version/0.9.0.36",
			"Sundance(Compatible; Windows; U; en-US;) Version/0.9.0.34",
			"Mozilla/5.0(Compatible; Windows; U; en-US;) Sundance/0.9.0.33",
			"Mozilla/5.0(Compatible; Windows; U; en-US;) Sundance/0.9"
		};
		return userAgentStrings;
	}
}