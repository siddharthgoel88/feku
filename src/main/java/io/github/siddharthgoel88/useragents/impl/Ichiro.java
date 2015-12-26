package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Ichiro
 */
public class Ichiro extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"ichiro/4.0 (http://help.goo.ne.jp/door/crawler.html)",
			"ichiro/3.0 (http://help.goo.ne.jp/door/crawler.html)",
			"ichiro/2.0+(http://help.goo.ne.jp/door/crawler.html)",
			"ichiro/2.0 (ichiro@nttr.co.jp)",
			"ichiro/2.0 (http://help.goo.ne.jp/door/crawler.html)"
		};
		return userAgentStrings;
	}
}