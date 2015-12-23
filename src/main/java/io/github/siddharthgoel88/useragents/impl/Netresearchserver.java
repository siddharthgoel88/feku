package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Netresearchserver
 */
public class Netresearchserver extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"NetResearchServer/4.0(loopimprovements.com/robot.html)",
			"NetResearchServer/3.5(loopimprovements.com/robot.html)",
			"NetResearchServer/2.8(loopimprovements.com/robot.html)",
			"NetResearchServer/2.7(loopimprovements.com/robot.html)",
			"NetResearchServer/2.5(loopimprovements.com/robot.html)",
			"NetResearchServer(http://www.look.com)"
		};
		return userAgentStrings;
	}
}