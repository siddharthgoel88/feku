package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Navscape
 */
public class Navscape extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (X11; U; Linux i686; pt-BR) AppleWebKit/533.3 (KHTML, like Gecko) Navscape/Pre-0.2 Safari/533.3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; pt-BR) AppleWebKit/534.8 (KHTML, like Gecko) Navscape/Pre-0.2 Safari/534.8",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; pt-BR) AppleWebKit/534.12 (KHTML, like Gecko) NavscapeNavigator/Pre-0.1 Safari/534.12",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; pt-BR) AppleWebKit/534.12 (KHTML, like Gecko) Navscape/Pre-0.1 Safari/534.12"
		};
		return userAgentStrings;
	}
}