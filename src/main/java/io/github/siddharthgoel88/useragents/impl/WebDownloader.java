package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for WebDownloader
 */
public class WebDownloader extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Web Downloader/6.9",
			"Web Downloader/6.8",
			"Web Downloader/5.7",
			"Web Downloader/4.5"
		};
		return userAgentStrings;
	}
}