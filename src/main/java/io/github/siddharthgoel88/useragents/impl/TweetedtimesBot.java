package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for TweetedtimesBot
 */
public class TweetedtimesBot extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; TweetedTimes Bot/1.0;  http://tweetedtimes.com)"
		};
		return userAgentStrings;
	}
}