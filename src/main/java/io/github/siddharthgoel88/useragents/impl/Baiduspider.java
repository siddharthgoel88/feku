package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Baiduspider
 */
public class Baiduspider extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (compatible; Baiduspider/2.0; +http://www.baidu.com/search/spider.html)",
			"Baiduspider+(+http://www.baidu.com/search/spider_jp.html)",
			"Baiduspider+(+http://www.baidu.com/search/spider.htm)",
			"BaiDuSpider"
		};
		return userAgentStrings;
	}
}