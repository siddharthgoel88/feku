package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for LingueeBot
 */
public class LingueeBot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Linguee Bot (http://www.linguee.com/bot; bot@linguee.com)"
		};
		return userAgentStrings;
	}
}