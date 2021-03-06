package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Fennec
 */
public class Fennec extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (Android; Linux armv7l; rv:9.0) Gecko/20111216 Firefox/9.0 Fennec/9.0",
			"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:7.0a1) Gecko/20110623 Firefox/7.0a1 Fennec/7.0a1",
			"Mozilla/5.0 (Maemo; Linux armv7l; rv:6.0a1) Gecko/20110526 Firefox/6.0a1 Fennec/6.0a1",
			"Mozilla/5.0 (Maemo; Linux armv7l; rv:6.0a1) Gecko/20110522 Firefox/6.0a1 Fennec/6.0a1",
			"Mozilla/5.0 (Maemo; Linux armv7l; rv:6.0a1) Gecko/20110518 Firefox/6.0a1 Fennec/6.0a1",
			"Mozilla/5.0 (Maemo; Linux armv7l; rv:6.0a1) Gecko/20110510 Firefox/6.0a1 Fennec/6.0a1",
			"Mozilla/5.0 (Windows; U; Windows NT 6.1; fr; rv:1.9.2.18) Gecko/20110614 Mozilla/5.0 (Android; Linux armv7l; rv:5.0) Gecko/20110615 Firefox/5.0 Fennec/5.0",
			"Mozilla/5.0 (Maemo; Linux armv7l; rv:5.0) Gecko/20110615 Firefox/5.0 Fennec/5.0",
			"Mozilla/5.0 (Macintosh; Intel Mac OS X 10.6; rv:5.0) Gecko/20110517 Firefox/5.0 Fennec/5.0",
			"Mozilla/5.0 (Android; WOW64; Linux armv7l;rv:5.0) Gecko/20110603 Firefox/5.0 Fennec/5.0",
			"Mozilla/5.0 (Android; Linux armv7l;rv:5.0) Gecko/20110603 Firefox/5.0 Fennec/5.0",
			"Mozilla/5.0 (Android; Linux armv7l; rv:5.0) Gecko/20110615 Firefox/5.0 Fennec/5.0",
			"Mozilla/5.0 (Android; Linux armv7l; rv:5.0) Gecko/20110614 Firefox/5.0 Fennec/5.0",
			"Mozilla/5.0 (Android; Linux armv7l; rv:5.0) Gecko/20110517 Firefox/5.0 Fennec/5.0",
			"Mozilla/5.0 (Android; Linux armv71; rv:5.0) Gecko/20110615 Fennec/5.0",
			"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:2.2a1pre) Gecko/20110331 Firefox/4.2a1pre Fennec/4.1a1pre",
			"Mozilla/5.0 (Android; Linux armv7l; rv:2.2a1pre) Gecko/20110403 Firefox/4.2a1pre Fennec/4.1a1pre",
			"Mozilla/5.0 (Android; Linux armv7l; rv:2.2a1pre) Gecko/20110402 Firefox/4.2a1pre Fennec/4.1a1pre",
			"Mozilla/5.0 (Maemo; Linux armv7l; rv:2.0b13pre) Gecko/20110315 Firefox/4.0b13pre Fennec/4.0b6pre",
			"Mozilla/5.0 (Android; Linux armv7l; rv:2.0b9pre) Gecko/20110103 Firefox/4.0b9pre Fennec/4.0b4pre",
			"Mozilla/5.0 (Maemo; Linux armv7l; rv:2.0b8pre) Gecko/20110328 Firefox/4.0b8pre Fennec/4.0b3pre",
			"Mozilla/5.0 (X11; Linux x86_64; rv:2.0) Gecko/20110402 Firefox/4.0 Fennec/4.0b3",
			"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:2.0b8) Gecko/20101221 Firefox/4.0b8 Fennec/4.0b3",
			"Mozilla/5.0 (X11; Linux i686; rv:2.0b7pre) Gecko/20101103 Firefox/4.0b8pre Fennec/4.0b2",
			"Mozilla/5.0 (X11; Linux i686; rv:2.1.1) Gecko/20110415 Firefox/4.0.2pre Fennec/4.0.1",
			"Mozilla/5.0 (X11; Linux i686 on x86_64; rv:2.1.1) Gecko/20110415 Firefox/4.0.2pre Fennec/4.0.1",
			"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:2.1.1) Gecko/20110415 Firefox/4.0.2pre Fennec/4.0.1",
			"Mozilla/5.0 (Windows NT 6.1; rv:2.1.1) Gecko/20110415 Firefox/4.0.2pre Fennec/4.0.1",
			"Mozilla/5.0 (Windows NT 6.0; rv:2.1.1) Gecko/20110415 Firefox/4.0.2pre Fennec/4.0.1",
			"Mozilla/5.0 (Windows NT 5.1; rv:2.1.1) Gecko/20110415 Firefox/4.0.2pre Fennec/4.0.1",
			"Mozilla/5.0 (Linux; U; Android 2.2; en-us; T-Mobile HTC_G2 Build/FRF91) Gecko/20110415 Firefox/4.0.2pre Fennec/4.0.1",
			"Mozilla/5.0 (Android; Linux armv7l; rv:2.1.1) Gecko/20110415 Firefox/4.0.2pre Fennec/4.0.1",
			"Mozilla/5.0 (Android; Linux armv7l; rv:2.1.1) Gecko/20110415 Fennec/4.0.1",
			"Mozilla/5.0 (Android; Linux arm7l; rv:2.1.1) Gecko/20110415 Firefox/4.0.2pre Fennec/4.0.1",
			"Mozilla/5.0 (Android; Linux arm71; rv:2.1.1) Gecko/20110415 Firefox/4.0.2pre Fennec/4.0.1",
			"Mozilla/5.0 (X11; Linux i686; rv:2.1) Gecko/20110318 Firefox/4.0b13pre Fennec/4.0",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; fr; rv:1.9.2.13) Gecko/20101203 Mozilla/5.O(Android;Linux armv7l;rv:2.1) Gecko/20110318 Firefox/4.0b13pre Fennec/4.0 ( .NET CLR 3.5.30729)",
			"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:2.1) Gecko/20110318 Firefox/4.0b13pre Fennec/4.0",
			"Mozilla/5.0 (Windows NT 6.1; rv:2.1) Gecko/20110318 Firefox/4.0b13pre Fennec/4.0",
			"Mozilla/5.0 (Windows NT 5.1; rv:2.1) Gecko/20110318 Firefox/4.0b13pre Fennec/4.0",
			"Mozilla/5.0 (Maemo; Linux armv7l; rv:2.1) Gecko/20110318 Firefox/4.0b13pre Fennec/4.0",
			"Mozilla/5.0 (Macintosh; Intel Mac OS X 10.6; rv:2.1) Gecko/20110318 Firefox/4.0b13pre Fennec/4.0",
			"Mozilla/5.0 (Linux arm) Gecko/20110318 Firefox/4.0b13pre Fennec/4.0",
			"Mozilla/5.0 (Android; Linux armv7l; rv:2.1) Gecko/20110318 Firefox/4.0b13pre Fennec/4.0",
			"Mozilla/5.0 (Android; Linux armv7l; rv:2.0) Gecko/20110103 Firefox/4.0 Fennec/4.0",
			"Mozilla/5.0 (Android; Linux armv71; rv:2.1) Gecko/20110318 Firefox/4.0b13pre Fennec/4.0",
			"Mozilla/5.0 (Android) Gecko/20110318 Firefox/4.0 Fennec/4.0",
			"Mozilla/5.0 (Android) Gecko Firefox Fennec/4.0",
			"Mozilla/5.0 (Windows NT 5.1; rv:2.0b6pre) Gecko/20100902 Firefox/4.0b6pre Fennec/2.0b1pre",
			"Mozilla/5.0 (X11; Linux armv7l; rv:2.0b4pre) Gecko/20100818 Firefox/4.0b4pre Fennec/2.0a1pre",
			"Mozilla/5.0 (X11; Linux armv7l; rv:2.0b4pre) Gecko/20100812 Firefox/4.0b4pre Fennec/2.0a1pre",
			"Mozilla/5.0 (X11; Linux armv7l; rv:2.0b3pre) Gecko/20100730 Firefox/4.0b3pre Fennec/2.0a1pre",
			"Mozilla/5.0 (X11; Linux armv71; en-US; rv:2.0b2pre) Gecko/20100722 Firefox/4.0b2pre Fennec/2.0a1pre",
			"Mozilla/5.0 (X11; Linux armv71;  rv:2.0b4pre) Gecko/20100818 Firefox/4.0b4pre Fennec/2.0a1pre",
			"Mozilla/5.0 (Android; Linux armv7l; rv:2.0.1) Gecko/20100101 Fennec/2.0.1",
			"Mozilla/5.0 (X11; U; Linux armv7l; pl-PL; rv:1.9.2.5) Gecko/20100614 Firefox/3.6.5pre Fennec/1.1",
			"Mozilla/5.0 (X11; U; Linux armv7l; en-US; rv:1.9.2a1pre) Gecko/20090322 Fennec/1.0b2pre",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:1.8.1.17) Gecko/20080829 Mozilla/5.0 (X11; U; Linux armv7l; en-US; rv:1.9.2a1pre) Gecko/20090322 Fennec/1.0b2pre",
			"Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.5; en-US; rv:1.9.2a1pre) Gecko/20090626 Fennec/1.0b2",
			"Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US; rv:1.9.2a1pre) Gecko/20090317 Fennec/1.0b1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.2a1pre) Gecko/20090317 Fennec/1.0b1",
			"Mozilla/5.0 (X11; U; Linux armv6l; en-US; rv:1.9.1b2pre) Gecko/20081116 Fennec/1.0a2pre",
			"Mozilla/5.0 (X11; U; Linux armv61; en-US; rv:1.9.1b2pre) Gecko/20081116 Fennec/1.0a2pre",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.2a1pre) Gecko/20081222 Fennec/1.0a2",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.1b4pre) Gecko/20090401 Fennec/1.0a2",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.1b3pre) Gecko/20090106 Fennec/1.0a2",
			"Mozilla/5.0 (X11; U; Linux armv6l; en-US; rv:1.9.2a1pre) Gecko/20081222 Fennec/1.0a2",
			"Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.2a1pre) Gecko/20081222 Fennec/1.0a2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.2a1pre) Gecko/20081222 Fennec/1.0a2",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.1b2pre) Gecko/20081015 Fennec/1.0a1",
			"Mozilla/5.0 (X11; U; Linux armv6l; en-US; rv:1.9.1b2pre) Gecko/20081015 Fennec/1.0a1",
			"Mozilla/5.0 (X11; U; Linux armv61; en-US; rv:1.9.1b2pre) Gecko/20081015 Fennec/1.0a1",
			"Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.1b2pre) Gecko/20081015 Fennec/1.0a1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.1b2pre) Gecko/20081015 Fennec/1.0a1",
			"Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.6; en-US; rv:1.9.1b2pre) Gecko/20081015 Fennec/1.0a1",
			"Mozilla/5.0 (X11; U; Linux armv6l; en-US; rv:1.9.1b1pre) Gecko/20081005220218 Gecko/2008052201 Fennec/0.9pre",
			"Mozilla/5.0 (X11; U; Linux armv6l; en-US; rv:1.9.1b1pre) Gecko/20080923171103 Fennec/0.8",
			"Mozilla/5.0 (X11; U; Linux armv6l; en-US; rv:1.9.1a2pre) Gecko/20080820121708 Fennec/0.7",
			"Mozilla/5.0 (X11; U; Linux armv6l; en-US; rv:1.9.1a1pre) Gecko/2008071707 Fennec/0.5",
			"Mozilla/5.0 (Windows; U; Windows CE 5.2; en-US; rv:1.9.2a1pre) Gecko/20090210 Fennec/0.11"
		};
		return userAgentStrings;
	}
}