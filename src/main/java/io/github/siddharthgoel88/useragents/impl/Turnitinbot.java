package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Turnitinbot
 */
public class Turnitinbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"TurnitinBot/2.1 (http://www.turnitin.com/robot/crawlerinfo.html)",
			"TurnitinBot/2.0 http://www.turnitin.com/robot/crawlerinfo.html",
			"TurnitinBot/1.5 http://www.turnitin.com/robot/crawlerinfo.html",
			"TurnitinBot/1.5 (http://www.turnitin.com/robot/crawlerinfo.html)",
			"TurnitinBot/1.5 http://www.turnitin.com/robot/crawlerinfo.html",
			"TurnitinBot/1.5 (http://www.turnitin.com/robot/crawlerinfo.html)"
		};
		return userAgentStrings;
	}
}