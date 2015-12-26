package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Iceweasel
 */
public class Iceweasel extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (X11; Linux x86_64; rv:17.0) Gecko/20121202 Firefox/17.0 Iceweasel/17.0.1",
			"Mozilla/5.0 (X11; Linux x86_64; rv:15.0) Gecko/20100101 Firefox/15.0.1 Iceweasel/15.0.1",
			"Mozilla/5.0 (X11; Linux i686; rv:15.0) Gecko/20100101 Firefox/15.0.1 Iceweasel/15.0.1",
			"Mozilla/5.0 (X11; Linux x86_64; rv:15.0) Gecko/20120724 Debian Iceweasel/15.0",
			"Mozilla/5.0 (X11; Linux x86_64; rv:15.0) Gecko/20100101 Firefox/15.0 Iceweasel/15.0",
			"Mozilla/5.0 (X11; Linux x86_64; rv:12.0) Gecko/20120721 Debian Iceweasel/15.0",
			"Mozilla/5.0 (X11; Linux i686; rv:15.0) Gecko/20100101 Firefox/15.0 Iceweasel/15.0",
			"Mozilla/5.0 (X11; debian; Linux x86_64; rv:15.0) Gecko/20100101 Iceweasel/15.0",
			"Mozilla/5.0 (X11; Linux x86_64; rv:14.0) Gecko/20100101 Firefox/14.0.1 Iceweasel/14.0.1",
			"Mozilla/5.0 (X11; Linux i686; rv:14.0) Gecko/20100101 Firefox/14.0.1 Iceweasel/14.0.1",
			"Mozilla/5.0 (X11; Linux x86_64; rv:14.0) Gecko/20100101 Firefox/14.0 Iceweasel/14.0",
			"Mozilla/5.0 (X11; Linux x86_64; rv:12.0) Gecko/20100101 Debian Iceweasel/14.0",
			"Mozilla/5.0 (X11; Linux i686; rv:14.0) Gecko/20100101 Firefox/14.0 Iceweasel/14.0",
			"Mozilla/5.0 (X11; Linux x86_64; rv:13.0) Gecko/20100101 Firefox/13.0.1 Iceweasel/13.0.1",
			"Mozilla/5.0 (X11; Linux i686; rv:13.0) Gecko/20100101 Firefox/13.0.1 Iceweasel/13.0.1",
			"Mozilla/5.0 (X11; Linux x86_64; rv:13.0) Gecko/20100101 Firefox/13.0 Iceweasel/13.0",
			"Mozilla/5.0 (X11; Linux x86_64; rv:11.0a2) Gecko/20111230 Firefox/11.0a2 Iceweasel/11.0a2",
			"Mozilla/5.0 (X11; Gentoo Linux x86_64; rv:11.0a2) Gecko/20111230 Firefox/11.0a2 Iceweasel/11.0a2",
			"Mozilla/5.0 (X11; Linux x86_64; rv:10.0a2) Gecko/20111118 Firefox/10.0a2 Iceweasel/10.0a2",
			"Mozilla/5.0 (X11; Linux x86_64; rv:10.0.7) Gecko/20100101 Firefox/10.0.7 Iceweasel/10.0.7",
			"Mozilla/5.0 (X11; Linux ppc; rv:10.0.7) Gecko/20100101 Firefox/10.0.7 Iceweasel/10.0.7",
			"Mozilla/5.0 (X11; Linux i686; rv:10.0.7) Gecko/20100101 Iceweasel/10.0.7",
			"Mozilla/5.0 (X11; Linux i686; rv:10.0.7) Gecko/20100101 Firefox/10.0.7 Iceweasel/10.0.7",
			"Mozilla/5.0 (X11; Linux x86_64; rv:10.0.6) Gecko/20100101 Firefox/10.0.6 Iceweasel/10.0.6",
			"Mozilla/5.0 (X11; Linux i686; rv:10.0.6) Gecko/20100101 Firefox/10.0.6 Iceweasel/10.0.6",
			"Mozilla/5.0 (X11; Linux i686 on x86_64; rv:10.0.6) Gecko/20100101 Firefox/10.0.6 Iceweasel/10.0.6",
			"Mozilla/5.0 (X11; Linux armv6l; rv:10.0.6) Gecko/20100101 Firefox/10.0.6 Iceweasel/10.0.6",
			"Mozilla/5.0 (X11; Linux armv6l; rv:10.0.5) Gecko/20100101 Firefox/10.0.5 Iceweasel/10.0.5",
			"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20100101 Firefox/10.0 Iceweasel/10.0",
			"Mozilla/5.0 (X11; Linux i686; rv:10.0) Gecko/20100101 Firefox/10.0 Iceweasel/10.0",
			"Mozilla/5.0 (X11; Linux i686; rv:9.0a2) Gecko/20111104 Firefox/9.0a2 Iceweasel/9.0a2",
			"Mozilla/5.0 (X11; Linux x86_64; rv:9.0.1) Gecko/20100101 Firefox/9.0.1 Iceweasel/9.0.1",
			"Mozilla/5.0 (X11; Linux i686; rv:9.0.1) Gecko/20100101 Firefox/9.0.1 Iceweasel/9.0.1",
			"Mozilla/5.0 (X11; Linux i686; rv:8.0) Gecko/20100101 Firefox/8.0 Iceweasel/8.0",
			"Mozilla/5.0 (X11; Linux Debian i686; rv:8.0) Gecko/20100101 Firefox/8.0 Iceweasel/8.0",
			"Mozilla/5.0 (X11; Linux x86_64; rv:7.0.1) Gecko/20100101 Firefox/7.0.1 Iceweasel/7.0.1 Debian",
			"Mozilla/5.0 (X11; Linux i686; Debian Testing; rv:7.0.1) Gecko/20100101 Firefox/7.0.1 Iceweasel/7.0.1",
			"Mozilla/5.0 (X11; Linux i686 on x86_64; rv:6.0.2) Gecko/20100101 Firefox/6.0.2 Iceweasel/6.0.2",
			"Mozilla/5.0 (X11; Linux x86_64; rv:5.0) Gecko/20100101 Firefox/5.0 Iceweasel/5.0",
			"Mozilla/5.0 (X11; Linux i686; rv:5.0) Gecko/20100101 Firefox/5.0 Iceweasel/5.0",
			"Mozilla/5.0 (X11; Linux i686; rv: 5.0) Gecko/20100101 Firefox/5.0 Iceweasel/5.0",
			"Mozilla/5.0 (X11; Linux i686; rv:2.0) Gecko/20110322 Firefox/4.0 Iceweasel/4.0",
			"Mozilla/5.0 (X11; U; Linux x86_64; fr; rv:1.9.2.13) Gecko/20101203 Iceweasel/3.6.7 (like Firefox/3.6.13)",
			"Mozilla/5.0 (X11; U; Linux i686; pt-PT; rv:1.9.2.3) Gecko/20100402 Iceweasel/3.6.3 (like Firefox/3.6.3) GTB7.0",
			"Mozilla/5.0 (X11; U; Linux 2.6.34.1-SquidSheep; en-US; rv:1.9.2.3) Gecko/20100402 Iceweasel/3.6.3 (like Firefox/3.6.3)",
			"Mozilla/5.0 (X11; U; Linux i686; it; rv:1.9.2.13) Gecko/20110109 Iceweasel/3.6.13 (like Firefox/3.6.13)",
			"Mozilla/5.0 (X11; U; Linux i686; pt-PT; rv:1.9.2.3) Gecko/20100402 Iceweasel/3.6 (like Firefox/3.6) GTB7.0",
			"Mozilla/5.0 (X11; U; Linux i686; de-DE; rv:1.9.1.9) Gecko/20100501 Iceweasel/3.5.9 (like Firefox/3.5.9)",
			"Mozilla/5.0 (X11; U; Linux x86_64; ja; rv:1.9.1.8) Gecko/20100324 Iceweasel/3.5.8 (like Firefox/3.5.8)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.1.9) Gecko/20100501 Iceweasel/3.5.8 (like Firefox/3.5.8)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.1.9) Gecko/20100501 Iceweasel/3.5.6 (like Firefox/3.5.6; Debian-3.5.6-2)",
			"Mozilla/5.0 (X11; U; Linux i686; de; rv:1.9.1.5) Gecko/20091112 Iceweasel/3.5.5 (like Firefox/3.5.5; Debian-3.5.5-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.1.3) Gecko/20091010 Iceweasel/3.5.3 (Debian-3.5.3-2)",
			"Mozilla/5.0 (X11; U; Linux i686 (x86_64); en-GB; rv:1.9.1.3) Gecko/20091010 Iceweasel/3.5.3 (Debian-3.5.3-2)",
			"Mozilla/5.0 (X11; U; Linux i686; de; rv:1.9.1.19) Gecko/20110430 Iceweasel/3.5.19 (like Firefox/3.5.19)",
			"Mozilla/5.0 (X11; U; Linux i686; de-DE; rv:1.9.1.18) Gecko/20110324 Iceweasel/3.5.18 (like Firefox/3.5.18)",
			"Mozilla/5.0 (X11; U; Linux x86_64; sv-SE; rv:1.9.1.16) Gecko/20120714 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux x86_64; it; rv:1.9.1.16) Gecko/20120921 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux x86_64; it; rv:1.9.1.16) Gecko/20120714 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux x86_64; it; rv:1.9.1.16) Gecko/20120602 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux x86_64; it; rv:1.9.1.16) Gecko/20111108 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux x86_64; hu-HU; rv:1.9.1.16) Gecko/20110107 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux x86_64; fr; rv:1.9.1.16) Gecko/20120714 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux x86_64; fr; rv:1.9.1.16) Gecko/20120511 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux x86_64; es-ES; rv:1.9.1.16) Gecko/20120602 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux x86_64; es-ES; rv:1.9.1.16) Gecko/20120315 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.1.16) Gecko/20120714 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.1.16) Gecko/20120602 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.1.16) Gecko/20111108 Iceweasel/3.5.16",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.1.16) Gecko/20110107 Iceweasel/3.5.16 (Debian-3.0.5-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; de; rv:1.9.1.16) Gecko/20120714 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux x86_64; de; rv:1.9.1.16) Gecko/20120131 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux x86_64; cs-CZ; rv:1.9.1.16) Gecko/20120602 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux i686; it; rv:1.9.1.16) Gecko/20120602 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux i686; fr; rv:1.9.1.16) Gecko/20120714 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux i686; es-ES; rv:1.9.1.16) Gecko/20111108 Iceweasel/3.5.16 (like Firefox/3.5.16)",
			"Mozilla/5.0 (X11; U; Linux i686; en-GB; rv:1.9.1.11) Gecko/20100819 Iceweasel/3.5.11 (like Firefox/3.5.11)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.1) Gecko/20090704 Iceweasel/3.5 (Debian-3.5-0)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.1b3pre) Gecko/20090207 Ubuntu/9.04 (jaunty) IceWeasel/3.1b3pre",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9b5) Gecko/2008042623 Iceweasel/3.0b5 (Debian-3.0~b5-3)",
			"Mozilla/5.0 (X11; U; Linux x86_64; fr; rv:1.9.0.11) Gecko/2009061208 Iceweasel/3.0.9 (Debian-3.0.9-1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.18) Gecko/2010021720 Iceweasel/3.0.9 (Debian-3.0.9-1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.11) Gecko/2009061212 Iceweasel/3.0.9 (Debian-3.0.9-1) GTB5",
			"Mozilla/5.0 (X11; U; Linux i686; en-GB; rv:1.9.0.7) Gecko/2009030814 Iceweasel/3.0.9 (Debian-3.0.9-1)",
			"Mozilla/5.0 (X11; U; Linux i686; de-DE; rv:1.9.0.11) Gecko/2009061212 Iceweasel/3.0.9 (Debian-3.0.9-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.0.8) Gecko/2009033109 Gentoo Iceweasel/3.0.8",
			"Mozilla/5.0 (X11; U; Linux x86_64; de; rv:1.9.0.8) Gecko/2009032917 Gentoo Iceweasel/3.0.8",
			"Mozilla/5.0 (X11; U; Linux x86_64; fr; rv:1.9.0.7) Gecko/2009030810 Iceweasel/3.0.7 (Debian-3.0.7-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.0.8) Gecko/2009032809 Iceweasel/3.0.7 (Debian-3.0.7-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.0.6) Gecko/2009020407 Iceweasel/3.0.7 (Debian-3.0.7-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; de; rv:1.9.0.7) Gecko/2009030810 Iceweasel/3.0.7 (Debian-3.0.7-1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.8) Gecko/2009032811 Iceweasel/3.0.7 (Debian-3.0.7-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; fr; rv:1.9.0.7) Gecko/2009032813 Iceweasel/3.0.6 Firefox/3.0.6 (Debian-3.0.6-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; fr; rv:1.9.0.7) Gecko/2009031819 Iceweasel/3.0.6 (Debian-3.0.6-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; fr; rv:1.9.0.19) Gecko/2010072022 Iceweasel/3.0.6 (Debian-3.0.6-3)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.0.7) Gecko/2009032813 Iceweasel/3.0.6 (Debian-3.0.6-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.0.19) Gecko/2011050707 Iceweasel/3.0.6 (Debian-3.0.6-3)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.0.12) Gecko/2009072220 Iceweasel/3.0.6 (Debian-3.0.6-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-GB; rv:1.9.0.11) Gecko/2009061208 Iceweasel/3.0.6 (Debian-3.0.6-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; de; rv:1.9.0.7) Gecko/2009031819 Iceweasel/3.0.6 (Debian-3.0.6-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; de; rv:1.9.0.19) Gecko/2012013123 Iceweasel/3.0.6 (Debian-3.0.6-3)",
			"Mozilla/5.0 (X11; U; Linux x86_64; de; rv:1.9.0.16) Gecko/2009121609 Iceweasel/3.0.6 (Debian-3.0.6-3)",
			"Mozilla/5.0 (X11; U; Linux i686; nl; rv:1.9.0.11) Gecko/2009061212 Iceweasel/3.0.6 (Debian-3.0.6-1)",
			"Mozilla/5.0 (X11; U; Linux i686; ja; rv:1.9.0.7) Gecko/2009032803 Iceweasel/3.0.6 (Debian-3.0.6-1)",
			"Mozilla/5.0 (X11; U; Linux i686; it; rv:1.9.0.6) Gecko/2009020409 Iceweasel 3.0.6 (Debian 5.0",
			"Mozilla/5.0 (X11; U; Linux i686; it; rv:1.9.0.19) Gecko/2010120923 Iceweasel/3.0.6 (Debian-3.0.6-3)",
			"Mozilla/5.0 (X11; U; Linux i686; fr; rv:1.9.0.19) Gecko/2011092908 Iceweasel/3.0.6 (Debian-3.0.6-3)",
			"Mozilla/5.0 (X11; U; Linux i686; fr; rv:1.9.0.19) Gecko/2010102906 Iceweasel/3.0.6 (Debian-3.0.6-3)",
			"Mozilla/5.0 (X11; U; Linux i686; fr; rv:1.9.0.13) Gecko/2009082121 Iceweasel/3.0.6 (Debian-3.0.6-1)",
			"Mozilla/5.0 (X11; U; Linux i686; es-ES; rv:1.9.0.11) Gecko/2009061212 Iceweasel/3.0.6 (Debian-3.0.6-1)",
			"Mozilla/5.0 (X11; U; Linux i686; es-AR; rv:1.9.0.7) Gecko/2009032803 Iceweasel/3.0.6 (Debian-3.0.6-1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.7) Gecko/2009032803 Iceweasel/3.0.6 (Debian-3.0.6-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.0.5) Gecko/2008122903 Gentoo Iceweasel/3.0.5",
			"Mozilla/5.0 (X11; U; Linux i686; es-ES; rv:1.9.0.5) Gecko/2008122011 Iceweasel/3.0.5 (Debian-3.0.5-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; cs-CZ; rv:1.9.0.4) Gecko/2008112309 Iceweasel/3.0.4 (Debian-3.0.4-1)",
			"Mozilla/5.0 (X11; U; Linux ppc; en-US; rv:1.9.0.1) Gecko/2008072112 Iceweasel/3.0.3 (Debian-3.0.3-2)",
			"Mozilla/5.0 (X11; U; Linux i686; ca-AD; rv:1.9.0.3) Gecko/2008092816 Iceweasel/3.0.3 (Debian-3.0.3-3)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.2) Gecko/2008090211 Ubuntu/9.04 (jaunty) Iceweasel/3.0.2",
			"Mozilla/5.0 (X11; U; Linux i686; de; rv:1.9.0.11) Gecko/2009061212 Iceweasel/3.0.12 (Debian-3.0.12-1)",
			"Mozilla/5.0 (X11; U; Linux i686; es-ES; rv:1.9.0.11) Gecko/2009061319 Iceweasel/3.0.11 (Debian-3.0.11-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.0.1) Gecko/2008071420 Iceweasel/3.0.1 (Debian-3.0.1-1)",
			"Mozilla/5.0 (X11; U; Linux ppc; en-US; rv:1.9.0.1) Gecko/2008072112 Iceweasel/3.0.1 (Debian-3.0.1-1)",
			"Mozilla/5.0 (X11; U; Linux i686; it; rv:1.9.0.1) Gecko/2008071618 Iceweasel/3.0.1 (Debian-3.0.1-1)",
			"Mozilla/5.0 (Linux X86; U; Debian SID; it; rv:1.9.0.1) Gecko/2008070208 Debian IceWeasel/3.0.1",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9) Gecko/2008062908 Iceweasel/3.0 (Debian-3.0~rc2-2)",
			"Mozilla/5.0 (X11; U; Linux ppc; en-US; rv:1.9) Gecko/2008062909 Iceweasel/3.0 (Debian-3.0~rc2-2)",
			"Mozilla/5.0 (X11; U; Linux i686; en; rv:1.9) Gecko/2008062113 Iceweasel/3.0",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9) Gecko/2008062113 Iceweasel/3.0 (Debian-3.0~rc2-2)",
			"Mozilla/5.0 (X11; U; Linux i686; es-ES; rv:1.8.1.9) Gecko/20071025 Iceweasel/2.0.0.9 (Debian-2.0.0.9-2)",
			"Mozilla/5.0 (X11; U; Linux i686; es-ES; rv:1.8.1.9) Gecko/20071025 Iceweasel/2.0.0.9",
			"Mozilla/15.0 (X11; U; Linux i686; es-ES; rv:1.8.1.9) Gecko/20071025 Iceweasel/2.0.0.9",
			"Mozilla/5.0 (X11; U; Linux i686; ru; rv:1.8.1.8) Gecko/20071004 Iceweasel/2.0.0.8 (Debian-2.0.0.6+2.0.0.8-0etch1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.8) Gecko/20071004 Iceweasel/2.0.0.8 (Debian-2.0.0.6+2.0.0.8-0etch1)",
			"Mozilla/5.0 (X11; U; Linux x64; en-US; rv:1.8.1.7) Gecko/20070914 Iceweasel/2.0.0.7 (Debian-2.0.0.7-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.8.1.6) Gecko/20070723 Iceweasel/2.0.0.6 (Debian-2.0.0.6-0etch1)",
			"Mozilla/5.0 (X11; U; Linux x64; en-US; rv:1.8.1.6) Gecko/20070723 Iceweasel/2.0.0.6 (Debian-2.0.0.6-1)",
			"Mozilla/5.0 (X11; U; Linux i686; es-AR; rv:1.8.1.6) Gecko/20070723 Iceweasel/2.0.0.6 (Debian-2.0.0.6-0etch1+lenny1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.6) Gecko/20070723 Iceweasel/2.0.0.6 (Debian-2.0.0.6-0etch1+lenny1) (.NET CLR 3.5.30729)",
			"Mozilla/5.0 (X11; U; Linux i686; es-AR; rv:1.8.1.4) Gecko/20070508 Iceweasel/2.0.0.4 (Debian-2.0.0.4-0etch1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.4) Gecko/20070508 Iceweasel/2.0.0.4 (Debian-2.0.0.4-1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.4) Gecko/20070508 Iceweasel/2.0.0.4 (Debian-2.0.0.4-0etch1)",
			"Mozilla 5.0 (X11; U; Linux i686; en-US; rv:1.8.1.14) Gecko/200770508  Iceweasel/2.0.0.4",
			"Mozilla/5.0 (X11; U; Linux x86_64; fr; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3 (Debian-2.0.0.3-2)",
			"Mozilla/5.0 (X11; U; Linux x86_64; fr; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3 (Debian-2.0.0.3-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3 (Debian-2.0.0.3-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-GB; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3 (Debian-2.0.0.3-1)",
			"Mozilla/5.0 (X11; U; Linux ppc; en-US; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3 (Debian-2.0.0.3-1)",
			"Mozilla/5.0 (X11; U; Linux i686; pt-BR; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3 (Debian-2.0.0.3-1)",
			"Mozilla/5.0 (X11; U; Linux i686; nb-NO; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3 (Debian-2.0.0.3-1)",
			"Mozilla/5.0 (X11; U; Linux i686; fr; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3 (Debian-2.0.0.3-2)",
			"Mozilla/5.0 (X11; U; Linux i686; fr; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3 (Debian-2.0.0.3-1)",
			"Mozilla/5.0 (X11; U; Linux i686; es-AR; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3 (Debian-2.0.0.3-1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3 (Debian-2.0.0.3-2)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3 (Debian-2.0.0.3-1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.13) Gecko/20080311 Firefox/2.0 Iceweasel/2.0.0.3 (Debian-2.0.0.13-1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-GB; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3 (Debian-2.0.0.3-2)",
			"Mozilla/5.0 (X11; U; Linux i686; en-GB; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3 (Debian-2.0.0.3-1)",
			"Mozilla/5.0 (X11; U; Linux i686; de; rv:1.8.1.3) Gecko/20070310 Iceweasel/2.0.0.3 (Debian-2.0.0.3-1)",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.9a3) Gecko/20070409 IceWeasel/2.0.0.3",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.2) Gecko/20070208 Iceweasel/2.0.0.2 (Debian-2.0.0.2+dfsg-3)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.8.1.19) Gecko/20081202 Iceweasel/2.0.0.19 (Debian-2.0.0.19-0etch1)",
			"Mozilla/5.0 (X11; U; Linux i686; es-ES; rv:1.8.1.18) Gecko/20081030 Iceweasel/2.0.0.18 (Debian-2.0.0.18-0etch1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-GB; rv:1.8.1.17) Gecko/20080827 Iceweasel/2.0.0.17 (Debian-2.0.0.17-0etch1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.8.1.16) Gecko/20080702 Iceweasel/2.0.0.16 (Debian-2.0.0.16-0etch1)",
			"Mozilla/5.0 (X11; U; Linux i686; fr; rv:1.8.1.16) Gecko/20080702 Iceweasel/2.0.0.16 (Debian-2.0.0.16-0etch1)",
			"Mozilla/5.0 (X11; U; Linux ppc; de; rv:1.8.1.15) Gecko/20080612 Iceweasel/2.0.0.15 (Debian-2.0.0.15-0etch1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.15) Gecko/20080612 Iceweasel/2.0.0.15 (Debian-2.0.0.15-0etch1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; ru; rv:1.8.1.14) Gecko/20080404 Iceweasel/2.0.0.14 (Debian-2.0.0.14-2)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.8.1.14) Gecko/20080404 Iceweasel/2.0.0.14 (Debian-2.0.0.14-2)",
			"Mozilla/5.0 (X11; U; Linux sparc64; en-US; rv:1.8.1.14) Gecko/20080404 Iceweasel/2.0.0.14 (Debian-2.0.0.14-0etch1)",
			"Mozilla/5.0 (X11; U; Linux i686; pl-PL; rv:1.8.1.14) Gecko/20080404 Iceweasel/2.0.0.14 (Debian-2.0.0.14-0etch1)",
			"Mozilla/5.0 (X11; U; Linux i686; es-ES; rv:1.8.1.14) Gecko/20080404 Iceweasel/2.0.0.14 (Debian-2.0.0.14-2)",
			"Mozilla/5.0 (X11; U; Linux i686; es-ES; rv:1.8.1.14) Gecko/20080404 Iceweasel/2.0.0.14 (Debian-2.0.0.14-0etch1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.14) Gecko/20080404 Iceweasel/2.0.0.14 (Debian-2.0.0.14-2)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.14) Gecko/20080404 Iceweasel/2.0.0.14 (Debian-2.0.0.14-0etch1)",
			"Mozilla/5.0 (X11; U; Linux i686; fr; rv:1.8.1.13) Gecko/20080311 Iceweasel/2.0.0.13 (Debian-2.0.0.13-1)",
			"Mozilla/5.0 (X11; U; Linux i686; es-ES; rv:1.8.1.13) Gecko/20080311 Iceweasel/2.0.0.13 (Debian-2.0.0.13-0etch1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.13) Gecko/20080311 Firefox/2.0.0.3 Iceweasel/2.0.0.13 (Debian-2.0.0.13-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; de; rv:1.8.1.12) Gecko/20080129 Iceweasel/2.0.0.12 (Debian-2.0.0.12-1)",
			"Mozilla/5.0 (X11; U; Linux i686; it; rv:1.8.1.12) Gecko/20080129 Iceweasel/2.0.0.12 (Debian-2.0.0.12-1)",
			"Mozilla/5.0 (X11; U; Linux i686; it; rv:1.8.1.12) Gecko/20080129 Iceweasel/2.0.0.12 (Debian-2.0.0.12-0etch1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; es-ES; rv:1.8.1.11) Gecko/20071128 Iceweasel/2.0.0.11 (Debian-2.0.0.11-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.8.1.11) Gecko/20071128 Iceweasel/2.0.0.11 (Debian-2.0.0.11-1)",
			"Mozilla/5.0 (X11; U; Linux i686; ja; rv:1.8.1.11) Gecko/20071128 Iceweasel/2.0.0.11 (Debian-2.0.0.11-1)",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; ru; rv:1.9.2.13) Gecko/20101203 IceWeasel/2.0.0.11 Mnenhy/0.8.3",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.8.1.1) Gecko/20061205 Iceweasel/2.0.0.1 (Debian-2.0.0.1+dfsg-4)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.8.1.1) Gecko/20061205 Iceweasel/2.0.0.1 (Debian-2.0.0.1+dfsg-2)",
			"Mozilla/5.0 (X11; U; Linux x86_64; de; rv:1.8.1.1) Gecko/2006120502 Iceweasel/2.0.0.1 (Debian-2.0.0.1+dfsg-2)",
			"Mozilla/5.0 (X11; U; Linux x86_64; de; rv:1.8.1.1) Gecko/20061205 Iceweasel/2.0.0.1 (Debian-2.0.0.1+dfsg-2)",
			"Mozilla/5.0 (X11; U; Linux i686; pl-PL; rv:1.8.1.1) Gecko/20061205 Iceweasel/2.0.0.1 (Debian-2.0.0.1+dfsg-1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.1) Gecko/20061205 Iceweasel/2.0.0.1 (Debian-2.0.0.1+dfsg-2)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.1) Gecko/20061205 Iceweasel/2.0.0.1 (Debian-2.0.0.1+dfsg-1)",
			"Mozilla/5.0 (X11; U; Linux i686; de; rv:1.8.1.1) Gecko/20061205 Iceweasel/2.0.0.1 (Debian-2.0.0.1+dfsg-2)",
			"Mozilla/5.0 (X11; U; Linux i686; de-DE; rv:1.8.1.1) Gecko/20061205 Iceweasel/2.0.0.1 (Debian-2.0.0.1+dfsg-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.8.1) Gecko/20061024 Iceweasel/2.0 (Debian-2.0+dfsg-1)",
			"Mozilla/5.0 (X11; U; Linux x86_64; en-GB; rv:1.9.0.9) Gecko/2009050519 iceweasel/2.0 (Debian-3.0.6-1)",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1) Gecko/20061024 Iceweasel/2.0 (Debian-2.0+dfsg-1)",
			"Mozilla/5.0 (X11; U; Linux i686 (x86_64); en; rv:1.8.1) Gecko/20061024 Iceweasel/2.0 (Debian-2.0+dfsg-1)",
			"Mozilla/5.0 (X11; U; Linux i686 (x86_64); en; rv:1.8.1) Gecko/20061024 Iceweasel/2.0",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.0.7) Gecko/20061022 Iceweasel/1.5.0.7-g2",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.0.8pre) Gecko/20061001 Firefox/1.5.0.8pre (Iceweasel)",
			"Mozilla/5.0 (X11; U; Linux i686; en-GB; rv:1.9.0.7) Gecko/2009030814 Iceweasel Firefox/3.0.7 (Debian-3.0.7-1)",
			"Mozilla/5.0 (Linux) Gecko Iceweasel (Debian) Mnenhy"
		};
		return userAgentStrings;
	}
}