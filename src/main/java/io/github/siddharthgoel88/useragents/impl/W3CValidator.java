package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * UserAgents from latest to oldest for W3CValidator
 */
public class W3CValidator extends UserAgent {	
	
	public String[] getAllUserAgentStrings() {
		String [] userAgentStrings = {
			"W3C_Validator/1.654",
			"W3C_Validator/1.606",
			"W3C_Validator/1.591",
			"W3C_Validator/1.575",
			"W3C_Validator/1.555",
			"W3C_Validator/1.432.2.5",
			"W3C_Validator/1.432.2.22",
			"W3C_Validator/1.432.2.19",
			"W3C_Validator/1.432.2.10",
			"W3C_Validator/1.305.2.12 libwww-perl/5.64"
		};
		return userAgentStrings;
	}
}