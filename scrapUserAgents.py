from bs4 import BeautifulSoup
import lxml
import urllib2
from subprocess import call
import re
from time import sleep
from random import randint
import os
from retry import retry

rootdir = "./src/main/java/io/github/siddharthgoel88/useragents/impl/"

#Change a name to camel case
def camelCase(name):
	name = name.title().replace("_", "")
	#Hardcoding a corner case of name
	if (name == "008"):
		name = "Crawler008"
	return re.sub(r'\W+', '', name)

#Extract user-agent string for the url
def extractUserAgentStrings(url):
	filePointer = urlopen_with_retry(url)
	subPage = filePointer.read()
	soup = BeautifulSoup(subPage, 'lxml')
	userAgentObjs = soup('li')
	if (len(userAgentObjs) == 0):
		return ''
	result = ''
	for obj in userAgentObjs[:-1]:
		result = result + '\t\t\t"' + obj.getText().strip().replace("\\", "\\\\") + '",\n'
	else:
		result = result + '\t\t\t"' + userAgentObjs[-1].getText().strip().replace("\\", "\\\\") + '"'
	return result

#Java code generation logic
def generateJavaFile(url, clazz):
	code =	"""package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * This is an auto-generated class. Please do
 * not modify the class manually.
 */
public class """ + clazz  + """ extends UserAgent {	
	
	public String[] getUserAgentStrings() {
		String [] userAgentStrings = {
""" + extractUserAgentStrings(url) + """
		};
		return userAgentStrings;
	}
}"""
	uaGetter = """

	public static UserAgent get""" + clazz + """() {
		return new """ + clazz + """();
	}
"""
	return code, uaGetter

#Iterate over all the items under a category
def getAllItemsInCategory(category):
	global rootdir
	nextItem = category.find_next_sibling('a')
	if (nextItem.get('class')[0] == 'unterMenuTitel'):
		return
	categorydir = rootdir
	opendir(categorydir)
	print nextItem.getText()
	allUaGetters = ''
	while True:
		if (nextItem is None):
			break
		elif (nextItem.get('class')[0] == 'unterMenuName'):
			url = "http://www.useragentstring.com/" + nextItem['href']
			print nextItem.getText()
			itemname = camelCase(nextItem.getText())
			itemfilename = categorydir + "/" + itemname + ".java"
			if os.path.isfile(itemfilename):
				print "Seems " + itemfilename + " is already downloaded. Skipping it."
				nextItem = nextItem.find_next_sibling('a')
				continue
			generatedFile, uaGetter = generateJavaFile(url, itemname)
			allUaGetters = allUaGetters + uaGetter
			print generatedFile
			f = open(itemfilename, 'w')
			f.write(generatedFile)
			f.close()
		elif (nextItem.get('class')[0] == 'unterMenuTitel'):
			break
		nextItem = nextItem.find_next_sibling('a')
		sleep(1)
	return allUaGetters

#Convenience function to create a directory
def opendir(directory):
	if not os.path.exists(directory):
		print "Creating a new directory: " + directory
		os.makedirs(directory)


#Retrying to download the webpage with 5 seconds of timeout
@retry(Exception , tries=20, delay=1, backoff=1)
def urlopen_with_retry(url):
    return urllib2.urlopen(url, timeout=5)

def xstr(s):
	if s == 'None':
		return ''
    	return str(s)

#Creates a Factory class to return all the browsers, crawlers, etc
#to get their user-agent.
def createMotherOfAllUAFile(getters):
	filename = rootdir + "/Feku.java"
	f = open(filename, 'w')
	content = """
package io.github.siddharthgoel88.useragents.impl;

import io.github.siddharthgoel88.useragents.UserAgent;

/**
 * This is an auto-generated class. Please do
 * not modify the class manually.
 *
 */
public class Feku {
""" + xstr(getters) + """
}"""
	f.write(content)
	f.close()

def main():
	mainUrl = 'http://www.useragentstring.com/pages/useragentstring.php'
	filePointer = urlopen_with_retry(mainUrl)
	page = filePointer.read()
	soup = BeautifulSoup(page, 'lxml')
	categories = soup.findAll("a", { "class" : "unterMenuTitel" })
	opendir(rootdir)
	allCategoryUaGetters = ''
	for category in categories:
		print "Category Name : " + category.getText()
		categoryUaGetters = str(getAllItemsInCategory(category))
		print categoryUaGetters
		allCategoryUaGetters = allCategoryUaGetters + categoryUaGetters
	createMotherOfAllUAFile(allCategoryUaGetters)

if __name__ == '__main__':
	main()

