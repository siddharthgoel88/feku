package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Gaisbot
 */
public class Gaisbot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Gaisbot/3.0+(robot06@gais.cs.ccu.edu.tw;+http://gais.cs.ccu.edu.tw/robot.php)",
			"Gaisbot/3.0+(robot05@gais.cs.ccu.edu.tw;+http://gais.cs.ccu.edu.tw/robot.php)",
			"Gaisbot/3.0 (jerry_wu@openfind.com.tw; http://gais.cs.ccu.edu.tw/robot.php)"
		};
		return userAgentStrings;
	}
}