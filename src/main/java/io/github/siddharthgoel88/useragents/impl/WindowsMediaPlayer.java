package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for WindowsMediaPlayer
 */
public class WindowsMediaPlayer extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Windows-Media-Player/11.0.5721.5145",
			"Windows-Media-Player/10.00.00.xxxx",
			"Windows-Media-Player/10.00.00.4036",
			"Windows-Media-Player/10.00.00.3646",
			"Windows-Media-Player/9.00.00.4503",
			"Windows-Media-Player/9.00.00.3250"
		};
		return userAgentStrings;
	}
}