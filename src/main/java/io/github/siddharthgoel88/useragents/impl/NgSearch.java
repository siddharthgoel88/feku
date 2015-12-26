package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for NgSearch
 */
public class NgSearch extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"NG-Search/0.9.8 (http://www.ng-search.com)",
			"NG-Search/0.86 (+http://www.ng-search.com)",
			"NG-Search/0.86 ( http://www.ng-search.com)"
		};
		return userAgentStrings;
	}
}