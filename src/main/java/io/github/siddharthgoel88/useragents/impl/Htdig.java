package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Htdig
 */
public class Htdig extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"htdig/3.1.6 (unconfigured@htdig.searchengine.maintainer)",
			"htdig/3.1.6 (mathieu.peltier@inrialpes.fr)",
			"htdig/3.1.5 (webmaster@online-medien.de)",
			"htdig/3.1.5 (root@localhost)",
			"htdig/3.1.5 (infosys@storm.rmi.org)",
			"htdig/3.1.5"
		};
		return userAgentStrings;
	}
}