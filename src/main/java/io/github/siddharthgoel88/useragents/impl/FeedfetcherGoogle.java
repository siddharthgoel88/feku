package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for FeedfetcherGoogle
 */
public class FeedfetcherGoogle extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Feedfetcher-Google; (+http://www.google.com/feedfetcher.html; feed-id=8639390370582375869)",
			"Feedfetcher-Google; (+http://www.google.com/feedfetcher.html; feed-id=375807642710480585)",
			"Feedfetcher-Google; (+http://www.google.com/feedfetcher.html; feed-id=1992026586303346733)",
			"Feedfetcher-Google; (+http://www.google.com/feedfetcher.html; feed-id=13645798864011762265)",
			"FeedFetcher-Google; (+http://www.google.com/feedfetcher.html)"
		};
		return userAgentStrings;
	}
}