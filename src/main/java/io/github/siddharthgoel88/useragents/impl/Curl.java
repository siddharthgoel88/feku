package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for Curl
 */
public class Curl extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"curl/7.9.8 (i686-pc-linux-gnu) libcurl 7.9.8 (OpenSSL 0.9.6b) (ipv6 enabled)",
			"curl/7.8 (i386-redhat-linux-gnu) libcurl 7.8 (OpenSSL 0.9.6b) (ipv6 enabled)",
			"curl/7.7.x (i386--freebsd4.3) libcurl 7.7.x (SSL 0.9.6) (ipv6 enabled)",
			"curl/7.7.2 (powerpc-apple-darwin6.0) libcurl 7.7.2 (OpenSSL 0.9.6b)",
			"curl/7.21.4 (universal-apple-darwin11.0) libcurl/7.21.4 OpenSSL/0.9.8r zlib/1.2.5",
			"curl/7.21.3 (x86_64-unknown-linux-gnu) libcurl/7.21.3 OpenSSL/1.0.0c zlib/1.2.5",
			"curl/7.21.3 (x86_64-redhat-linux-gnu) libcurl/7.21.3 NSS/3.13.1.0 zlib/1.2.5 libidn/1.19 libssh2/1.2.7",
			"curl/7.21.2 (i386-pc-win32) libcurl/7.21.2 OpenSSL/0.9.8o zlib/1.2.5",
			"curl/7.21.1 (i686-pc-linux-gnu) libcurl/7.21.1 OpenSSL/1.0.0a zlib/1.2.5",
			"curl/7.21.0 (x86_64-pc-linux-gnu) libcurl/7.21.0 OpenSSL/0.9.8o zlib/1.2.3.4 libidn/1.18 libssh2/1.2.5",
			"curl/7.21.0 (x86_64-pc-linux-gnu) libcurl/7.21.0 OpenSSL/0.9.8o zlib/1.2.3.4 libidn/1.18",
			"curl/7.21.0 (x86_64-pc-linux-gnu) libcurl/7.21.0 OpenSSL/0.9.8o zlib/1.2.3.4 libidn/1.15 libssh2/1.2.5",
			"curl/7.21.0 (x86_64-apple-darwin10.2.0) libcurl/7.21.0 OpenSSL/1.0.0a zlib/1.2.5 libidn/1.19",
			"curl/7.21.0 (i686-pc-linux-gnu) libcurl/7.21.0 OpenSSL/0.9.8o zlib/1.2.3.4 libidn/1.18",
			"curl/7.21.0 (i486-pc-linux-gnu) libcurl/7.21.0 OpenSSL/0.9.8o zlib/1.2.3.4 libidn/1.18 libssh2/1.2.6",
			"curl/7.20.0 (i686-pc-linux-gnu) libcurl/7.20.0 OpenSSL/0.9.8n zlib/1.2.4",
			"curl/7.20.0 (i386-apple-darwin9.8.0) libcurl/7.20.0 OpenSSL/0.9.8m zlib/1.2.3 libidn/1.16",
			"curl/7.19.7 (x86_64-redhat-linux-gnu) libcurl/7.35.0 OpenSSL/1.0.1e zlib/1.2.3 libidn/1.18 libssh2/1.4.3",
			"curl/7.19.7 (universal-apple-darwin10.0) libcurl/7.19.7 OpenSSL/0.9.8l zlib/1.2.3",
			"curl/7.19.7 (i486-pc-linux-gnu) libcurl/7.19.7 OpenSSL/0.9.8o zlib/1.2.3.3 libidn/1.15",
			"curl/7.19.7 (i486-pc-linux-gnu) libcurl/7.19.7 OpenSSL/0.9.8k zlib/1.2.3.3 libidn/1.15",
			"curl/7.19.7 (i386-redhat-linux-gnu) libcurl/7.19.7 NSS/3.12.5.0 zlib/1.2.3 libidn/1.9 libssh2/1.2.2",
			"curl/7.19.7 (i386-apple-darwin9.8.0) libcurl/7.19.7 zlib/1.2.3",
			"curl/7.19.6 (i686-pc-cygwin) libcurl/7.19.6 OpenSSL/0.9.8n zlib/1.2.3 libidn/1.18 libssh2/1.2",
			"curl/7.19.6 (i386-redhat-linux-gnu) libcurl/7.19.6 NSS/3.12.4.5 zlib/1.2.3 libidn/1.9 libssh2/1.2",
			"curl/7.19.6 (i386-pc-win32) libcurl/7.19.6 OpenSSL/0.9.8k zlib/1.2.3",
			"curl/7.19.5 (i586-pc-mingw32msvc) libcurl/7.19.5 zlib/1.2.3",
			"curl/7.19.5 (i486-pc-linux-gnu) libcurl/7.19.5 OpenSSL/0.9.8g zlib/1.2.3.3 libidn/1.15",
			"curl/7.19.4 (universal-apple-darwin10.0) libcurl/7.19.4 OpenSSL/0.9.8k zlib/1.2.3",
			"curl/7.19.4 (i686-pc-cygwin) libcurl/7.19.4 OpenSSL/0.9.8k zlib/1.2.3 libidn/1.9 libssh2/1.0",
			"curl/7.19.2 (i386-pc-win32) libcurl/7.19.2 OpenSSL/0.9.8i zlib/1.2.3 libidn/1.11 libssh2/0.18",
			"curl/7.19.2 (i386-pc-win32) libcurl/7.19.2 OpenSSL/0.9.8c zlib/1.2.3",
			"curl/7.19.0 (x86_64-suse-linux-gnu) libcurl/7.19.0 OpenSSL/0.9.8h zlib/1.2.3 libidn/1.10",
			"curl/7.18.2 (x86_64-pc-linux-gnu) libcurl/7.18.2 OpenSSL/0.9.8g zlib/1.2.3.3 libidn/1.8 libssh2/0.18",
			"curl/7.18.1 (i686-suse-linux-gnu) libcurl/7.18.1 OpenSSL/0.9.8g zlib/1.2.3 libidn/1.8",
			"curl/7.18.0 (x86_64-pc-linux-gnu) libcurl/7.18.0 OpenSSL/0.9.8g zlib/1.2.3.3 libidn/1.1",
			"curl/7.17.1 (x86_64-pc-linux-gnu) libcurl/7.17.1 OpenSSL/0.9.8g zlib/1.2.3",
			"curl/7.16.4 (i486-pc-linux-gnu) libcurl/7.16.4 OpenSSL/0.9.8e zlib/1.2.3.3 libidn/1.0",
			"curl/7.16.3 (powerpc-apple-darwin8.0) libcurl/7.16.3 OpenSSL/0.9.7l zlib/1.2.3",
			"curl/7.16.2 (x86_64-redhat-linux-gnu) libcurl/7.16.2 OpenSSL/0.9.8b zlib/1.2.3 libidn/0.6.8",
			"curl/7.16.1 (i386-pc-win32) libcurl/7.16.1 OpenSSL/0.9.8h zlib/1.2.3",
			"curl/7.15.5 (x86_64-redhat-linux-gnu) libcurl/7.15.5 OpenSSL/0.9.8b zlib/1.2.3 libidn/0.6.5",
			"curl/7.15.4 (i686-pc-linux-gnu) libcurl/7.15.4 OpenSSL/0.9.7e zlib/1.2.3",
			"curl/7.15.3 (sparc64--netbsd) libcurl/7.15.3 OpenSSL/0.9.7d zlib/1.1.4 libidn/0.6.3",
			"curl/7.15.1 (x86_64-suse-linux) libcurl/7.15.1 OpenSSL/0.9.8a zlib/1.2.3 libidn/0.6.0",
			"curl/7.15.1 (i486-pc-linux-gnu) libcurl/7.15.1 OpenSSL/0.9.8a zlib/1.2.3 libidn/0.5.18",
			"curl/7.15.0 (i386-portbld-freebsd5.4) libcurl/7.15.0 OpenSSL/0.9.7e zlib/1.2.1",
			"curl/7.14.0 (i386-portbld-freebsd5.4) libcurl/7.14.0 OpenSSL/0.9.7e zlib/1.2.1",
			"curl/7.13.2 (i386-pc-linux-gnu) libcurl/7.13.2 OpenSSL/0.9.7e zlib/1.2.2 libidn/0.5.13",
			"cURL: curl/7.13.1 (powerpc-apple-darwin8.0) libcurl/7.13.1 OpenSSL/0.9.7b zlib/1.2.2",
			"curl/7.13.1 (powerpc-apple-darwin8.0) libcurl/7.13.1 OpenSSL/0.9.7l zlib/1.2.3",
			"curl/7.12.1 (i686-redhat-linux-gnu) libcurl/7.12.1 OpenSSL/0.9.7a zlib/1.2.1.2 libidn/0.5.6",
			"curl/7.11.1 (i686-redhat-linux-gnu) libcurl/7.11.1 OpenSSL/0.9.7a ipv6 zlib/1.2.1.2",
			"curl/7.11.1 (i386-redhat-linux-gnu) libcurl/7.11.1 OpenSSL/0.9.7a ipv6 zlib/1.2.1.2",
			"curl/7.10.6 (i386-redhat-linux-gnu) libcurl/7.10.6 OpenSSL/0.9.7a ipv6 zlib/1.1.4"
		};
		return userAgentStrings;
	}
}