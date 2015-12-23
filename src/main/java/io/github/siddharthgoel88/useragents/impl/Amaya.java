package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Amaya
 */
public class Amaya extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"amaya/11.3.1 libwww/5.4.1",
			"amaya/11.2 libwww/5.4.0",
			"amaya/11.1 libwww/5.4.0",
			"amaya/10.1 libwww/5.4.0",
			"amaya/10 libwww/5.4.0",
			"amaya/9.55 libwww/5.4.0",
			"amaya/9.54 libwww/5.4.0",
			"amaya/9.52 libwww/5.4.0",
			"amaya/9.51 libwww/5.4.0",
			"amaya/8.8.5 libwww/5.4.0",
			"amaya/11.2 amaya/5.4.0",
			"amaya/11.1 amaya/5.4.0"
		};
		return userAgentStrings;
	}
}