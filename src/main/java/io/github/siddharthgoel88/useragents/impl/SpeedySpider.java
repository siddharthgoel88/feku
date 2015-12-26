package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for SpeedySpider
 */
public class SpeedySpider extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US) Speedy Spider (http://www.entireweb.com/about/search_tech/speedy_spider/)",
			"Mozilla/5.0 (compatible; Speedy Spider; http://www.entireweb.com/about/search_tech/speedy_spider/)",
			"Speedy Spider (Entireweb; Beta/1.3; http://www.entireweb.com/about/search_tech/speedyspider/)",
			"Speedy Spider (Entireweb; Beta/1.2; http://www.entireweb.com/about/search_tech/speedyspider/)",
			"Speedy Spider (Entireweb; Beta/1.1; http://www.entireweb.com/about/search_tech/speedyspider/)",
			"Speedy Spider (Entireweb; Beta/1.0; http://www.entireweb.com/about/search_tech/speedyspider/)",
			"Speedy Spider (Beta/1.0; www.entireweb.com)",
			"Speedy Spider (http://www.entireweb.com/about/search_tech/speedy_spider/)",
			"Speedy Spider (http://www.entireweb.com/about/search_tech/speedyspider/)",
			"Speedy Spider (http://www.entireweb.com)"
		};
		return userAgentStrings;
	}
}