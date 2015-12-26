package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for MaemoBrowser
 */
public class MaemoBrowser extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (X11; U; Linux armv7l; ru-RU; rv:1.9.2.3pre) Gecko/20100723 Firefox/3.5 Maemo Browser 1.7.4.8 RX-51 N900",
			"Mozilla/5.0 (X11; U; Linux armv7l; pt-PT; rv:1.9.2.3pre) Gecko/20100723 Firefox/3.5 Maemo Browser 1.7.4.8 RX-51 N900",
			"Mozilla/5.0 (X11; U; Linux armv7l; no-NO; rv:1.9.2.3pre) Gecko/20100723 Firefox/3.5 Maemo Browser 1.7.4.8 RX-51 N900"
		};
		return userAgentStrings;
	}
}