# Xalan for Java 11

This is Xalan (xalan-j_2_7_1_maint):

1. converted to a maven multi module project; 
2. https://issues.apache.org/jira/browse/XALANJ-2540 path applied 
3. repackaged in docx4j namespace

### Note re IncrementalSAXSource_Xerces

I moved IncrementalSAXSource_Xerces so that Xerces is not required (except for the Java 8 org.w3c.dom.xpath issue). 

This was to solve "javax.xml coming from 2 modules
	The package org.w3c.dom is accessible from more than one module: java.xml, xercesImpl" under Java 8
	
IncrementalSAXSource_Xerces is in a (currently unused) module xalan-interpretive-xerces


## Build

Using Java 12 (on arch or manjaro, that would be `sudo archlinux-java set java-12-openjdk`) and a recent mvn:

```
mvn clean
mvn install
```

## Maven Modules

* xalan-serializer
* (there is no module xalan-core containing org.apache.xml, since it depends on xpath.NodeList)
* xalan-interpretive (including xpath)
* xalan-interpretive-xerces (currently not used)
* xalan-xsltc (including java_cup.runtime)
* xalan-bundled-jar (builds a shaded jar containing serializer, interpreter, xpath and xsltc)

## xalan-xsltc dependencies

The original Xalan deps are listed at https://github.com/plutext/xalan-j/blob/trunk/src/MANIFEST.MF"

* java_cup/runtime/ 0.10k 
* BCEL 5.0 rc1 (pom now uses 5.2; but 6.3 appears to work)
* regexp 1.2 (pom now uses 1.4)

These are replaced with Maven deps, except for java_cup.runtime which is now in the xalan-xsltc source tree. 
See http://www2.cs.tum.edu/projects/cup/licence.php


## Tests

See https://github.com/plutext/xalan-test
