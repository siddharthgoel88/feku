package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Netscape
 */
public class Netscape extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; SG; rv:1.9.2.4) Gecko/20101104 Netscape/9.1.0285",
			"Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.8.1.8pre) Gecko/20070928 Firefox/2.0.0.7 Navigator/9.0RC1",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:1.8.1.8pre) Gecko/20070928 Firefox/2.0.0.7 Navigator/9.0RC1",
			"Mozilla/5.0 (Macintosh; U; Intel Mac OS X; en-US; rv:1.8.1.8pre) Gecko/20071001 Firefox/2.0.0.7 Navigator/9.0RC1",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.7pre) Gecko/20070815 Firefox/2.0.0.6 Navigator/9.0b3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.2; en-US; rv:1.8.1.7pre) Gecko/20070815 Firefox/2.0.0.6 Navigator/9.0b3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.8.1.7pre) Gecko/20070815 Firefox/2.0.0.6 Navigator/9.0b3",
			"Mozilla/5.0 (Macintosh; U; PPC Mac OS X Mach-O; en-US; rv:1.8.1.7pre) Gecko/20070815 Firefox/2.0.0.6 Navigator/9.0b3",
			"Mozilla/5.0 (Windows; U; Windows 98; en-US; rv:1.8.1.5pre) Gecko/20070710 Firefox/2.0.0.4 Navigator/9.0b2",
			"Mozilla/5.0 (Macintosh; U; PPC Mac OS X Mach-O; en-US; rv:1.8.1.5pre) Gecko/20070710 Firefox/2.0.0.4 Navigator/9.0b2",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.12) Gecko/20080219 Firefox/2.0.0.12 Navigator/9.0.0.6",
			"Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.8.1.12) Gecko/20080219 Firefox/2.0.0.12 Navigator/9.0.0.6",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.8.1.12) Gecko/20080219 Firefox/2.0.0.12 Navigator/9.0.0.6",
			"Mozilla/5.0 (Macintosh; U; PPC Mac OS X Mach-O; en-US; rv:1.8.1.12) Gecko/20080219 Firefox/2.0.0.12 Navigator/9.0.0.6",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.11pre) Gecko/20071206 Firefox/2.0.0.11 Navigator/9.0.0.5",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.8.1.11pre) Gecko/20071206 Firefox/2.0.0.11 Navigator/9.0.0.5 GTB5",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.8.1.11pre) Gecko/20071206 Firefox/2.0.0.11 Navigator/9.0.0.5",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.8.1.11pre) Gecko/20071206 Firefox/2.0.0.11 Navigator/9.0.0.5",
			"Mozilla/5.0 (Macintosh; U; PPC Mac OS X Mach-O; en-US; rv:1.8.1.11pre) Gecko/20071206 Firefox/2.0.0.11 Navigator/9.0.0.5",
			"Mozilla/5.0 (Macintosh; U; Intel Mac OS X; en-US; rv:1.8.1.11pre) Gecko/20071206 Firefox/2.0.0.11 Navigator/9.0.0.5",
			"Mozilla/5.0 (Macintosh; U; Intel Mac OS X; en-US; rv:1.8.1.10pre) Gecko/20071127 Firefox/2.0.0.10 Navigator/9.0.0.4",
			"Mozilla/5.0 (X11; U; Linux i586; en-US; rv:1.8.1.9pre) Gecko/20071102 Firefox/2.0.0.9 Navigator/9.0.0.3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.8.1.9pre) Gecko/20071102 Firefox/2.0.0.9 Navigator/9.0.0.3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; fr; rv:1.8.1.9pre) Gecko/20071102 Firefox/2.0.0.9 Navigator/9.0.0.3",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:1.8.1.9pre) Gecko/20071102 Firefox/2.0.0.9 Navigator/9.0.0.3",
			"Mozilla/5.0 (Macintosh; U; Intel Mac OS X; en-US; rv:1.8.1.9pre) Gecko/20071102 Firefox/2.0.0.9 Navigator/9.0.0.3",
			"Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.8.1.8pre) Gecko/20071019 Firefox/2.0.0.8 Navigator/9.0.0.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.8.1.8pre) Gecko/20071019 Firefox/2.0.0.8 Navigator/9.0.0.1",
			"Mozilla/5.0 (Windows; U; Windows 98; en-US; rv:1.8.1.8pre) Gecko/20071019 Firefox/2.0.0.8 Navigator/9.0.0.1",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:1.8.1.8pre) Gecko/20071019 Firefox/2.0.0.8 Navigator/9.0.0.1",
			"Mozilla/5.0 (Macintosh; U; Intel Mac OS X; en-US; rv:1.8.1.8pre) Gecko/20071019 Firefox/2.0.0.8 Navigator/9.0.0.1",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.1.8pre) Gecko/20071015 Firefox/2.0.0.7 Navigator/9.0",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.7.5) Gecko/20070321 Netscape/9.0",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.8.1.8pre) Gecko/20071015 Firefox/2.0.0.7 Navigator/9.0",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; en-US; rv:1.8.1.8pre) Gecko/20071015 Firefox/2.0.0.7 Navigator/9.0",
			"Mozilla/5.0 (Macintosh; U; PPC Mac OS X Mach-O; en-US; rv:1.8.1.8pre) Gecko/20071015 Firefox/2.0.0.7 Navigator/9.0",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.7.5) Gecko/20070321 Netscape/8.1.3",
			"Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.7.5) Gecko/20070321 Netscape/8.1.3",
			"Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.7.5) Gecko/20060912 Netscape/8.1.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; es-AR; rv:1.7.5) Gecko/20060912 Netscape/8.1.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; es-AR; rv:1.7.5) Gecko/20060912 Netscape/8.1.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.7.5) Gecko/20060912 Netscape/8.1.2",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.7.5) Gecko/20060127 Netscape/8.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; it-IT; rv:1.7.5) Gecko/20060127 Netscape/8.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; es-ES; rv:1.7.5) Gecko/20060127 Netscape/8.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.7.5) Gecko/20060127 Netscape/8.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.7.5) Gecko/20060111 Netscape/8.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; de-DE; rv:1.7.5) Gecko/20060127 Netscape/8.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.7.5) Gecko/20060127 Netscape/8.1",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:1.7.5) Gecko/20060127 Netscape/8.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.7.5) Gecko/20051012 Netscape/8.0.4",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.7.5) Gecko/20051012 Netscape/8.0.4",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.7.5) Gecko/20050817 Netscape/8.0.3.4",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.7.5) Gecko/20050729 Netscape/8.0.3.3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.7.5) Gecko/20050729 Netscape/8.0.3.3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-CA; rv:1.7.5) Gecko/20050610 Netscape/8.0.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.7.5) Gecko/20050603 Netscape/8.0.2",
			"Mozilla/5.0 (Windows; U; Windows NT 4.0; SG; rv:1.7.5) Gecko/20050610 Netscape/8.0.2",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:1.7.5) Gecko/20050603 Netscape/8.0.2",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; en-US; rv:1.7.5) Gecko/20050603 Netscape/8.0.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.7.5) Gecko/20050519 Netscape/8.0.1 FirePHP/0.3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.7.5) Gecko/20050519 Netscape/8.0.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.7.5) Gecko/20050519 Netscape/8.0.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.7.2) Gecko/20050208  Netscape/7.20",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.7.2) Gecko/20040805 Netscape/7.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.7.2) Gecko/20040804 Netscape/7.2 (ax)",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.7.2) Gecko/20040804 Netscape/7.2 (ax)",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; de-DE; rv:1.7.2) Gecko/20040804 Netscape/7.2 (ax)",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:1.7.2) Gecko/20040804 Netscape/7.2 (ax)",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; en-US; rv:1.7.2) Gecko/20040804 Netscape/7.2 (ax)",
			"Mozilla/5.0 (Macintosh; U; PPC Mac OS X Mach-O; rv:1.7.2) Gecko/20040804 Netscape/7.2",
			"Mozilla/5.0 (Macintosh; U; PPC Mac OS X Mach-O; en-US; rv:1.7.2) Gecko/20040804 Netscape/7.2",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.4) Gecko/20030624 Netscape/7.1",
			"Mozilla/5.0 (Windows; U; WinNT4.0; en-US; rv:1.4) Gecko/20030624 Netscape/7.1 (ax)",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; fr-FR; rv:1.4) Gecko/20030624 Netscape/7.1 (ax)",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.4) Gecko/20030624 Netscape/7.1 (ax)",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-CA; rv:1.4) Gecko/20030624 Netscape/7.1 (ax)",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; de-DE; rv:1.4) Gecko/20030624 Netscape/7.1 (ax)",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; de-DE; rv:1.4) Gecko/20030619 Netscape/7.1 (ax)",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.4) Gecko/20030624 Netscape/7.1 (ax)",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; de-DE; rv:1.4) Gecko/20030624 Netscape/7.1 (ax)",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; de-DE; rv:1.4) Gecko/20030619 Netscape/7.1 (ax)",
			"Mozilla/5.0 (Windows; U; Win98; ja-JP; rv:1.4) Gecko/20030624 Netscape/7.1 (ax)",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:1.7.2) Gecko/20040804 Netscape/7.1 (ax)",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:1.4) Gecko/20030624 Netscape/7.1 (ax)",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:1.4) Gecko Netscape/7.1 (ax)",
			"Mozilla/5.0 (Windows; U; Win98; de-DE; rv:1.4) Gecko/20030619 Netscape/7.1 (ax)",
			"Mozilla/5.0 (Windows; U; Win95; en-US; rv:1.4) Gecko/20030624 Netscape/7.1",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; en-US; rv:1.4) Gecko/20030624 Netscape/7.1 (ax)",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; de-DE; rv:1.4) Gecko/20030619 Netscape/7.1 (ax)",
			"Mozilla/5.0 (Macintosh; U; PPC Mac OS X Mach-O; en-US; rv:1.4) Gecko/20030624 Netscape/7.1",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (X11; U; Linux i686; de-DE; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (X11; U; Linux i586; en-US; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Windows; U; WinNT4.0; de-DE; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; fr-FR; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; de-DE; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; fr-FR; rv:1.0.2) Gecko/20030208 Netscape/7.02 (ax)",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; fr-FR; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; de-DE; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Windows; U; Win98; fr-FR; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Windows; U; Win98; de-DE; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Windows; U; Win95; de-DE; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; en-US; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Macintosh; U; PPC; ja-JP; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Macintosh; U; PPC; fr-FR; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Macintosh; U; PPC; en-US; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Macintosh; U; PPC; de-DE; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (Macintosh; U; PPC Mac OS X; fr-FR; rv:1.0.2) Gecko/20030208 Netscape/7.02",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (X11; U; Linux i686; de-DE; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Windows; U; WinNT4.0; fr-FR; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Windows; U; WinNT4.0; en-US; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Windows; U; WinNT4.0; de-DE; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Windows; U; WinNT4.0; de-AT; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; fr-FR; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; de-DE; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; ja-JP; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; de-DE; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Windows; U; Win98; de-DE; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; en-US; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; de-DE; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Macintosh; U; PPC; fr-FR; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Macintosh; U; PPC; en-US; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Macintosh; U; PPC; de-DE; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (Macintosh; U; PPC Mac OS X; en-US; rv:1.0.2) Gecko/20021120 Netscape/7.01",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.0rc2) Gecko/20020513 Netscape/7.0b1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; fr-FR; rv:1.0rc2) Gecko/20020512 Netscape/7.0b1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.0rc2) Gecko/20020618 Netscape/7.0b1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.0rc2) Gecko/20020512 Netscape/7.0b1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.0rc2) Gecko/20020512 Netscape/7.0b1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; de-DE; rv:1.0rc2) Gecko/20020512 Netscape/7.0b1",
			"Mozilla/5.0 (Macintosh; U; PPC; en-US; rv:1.0rc2) Gecko/20020512 Netscape/7.0b1",
			"Mozilla/5.0 (X11; U; SunOS sun4u; en-US; rv:1.0.1) Gecko/20020921 Netscape/7.0",
			"Mozilla/5.0 (X11; U; SunOS sun4u; en-US; rv:1.0.1) Gecko/20020920 Netscape/7.0",
			"Mozilla/5.0 (X11; U; SunOS sun4u; en-US; rv:1.0.1) Gecko/20020719 Netscape/7.0",
			"Mozilla/5.0 (X11; U; Linux i686; fr-FR; rv:1.0.1) Gecko/20020823 Netscape/7.0",
			"Mozilla/5.0 (X11; U; Linux i686; de-DE; rv:1.0.1) Gecko/20020823 Netscape/7.0",
			"Mozilla/5.0 (X11; U; Linux i586; fr-FR; rv:1.0.1) Gecko/20020823 Netscape/7.0",
			"Mozilla/5.0 (X11; U; HP-UX 9000/785; es-ES; rv:1.0.1) Gecko/20020827 Netscape/7.0",
			"Mozilla/5.0 (X11; U; AIX 0048013C4C00; en-US; rv:1.0.1) Gecko/20021009 Netscape/7.0",
			"Mozilla/5.0 (Windows; U; WinNT4.0; fr-FR; rv:1.0.1) Gecko/20020823 Netscape/7.0",
			"Mozilla/5.0 (Windows; U; WinNT4.0; en-US; rv:1.0.1) Gecko/20020823 Netscape/7.0",
			"Mozilla/5.0 (Windows; U; WinNT4.0; en-GB; rv:1.0.1) Gecko/20020823 Netscape/7.0",
			"Mozilla/5.0 (Windows; U; WinNT4.0; de-DE; rv:1.0.1) Gecko/20020823 Netscape/7.0",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; fr-FR; rv:1.0.1) Gecko/20020823 Netscape/7.0",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.0.1) Gecko/20020823 Netscape/7.0 (ax)",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.0.1) Gecko/20020823 Netscape/7.0",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; de-DE; rv:1.0.1) Gecko/20020823 Netscape/7.0",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; pt-BR; rv:1.0.1) Gecko/20020823 Netscape/7.0",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; fr-FR; rv:1.0.1) Gecko/20020823 Netscape/7.0",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.0.1) Gecko/20020823 Netscape/7.0",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-GB; rv:1.0.1) Gecko/20020823 Netscape/7.0",
			"Mozilla/5.0 (X11; U; SunOS sun4u; en-US; rv:0.9.4.1) Gecko/20020518 Netscape6/6.2.3",
			"Mozilla/5.0 (X11; U; SunOS sun4u; de-DE; rv:0.9.4.1) Gecko/20020518 Netscape6/6.2.3",
			"Mozilla/5.0 (X11; U; OSF1 alpha; en-US; rv:0.9.4.1) Gecko/20020517 Netscape6/6.2.3",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (X11; U; Linux i686; de-DE; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (Windows; U; WinNT4.0; fr-FR; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (Windows; U; WinNT4.0; en-US; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (Windows; U; WinNT4.0; de-DE; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; ja-JP; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; de-DE; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; it-IT; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-GB; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; de-DE; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (Windows; U; Win98; fr-FR; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (Windows; U; Win98; de-DE; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; de-DE; rv:0.9.4.1) Gecko/20020508 Netscape6/6.2.3",
			"Mozilla/5.0 (X11; U; SunOS sun4u; en-US; rv:0.9.4.1) Gecko/20020406 Netscape6/6.2.2",
			"Mozilla/5.0 (Windows; U; WinNT4.0; en-US; rv:0.9.4.1) Gecko/20020314 Netscape6/6.2.2",
			"Mozilla/5.0 (Windows; U; WinNT4.0; de-DE; rv:0.9.4.1) Gecko/20020314 Netscape6/6.2.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; de-DE; rv:0.9.4.1) Gecko/20020314 Netscape6/6.2.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; fr-FR; rv:0.9.4.1) Gecko/20020314 Netscape6/6.2.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.0.1) Gecko/20020823 Netscape6/6.2.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; de-DE; rv:0.9.4.1) Gecko/20020314 Netscape6/6.2.2",
			"Mozilla/5.0 (Windows; U; Win98; de-DE; rv:0.9.4.1) Gecko/20020314 Netscape6/6.2.2",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; en-US; rv:0.9.4.1) Gecko/20020314 Netscape6/6.2.2",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; de-DE; rv:0.9.4.1) Gecko/20020314 Netscape6/6.2.2",
			"Mozilla/5.0 (Macintosh; U; PPC; en-US; rv:0.9.4.1) Gecko/20020318 Netscape6/6.2.2",
			"Mozilla/5.0 (Macintosh; U; PPC Mac OS X; fr-FR; rv:0.9.4.1) Gecko/20020315 Netscape6/6.2.2",
			"Mozilla/5.0 (Windows; U; WinNT4.0; en-US; rv:0.9.4.1) Gecko/20020314 Netscape6/6.2.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; fr-FR; rv:0.9.4.1) Gecko/20020314 Netscape6/6.2.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:0.9.4.1) Gecko/20020314 Netscape6/6.2.2",
			"Mozilla/5.0 (Windows; U; Win98; de-DE; rv:0.9.4.1) Gecko/20020314 Netscape6/6.2.2",
			"Mozilla/5.0 (X11; U; SunOS sun4u; en-US; rv:0.9.4) Gecko/20011206 Netscape6/6.2.1",
			"Mozilla/5.0 (X11; U; Linux i686; fr-FR; rv:0.9.4) Gecko/20011126 Netscape6/6.2.1",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:0.9.4) Gecko/20011126 Netscape6/6.2.1",
			"Mozilla/5.0 (X11; U; Linux i686; de-DE; rv:0.9.4) Gecko/20011126 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; WinNT4.0; fr-FR; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; WinNT4.0; en-US; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; WinNT4.0; en-CA; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; WinNT4.0; de-DE; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; fr-FR; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; de-DE; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; fr-FR; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; de-DE; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; Win98; fr-FR; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; Win98; en-GB; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; Win98; de-DE; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; fr-FR; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; de-DE; rv:0.9.4) Gecko/20011128 Netscape6/6.2.1",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:0.9.4) Gecko/20011022 Netscape6/6.2",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:0.9.4) Gecko/20011019 Netscape6/6.2",
			"Mozilla/5.0 (Windows; U; WinNT4.0; de-DE; rv:0.9.4) Gecko/20011019 Netscape6/6.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:0.9.4) Gecko/20011019 Netscape6/6.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-GB; rv:0.9.4) Gecko/20011019 Netscape6/6.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; fr-FR; rv:0.9.4) Gecko/20011019 Netscape6/6.2",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:0.9.4) Gecko/20011019 Netscape6/6.2",
			"Mozilla/5.0 (Windows; U; Win98; fr-FR; rv:0.9.4) Gecko/20011019 Netscape6/6.2",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:0.9.4) Gecko/20011019 Netscape6/6.2",
			"Mozilla/5.0 (Windows; U; Win98; de-DE; rv:0.9.4) Gecko/20011019 Netscape6/6.2",
			"Mozilla/5.0 (Windows; U; Win95; en-GB; rv:0.9.4) Gecko/20011019 Netscape6/6.2",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; en-GB; rv:0.9.4) Gecko/20011019 Netscape6/6.2",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; de-DE; rv:0.9.4) Gecko/20011019 Netscape6/6.2",
			"Mozilla/5.0 (Windows; U; WinNT4.0; en-US; rv:0.9.4) Gecko/20011019 Netscape6/6.2",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:0.9.1) Gecko/20010607 Netscape6/6.1b1",
			"Mozilla/5.0 (X11; U; SunOS sun4u; en-US; rv:0.9.2) Gecko/20011002 Netscape6/6.1",
			"Mozilla/5.0 (Windows; U; WinNT4.0; fr-FR; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; fr-FR; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; it-IT; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; fr-FR; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-GB; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; de-DE; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/5.0 (Windows; U; Win98; en-US; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/5.0 (Windows; U; Win95; de-DE; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/5.0 (Windows; U; Win 9x 4.90; de-DE; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/5.0 (Macintosh; U; PPC; de-DE; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/5.0 (X11; U; Linux i686; en-US; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/5.0 (Windows; U; WinNT4.0; de-DE; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/5.0 (Macintosh; U; PPC; en-US; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/5.0 (Macintosh; U; PPC; de-DE; rv:0.9.2) Gecko/20010726 Netscape6/6.1",
			"Mozilla/4.8C-SGI [en] (X11; U; IRIX64 6.5 IP27)",
			"Mozilla/4.8 [pl] (Windows NT 5.1; U)",
			"Mozilla/4.8 [nl] (Windows NT 6.0; U)",
			"Mozilla/4.8 [es] (Windows NT 5.1; U)",
			"Mozilla/4.8 [en] (X11; U; SunOS 5.8 sun4u)",
			"Mozilla/4.8 [en] (X11; U; SunOS 5.8 sun4m; Nav)",
			"Mozilla/4.8 [en] (X11; U; Linux 2.6.12-1.1372_FC3 i686; Nav)",
			"Mozilla/4.8 [en] (X11; U; Linux 2.4.20-4GB-athlon i686)",
			"Mozilla/4.8 [en] (X11; U; IRIX64 6.5 IP27)",
			"Mozilla/4.8 [en] (X11; U; HP-UX B.11.00 9000/785)",
			"Mozilla/4.8 [en] (WinNT; U)",
			"Mozilla/4.8 [en] (Windows NT 6.0; U) Paros/3.2.13",
			"Mozilla/4.8 [en] (Windows NT 6.0; U)",
			"Mozilla/4.8 [en] (Windows NT 6.0; en-US; U)",
			"Mozilla/4.8 [en] (Windows NT 5.1; U)",
			"Mozilla/4.8 [en] (Windows NT 5.0; U)",
			"Mozilla/4.8 [en] (Win98; U)",
			"Mozilla/4.8 [en] (Linux; U)",
			"Mozilla/4.8 [en] (FreeBSD; U)",
			"Mozilla/4.8 [en-US] (Windows NT 6.0; U)",
			"Mozilla/4.8 [de] (X11; U; Linux 2.4.20-4GB i686)",
			"Mozilla/4.79C-SGI [en] (X11; I; IRIX64 6.5 IP30)",
			"Mozilla/4.79C-SGI [en] (X11; I; IRIX64 6.5 IP28)",
			"Mozilla/4.79 [fr] (X11; U; Linux 2.4.18-4 i686)",
			"Mozilla/4.79 [fr] (X11; U; Linux 2.4.18-27.7.xcustom i686)",
			"Mozilla/4.79 [fr] (X11; U; Linux 2.4.18-24.7.xcustom i686)",
			"Mozilla/4.79 [en] (X11; U; SunOS 5.8 sun4u)",
			"Mozilla/4.79 [en] (X11; U; SunOS 5.7 sun4u)",
			"Mozilla/4.79 [en] (X11; U; SunOS 5.6 sun4u)",
			"Mozilla/4.79 [en] (X11; U; SunOS 5.10 i86pc)",
			"Mozilla/4.79 [en] (X11; U; Linux 2.4.21-pre5 i686)",
			"Mozilla/4.79 [en] (X11; U; Linux 2.4.20-4GB i586)",
			"Mozilla/4.79 [en] (X11; U; Linux 2.4.2 i386)",
			"Mozilla/4.79 [en] (X11; U; Linux 2.4.18-5smp i686)",
			"Mozilla/4.79 [en] (X11; U; Linux 2.4.18-5 i686)",
			"Mozilla/4.79 [en] (X11; U; Linux 2.4.18-27.7.xsmp i686)",
			"Mozilla/4.79 [en] (X11; U; Linux 2.4.18-10 i686)",
			"Mozilla/4.79 [en] (X11; U; Linux 2.4.16-4GB-SMP i686)",
			"Mozilla/4.79 [en] (X11; U; Linux 2.2.19-6.2.16 i686)",
			"Mozilla/4.79 [en] (X11; U; Linux 2.2.12-32 i686)",
			"Mozilla/4.79 [en] (WinNT; U)",
			"Mozilla/4.79 [en] (Windows NT 5.0; U)",
			"Mozilla/4.79 [en] (Win98; U)",
			"Mozilla/4.78 [ja] (Windows NT 5.0; U)",
			"Mozilla/4.78 [fr] (X11; U; Linux 2.4.8-26mdk i686)",
			"Mozilla/4.78 [fr] (X11; U; Linux 2.4.7-10.2 i686)",
			"Mozilla/4.78 [fr] (X11; U; Linux 2.4.7-10 i686)",
			"Mozilla/4.78 [fr] (X11; U; Linux 2.4.18-14 i686)",
			"Mozilla/4.78 [fr] (Windows NT 5.0; U)",
			"Mozilla/4.78 [fr] (Win98; U)",
			"Mozilla/4.78 [fr] (Win95; U)",
			"Mozilla/4.78 [es] (Windows NT 5.0; U)",
			"Mozilla/4.78 [es] (Win98; U)",
			"Mozilla/4.78 [en] (X11; U; SunOS 5.9 sun4u)",
			"Mozilla/4.78 [en] (X11; U; SunOS 5.8 sun4u; Nav)",
			"Mozilla/4.78 [en] (X11; U; SunOS 5.8 sun4u)",
			"Mozilla/4.78 [en] (X11; U; SunOS 5.7 sun4u)",
			"Mozilla/4.78 [en] (X11; U; Linux 2.4.9-34smp i686)",
			"Mozilla/4.78 [en] (X11; U; Linux 2.4.9-21 i686)",
			"Mozilla/4.78 [en] (X11; U; Linux 2.4.7-10 i686)",
			"Mozilla/4.78 [en] (X11; U; Linux 2.4.20-18.7 i686)",
			"Mozilla/4.78 [en] (X11; U; Linux 2.4.20 i686; Nav)",
			"Mozilla/4.78 [en] (X11; U; Linux 2.4.2 i386)",
			"Mozilla/4.77C-SGI [en] (X11; I; IRIX64 6.5 IP30)",
			"Mozilla/4.77C-SGI [en] (X11; I; IRIX64 6.5 IP30)",
			"Mozilla/4.77 [fr] (X11; U; Linux 2.4.9-34 i686)",
			"Mozilla/4.77 [fr] (X11; U; Linux 2.4.4-4GB i686)",
			"Mozilla/4.77 [fr] (X11; U; Linux 2.4.3-20mdk i686)",
			"Mozilla/4.77 [fr] (X11; U; Linux 2.4.17 i686; Nav)",
			"Mozilla/4.77 [en] (X11; U; SunOS 5.8 sun4u)",
			"Mozilla/4.77 [en] (X11; U; SunOS 5.7 sun4u)",
			"Mozilla/4.77 [en] (X11; U; Linux 2.4.9-a22m i686)",
			"Mozilla/4.77 [en] (X11; U; Linux 2.4.20-bf2.4 i686)",
			"Mozilla/4.77 [en] (X11; U; Linux 2.4.2-2 i686)",
			"Mozilla/4.77 [en] (X11; U; Linux 2.4.19-acheron i686; Nav)",
			"Mozilla/4.77 [en] (X11; U; Linux 2.4.19 i686; Nav)",
			"Mozilla/4.77 [en] (X11; U; Linux 2.4.18-386 i686)",
			"Mozilla/4.77 [en] (X11; U; Linux 2.4.18-27.7.x i686)",
			"Mozilla/4.77 [en] (X11; U; Linux 2.4.17-lsm i686)",
			"Mozilla/4.77 [en] (X11; U; Linux 2.2.17 i586)",
			"Mozilla/4.77 [en] (X11; U; Linux 2.2.14 i686)",
			"Mozilla/4.77 [en] (X11; U; HP-UX B.11.00 9000/800)",
			"Mozilla/4.77 [en] (WinNT; U)",
			"Mozilla/4.77 [en] (Windows NT 5.0; U)",
			"Mozilla/4.77 [en] (Win98; U)",
			"Mozilla/4.76C-SGI [en] (X11; I; IRIX64 6.5 IP30)",
			"Mozilla/4.76C-SGI [en] (X11; I; IRIX 6.5 IP32)",
			"Mozilla/4.76 [fr] (X11; U; Linux 2.4.2-2 i686)",
			"Mozilla/4.76 [en] (X11; U; SunOS 5.8 sun4u; Nav)",
			"Mozilla/4.76 [en] (X11; U; SunOS 5.8 sun4u)",
			"Mozilla/4.76 [en] (X11; U; SunOS 5.8 i86pc)",
			"Mozilla/4.76 [en] (X11; U; Linux 2.4.9-34 i686)",
			"Mozilla/4.76 [en] (X11; U; Linux 2.4.5 i686)",
			"Mozilla/4.76 [en] (X11; U; Linux 2.4.20 i686)",
			"Mozilla/4.76 [en] (X11; U; Linux 2.4.18p3 i686)",
			"Mozilla/4.76 [en] (X11; U; Linux 2.4.0 i686)",
			"Mozilla/4.76 [en] (X11; U; Linux 2.2.19pre17 i686)",
			"Mozilla/4.76 [en] (X11; U; Linux 2.2.16-22 i686)",
			"Mozilla/4.76 [en] (X11; U; Linux 2.2.16 i686)",
			"Mozilla/4.76 [en] (X11; U; HP-UX B.10.20 9000/782)",
			"Mozilla/4.76 [en] (WinNT; U)",
			"Mozilla/4.76 [en] (Win98; U)",
			"Mozilla/4.76 [en] (Win95; U)",
			"Mozilla/4.76 [de] (X11; U; Linux 2.4.4-4GB i686; Nav)",
			"Mozilla/4.76 [de] (X11; U; Linux 2.4.0-4GB i686)",
			"Mozilla/4.76 [de] (X11; U; Linux 2.2.18 i686)",
			"Mozilla/4.76 (X11; U; Linux 2.4.10-4GB i686)",
			"Mozilla/4.75 [pl] (X11; U; Linux 2.2.17-21mdk i686)",
			"Mozilla/4.75 [fr] (X11; U; Linux 2.2.16-3smp i686)",
			"Mozilla/4.75 [fr] (X11; U; Linux 2.2.16-22 i686)",
			"Mozilla/4.75 [fr] (WinNT; U)",
			"Mozilla/4.75 [fr] (Windows NT 5.0; U)",
			"Mozilla/4.75 [fr] (Win98; U)",
			"Mozilla/4.75 [fr] (Win95; U)",
			"Mozilla/4.75 [en] (X11; U; SunOS 5.8 sun4u)",
			"Mozilla/4.75 [en] (X11; U; SunOS 5.7 sun4u)",
			"Mozilla/4.75 [en] (X11; U; SunOS 5.6 sun4u)",
			"Mozilla/4.75 [en] (X11; U; OpenBSD 2.8 i386)",
			"Mozilla/4.75 [en] (X11; U; Linux 2.2.16-3 i686)",
			"Mozilla/4.75 [en] (X11; U; Linux 2.2.12-20 i586)",
			"Mozilla/4.75 [en] (WinNT; U)",
			"Mozilla/4.75 [en] (Windows NT 5.0; U)",
			"Mozilla/4.75 [en] (Win98; U)",
			"Mozilla/4.75 [en] (Win95; U)",
			"Mozilla/4.75 [de] (WinNT; U)",
			"Mozilla/4.75 [de] (Windows NT 5.0; U)",
			"Mozilla/4.75 [de] (Win98; U)",
			"Mozilla/4.74 [en] (X11; U; Linux 2.2.16 i686)",
			"Mozilla/4.74 [en] (WinNT; U)",
			"Mozilla/4.74 [en] (Windows NT 5.0; U)",
			"Mozilla/4.74 [en] (Win98; U)",
			"Mozilla/4.74 [en] (Win95; U)",
			"Mozilla/4.74 [de] (X11; U; Linux 2.2.16 i686)",
			"Mozilla/4.74 [de] (X11; U; Linux 2.2.16 i586)",
			"Mozilla/4.74 (Macintosh; U; PPC)",
			"Mozilla/4.74 (Macintosh; U; PPC)",
			"Mozilla/4.73 [en] (X11; U; SunOS 5.8 sun4u)",
			"Mozilla/4.73 [en] (X11; I; HP-UX B.10.20 9000/879)",
			"Mozilla/4.73 [en] (WinNT; U)",
			"Mozilla/4.73 [en] (WinNT; I)",
			"Mozilla/4.73 [en] (Windows NT 5.0; U)",
			"Mozilla/4.73 [en] (Windows NT 5.0; I)",
			"Mozilla/4.73 [en] (Win98; U)",
			"Mozilla/4.73 [en] (Win98; I)",
			"Mozilla/4.73 [en] (Win95; U)",
			"Mozilla/4.73 [en] (Win95; I)",
			"Mozilla/4.73 [de] (WinNT; U)",
			"Mozilla/4.73 [de] (Windows NT 5.0; U)",
			"Mozilla/4.73 [de] (Win98; U)",
			"Mozilla/4.73 [de] (Win95; U)",
			"Mozilla/4.73 (Macintosh; U; PPC)",
			"Mozilla/4.73 (Macintosh; I; PPC)",
			"Mozilla/4.73 [en] (Win95; I)",
			"Mozilla/4.73 [de] (Win98; U)",
			"Mozilla/4.72 [fr] (X11; U; Linux 2.2.14-5.0 i686)",
			"Mozilla/4.72 [en] (X11; U; Linux 2.2.20 i586; Nav)",
			"Mozilla/4.72 [en] (X11; U; Linux 2.2.14-5.0 i686)",
			"Mozilla/4.72 [en] (X11; I; SunOS 5.7 sun4m)",
			"Mozilla/4.72 [en] (X11; I; Linux 2.2.14 i686)",
			"Mozilla/4.72 [en] (X11; I; Linux 2.2.14 i586)",
			"Mozilla/4.72 [en] (X11; I; Linux 2.2.13 i586)",
			"Mozilla/4.72 [en] (X11; I; HP-UX B.11.00 9000/800)",
			"Mozilla/4.72 [en] (WinNT; U)",
			"Mozilla/4.72 [en] (WinNT; I)",
			"Mozilla/4.72 [en] (Windows NT 5.0; U)",
			"Mozilla/4.72 [en] (Windows NT 5.0; I)",
			"Mozilla/4.72 [en] (Win98;I)",
			"Mozilla/4.72 [en] (Win98; U)",
			"Mozilla/4.72 [en] (Win98; I)",
			"Mozilla/4.72 [en] (Win95; I)",
			"Mozilla/4.72 [de] (WinNT; U)",
			"Mozilla/4.72 [de] (Windows NT 5.0; U)",
			"Mozilla/4.72 [de] (Win95; U)",
			"Mozilla/4.72 (Macintosh; U; PPC)",
			"Mozilla/4.71 [en] (X11; U; Linux 2.0.36 i586)",
			"Mozilla/4.71 [en] (WinNT; I)",
			"Mozilla/4.71 [en] (Win98; I)",
			"Mozilla/4.7C-SGI [en] (X11; I; IRIX 6.5 IP32)",
			"Mozilla/4.7 [fr] (WinNT; I)",
			"Mozilla/4.7 [fr] (Win98; U)",
			"Mozilla/4.7 [fr] (Win98; I)",
			"Mozilla/4.7 [fr] (Win95; I)",
			"Mozilla/4.7 [en] (X11; U; SunOS 5.6 sun4u)",
			"Mozilla/4.7 [en] (X11; I; SunOS 5.8 sun4u)",
			"Mozilla/4.7 [en] (X11; I; SunOS 5.7 sun4u)",
			"Mozilla/4.7 [en] (X11; I; SunOS 5.6 sun4u)",
			"Mozilla/4.7 [en] (X11; I; Linux 2.2.13 i686; Nav)",
			"Mozilla/4.7 [en] (X11; I; Linux 2.2.13 i586)",
			"Mozilla/4.7 [en] (X11; I; Linux 2.2.12 i686; Nav)",
			"Mozilla/4.7 [en] (WinNT; U)",
			"Mozilla/4.7 [en] (WinNT; I)",
			"Mozilla/4.7 [en] (Windows NT 6.0; U)",
			"Mozilla/4.7 [en] (Win98; I)",
			"Mozilla/4.7 [en] (Win95; I)",
			"Mozilla/4.7 [en-gb] (WinNT; U)",
			"Mozilla/4.7 [en-gb] (WinNT; I)",
			"Mozilla/4.7 [en-gb] (Win98; U)",
			"Mozilla/4.7 [de] (WinNT; U)",
			"Mozilla/4.61 [ja] (X11; I; Linux 2.6.13-33cmc1 i686)",
			"Mozilla/4.61 [fi] (OS/2; I)",
			"Mozilla/4.61 [en] (X11; I; SunOS 5.6 sun4u)",
			"Mozilla/4.61 [en] (X11; I; Linux 2.2.12-20 i686; Nav)",
			"Mozilla/4.61 [en] (WinNT; I)",
			"Mozilla/4.61 [en] (Win98; I)",
			"Mozilla/4.61 [en] (Win95; I)",
			"Mozilla/4.61 [en] (OS/2; U)",
			"Mozilla/4.61 [en] (OS/2; I)",
			"Mozilla/4.61 [de] (OS/2; U)",
			"Mozilla/4.61 [de] (OS/2; I)",
			"Mozilla/4.61 (Macintosh; I; PPC)",
			"Mozilla/4.6 [fr] (WinNT; I)",
			"Mozilla/4.6 [fr] (Win95; I)",
			"Mozilla/4.6 [en] (X11; U; SunOS 5.8 sun4u)",
			"Mozilla/4.6 [en] (X11; I; SunOS 5.8 sun4u)",
			"Mozilla/4.6 [en] (X11; I; SunOS 5.5.1 sun4u; Nav)",
			"Mozilla/4.6 [en] (WinNT; I)",
			"Mozilla/4.6 [en] (Win98; I)",
			"Mozilla/4.6 [en] (Win95; I)",
			"Mozilla/4.6 [de] (WinNT; I)",
			"Mozilla/4.6 [de] (Win98; I)",
			"Mozilla/4.6 [de] (Win95; I)",
			"Mozilla/4.6 (Macintosh; U; PPC)",
			"Mozilla/4.6 (Macintosh; I; PPC)",
			"Mozilla/4.6 [de] (Win98; I)",
			"Mozilla/4.51 [it] (Win98; U)",
			"Mozilla/4.51 [fr] (Win95; I)",
			"Mozilla/4.51 [en] (X11; I; Linux 2.2.7 i686)",
			"Mozilla/4.51 [en] (X11; I; Linux 2.2.5 i686)",
			"Mozilla/4.51 [en] (WinNT; I)",
			"Mozilla/4.51 [en] (Win98; U)",
			"Mozilla/4.51 [en] (Win95; I)",
			"Mozilla/4.51 [de] (WinNT; I)",
			"Mozilla/4.51 [de] (Win98; I)",
			"Mozilla/4.51 [de] (Win95; I)",
			"Mozilla/4.51 (Macintosh; I; PPC)",
			"Mozilla/4.51 [de] (WinNT; I)",
			"Mozilla/4.5 [it] (Win98; I)",
			"Mozilla/4.5 [fr] (Win98; I)",
			"Mozilla/4.5 [fr] (Win95; I)",
			"Mozilla/4.5 [fr] (Macintosh; U; PPC)",
			"Mozilla/4.5 [fr] (Macintosh; I; PPC)",
			"Mozilla/4.5 [es] (Win98; I)",
			"Mozilla/4.5 [en] (X11; I; SunOS 5.8 sun4u)",
			"Mozilla/4.5 [en] (X11; I; SunOS 5.7 sun4u)",
			"Mozilla/4.5 [en] (X11; I; SunOS 5.6 sun4u)",
			"Mozilla/4.5 [en] (X11; I; Linux 2.2.16 i586)",
			"Mozilla/4.5 [en] (WinNT; U)",
			"Mozilla/4.5 [en] (Win98; I)",
			"Mozilla/4.5 [en] (Win95; I)",
			"Mozilla/4.5 [de] (WinNT; I)",
			"Mozilla/4.5 [de] (Win98; I)",
			"Mozilla/4.5 [de] (Macintosh; I; PPC)",
			"Mozilla/4.5 (Macintosh; U; PPC)",
			"Mozilla/4.5 [fr] (Macintosh; U; PPC)",
			"Mozilla/4.5 [en] (WinNT; I)",
			"Mozilla/4.41  (BEOS; U ;Nav)",
			"Mozilla/4.08 [en] (WinNT; U ;Nav)",
			"Mozilla/4.08 [en] (WinNT; I ;Nav)",
			"Mozilla/4.08 [en] (Win98; I ;Nav)",
			"Mozilla/4.08 [en] (Win95; I ;Nav)",
			"Mozilla/4.08 (Macintosh; I; PPC, Nav)",
			"Mozilla/4.08 [de] (WinNT; I)",
			"Mozilla/4.07 [en] (X11; I; Linux 2.0.36 i586)",
			"Mozilla/4.07 [en] (WinNT; U ;Nav)",
			"Mozilla/4.07 [en] (WinNT; I)",
			"Mozilla/4.07 [de] (Win98; I)",
			"Mozilla/4.07 [de] (Win95; I)",
			"Mozilla/4.07 [fr] (Win95; I)",
			"Mozilla/4.07 [en] (X11; I; Linux 2.0.36 i586)",
			"Mozilla/4.07 [en] (WinNT; U ;Nav)",
			"Mozilla/4.06 [hu] (Win98; I)",
			"Mozilla/4.06 [en] (X11; U; Linux 2.0.27 i586)",
			"Mozilla/4.06 [en] (X11; I; Linux 2.0.35 i686)",
			"Mozilla/4.06 [en] (WinNT; I)",
			"Mozilla/4.06 [en] (WinNT; I ;Nav)",
			"Mozilla/4.06 [de] (WinNT; I)",
			"Mozilla/4.06 [de] (Win98; I)",
			"Mozilla/4.06 (Win95; I)",
			"Mozilla/4.06 (Win95; I)",
			"Mozilla/4.05 [en] (X11; I; Linux 2.0.33 i586)",
			"Mozilla/4.05 [en] (Win95; I)",
			"Mozilla/4.05 [de] (Win95; I)",
			"Mozilla/4.04 [fr] (Macintosh; I; PPC, Nav)",
			"Mozilla/4.04 [en] (X11; I; IRIX 5.3 IP22)",
			"Mozilla/4.04 [en] (WinNT; U)",
			"Mozilla/4.04 [en] (WinNT; I)",
			"Mozilla/4.04 [en] (Win95; I ;Nav)",
			"Mozilla/4.04 [de] (WinNT; I ;Nav)",
			"Mozilla/4.04 [en] (Win95; I ;Nav)",
			"Mozilla/4.03 [fr] (Win95; U)",
			"Mozilla/4.03 [fr] (Win95; U)",
			"Mozilla/4.01 [en] (Win95; I)",
			"Mozilla/4.01 [de] (WinNT; I)",
			"Mozilla/4.0 (compatible; Windows NT 5.1; U; en)",
			"Mozilla/4.0 (compatible; Mozilla/5.0 ; Linux i686)",
			"Mozilla/3.04Gold (WinNT; U)",
			"Mozilla/3.04Gold (Macintosh; I; PPC)",
			"Mozilla/3.04 (WinNT; I)",
			"Mozilla/3.02 [en] (Windows NT 5.1; U)",
			"Mozilla/3.01Gold (X11; I; SunOS 5.5.1 sun4m)",
			"Mozilla/3.01Gold (Macintosh; I; 68K)",
			"Mozilla/3.01 [de] (Win95; I)",
			"Mozilla/3.01 (Macintosh; U; PPC)",
			"Mozilla/3.0 (X11; I; AIX 2)",
			"Mozilla/3.0 (Win95; I)",
			"Mozilla/3.0 (Macintosh; U; PPC Mac OS X; pl-PL)",
			"Mozilla/3.0 (Macintosh; I; PPC)",
			"Mozilla/3.0 (Macintosh; I; 68K)",
			"Mozilla/2.02Gold (Win95; I)",
			"Mozilla/2.02 [fr] (WinNT; I)"
		};
		return userAgentStrings;
	}
}