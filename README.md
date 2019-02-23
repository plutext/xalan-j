# Xalan-J

This is Xalan:

1. converted to a maven multi module project; 
2. with module-info.java files; and
3. https://issues.apache.org/jira/browse/XALANJ-2540 path applied

It is targeted at Java 11, so the defalt branch is Plutext_Java11  

Things would work under Java 8, provided:

* you remove the module-info.java files.
* in the config of maven-compiler-plugin, you change from <release>11</release> to <source>1.8</source><target>1.8</target>

(the poms could be tweaked to do this automatically, so it could build under either 8 or 11)

### Note re IncrementalSAXSource_Xerces

I removed IncrementalSAXSource_Xerces so that Xerces is not required. This was to solve "javax.xml coming from 2 modules
	The package org.w3c.dom is accessible from more than one module: java.xml, xercesImpl"
	
However, IncrementalSAXSource_Xerces may be useful, so it would be good to retain it.


## Build

Using Java 11 (on arch or manjaro, that would be `sudo archlinux-java set java-11-openjdk`) and a recent mvn:

```
mvn clean
mvn install
```

## Maven Modules

* xalan-serializer
* (there is no module xalan-core containing org.apache.xml, since it depends on xpath.NodeList)
* xalan-interpretive (including xpath)
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
