package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Surveybot
 */
public class Surveybot extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"SurveyBot/2.3+(Whois+Source)",
			"SurveyBot/2.3 (Whois Source)"
		};
		return userAgentStrings;
	}
}