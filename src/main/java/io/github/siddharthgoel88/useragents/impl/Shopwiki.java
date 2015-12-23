package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Shopwiki
 */
public class Shopwiki extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"ShopWiki/1.0 ( +http://www.shopwiki.com/wiki/Help:Bot)"
		};
		return userAgentStrings;
	}
}