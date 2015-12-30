# Feku [![Build Status](https://travis-ci.org/siddharthgoel88/feku.svg?branch=master)](https://travis-ci.org/siddharthgoel88/feku)

### Introduction
Feku is simple and tiny java utility library which can provide you an exhausitve list of user-agents of following software components:-
  - Browsers (Desktop, Mobile & offline)
  - Cloud platforms
  - Consoles
  - Crawlers
  - Email clients
  - Email collectors
  - Feed readers
  - Libraries
  - Link checkers
  - Validators
  - Others

The initial data of useragents is taken from http://www.useragentstring.com/ .

### Maven co-ordinates
```xml
<dependency>
  <groupId>io.github.siddharthgoel88</groupId>
  <artifactId>feku</artifactId>
  <version>1.0.0</version>
</dependency>
```

### How to use it
This one is going to be easy peasy. Examples :-
```java
//Returns a random user agent string of Chrome
Feku.getChrome().getRandomUserAgent();
//Returns the latest user agent string of Firefox
Feku.getFirefox().getLatestUserAgent();
//Returns an array of all useragent strings of wget
Feku.getWget().getAllUserAgentStrings();
```

### Contribution
One can follow the current style of coding in the repository and send pull requests for adding new user agents for existing components or adding new components altogether. For suggestions of adding some new API or change of design please start a discussion thread in [issues](https://github.com/siddharthgoel88/feku/issues).

### License
MIT
