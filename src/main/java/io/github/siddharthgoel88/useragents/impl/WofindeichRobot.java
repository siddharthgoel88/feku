package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for WofindeichRobot
 */
public class WofindeichRobot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"WoFindeIch Robot 1.0(+http://www.search.wofindeich.com/robot.php)",
			"WoFindeIch Robot 1.0( http://www.search.wofindeich.com/robot.php)"
		};
		return userAgentStrings;
	}
}