package io.github.siddharthgoel88.useragents;

import java.util.Random;

/**
 * An abstract class which needs to be extended by 
 * all the software components for which Feku will 
 * be returning the user agent. The java code for 
 * all these software components is auto-generated.
 *
 */
public abstract class UserAgent {
	
	public UserAgent() {
		userAgentStrings = getAllUserAgentStrings();
		numberOfUserAgentStrings = userAgentStrings.length;
		generator = new Random();
	}
	
	private String userAgentStrings[];
	private int numberOfUserAgentStrings;
	private Random generator; 
	
	/**
	 * Returns the complete list of user agent strings
	 * of a software component.
	 * 
	 * @return list of user agent strings
	 */
	protected abstract String[] getAllUserAgentStrings();
	
	/**
	 * Returns the user agent which was latest when 
	 * this version of Feku was released.
	 * 
	 * @return latest user agent
	 */
	public String getLatestUserAgent() {
		return userAgentStrings[0];
	}
	
	/**
	 * Returns any random user agent among the list of
	 * user agents.
	 * 
	 * @return a random user agent
	 */
	public String getRandomUserAgent() {
		int randomNumber = generator.
				nextInt(numberOfUserAgentStrings);
		return userAgentStrings[randomNumber];
	}
	
	/**
	 * A convenience API for getting user agent string. 
	 * Currently it returns the latest user agent.
	 * 
	 * @return returns the latest user-agent
	 */
	public String getUserAgent() {
		return getLatestUserAgent();
	}
	
}
