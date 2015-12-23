package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Mib
 */
public class Mib extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"MOT-L7/NA.ACR_RB MIB/2.2.1 Profile/MIDP-2.0 Configuration/CLDC-1.1",
			"MOT-L7/08.D5.09R MIB/2.2.1 Profile/MIDP-2.0 Configuration/CLDC-1.1",
			"MOT-L7/08.B7.ACR MIB/2.2.1 Profile/MIDP-2.0 Configuration/CLDC-1.1",
			"MOT-L6i/0A.64.19R MIB/2.2.1 Profile/MIDP-2.0 Configuration/CLDC-1.1",
			"MOT-L6/0A.60.1BR MIB/2.2.1 Profile/MIDP-2.0 Configuration/CLDC-1.1",
			"MOT-V300/0B.09.19R MIB/2.2 Profile/MIDP-2.0 Configuration/CLDC-1.0"
		};
		return userAgentStrings;
	}
}