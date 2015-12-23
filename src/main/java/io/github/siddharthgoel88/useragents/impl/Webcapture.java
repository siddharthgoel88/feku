package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Webcapture
 */
public class Webcapture extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/4.0 (compatible; WebCapture 3.0; Windows)",
			"Mozilla/4.0 (compatible; WebCapture 3.0; Macintosh)",
			"Mozilla/3.0 (compatible; WebCapture 2.0; Windows)",
			"Mozilla/3.0 (compatible; WebCapture 1.0; Windows)"
		};
		return userAgentStrings;
	}
}