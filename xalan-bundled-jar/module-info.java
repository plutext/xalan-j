/**
 * @author jharrop
 *
 */
module xalan_bundled_jar {

/*  To manually add this to the shaded jar:

$ javac --patch-module xalan_bundled_jar=target/xalan-bundled-jar-2.7.3-SNAPSHOT-shaded.jar module-info.java 

(but mvn will do this for you)

*/

/* xalan_serializer */

	exports org.apache.xml.serializer;
	exports org.apache.xml.serializer.dom3;
	exports org.apache.xml.serializer.utils;

/* Xalan xalan_interpretive */

	exports org.apache.xalan;
	exports org.apache.xalan.xslt;
	exports org.apache.xpath;
	exports org.apache.xml.utils.res;
	exports org.apache.xml.utils;
	exports org.apache.xalan.transformer;
	exports org.apache.xml.dtm.ref.dom2dtm;
	exports org.apache.xml.dtm;
	exports org.apache.xpath.compiler;
	exports org.apache.xml.res;
	exports org.apache.xpath.res;
	exports org.apache.xalan.lib;
	exports org.apache.xpath.objects;
	exports org.apache.xalan.extensions;
	exports org.apache.xalan.processor;
	exports org.apache.xml.dtm.ref;
	exports org.apache.xpath.patterns;
	exports org.apache.xpath.operations;
	exports org.apache.xpath.domapi;
	exports org.apache.xalan.templates;
	exports org.apache.xpath.functions;
	exports org.apache.xml.dtm.ref.sax2dtm;
	exports org.apache.xalan.res;
	exports org.apache.xpath.jaxp;
	exports org.apache.xalan.trace;
	exports org.apache.xalan.client;
	exports org.apache.xalan.lib.sql;
	exports org.apache.xalan.serialize;
	exports org.apache.xpath.axes;

/* xalan_xsltc */

	exports org.apache.xalan.xsltc.cmdline.getopt;
	exports org.apache.xalan.xsltc;
	exports org.apache.xalan.xsltc.cmdline;
	exports org.apache.xalan.xsltc.runtime.output;
	exports org.apache.xalan.xsltc.compiler;
	exports org.apache.xalan.xsltc.runtime;
	exports org.apache.xalan.xsltc.dom;
	exports org.apache.xalan.xsltc.util;
	exports org.apache.xalan.xsltc.trax;
	exports org.apache.xalan.xsltc.compiler.util;

	exports java_cup.runtime;

/* xalan_serializer */

	requires java.xml;

/* Xalan xalan_interpretive */

    requires java.desktop;
	requires java.naming;
	requires java.sql;
	// requires java.xml;
	requires jdk.xml.dom;
	//requires xercesImpl;  
	/* could remove IncrementalSAXSource_Xerces so Xerces not required. Solves javax.xml coming from 2 modules
	The package org.w3c.dom is accessible from more than one module: java.xml, xercesImpl */

/* xalan_xsltc */
	
	//requires bcel;
	//requires java.xml;
	
	/* The package org.w3c.dom is accessible from more than one module: java.xml, xercesImpl, xml.apis 
	 * 
	 * Fix is to change classpathentry
	 * 	<classpathentry kind="con" path="org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER">
		<attributes>
			<attribute name="maven.pomderived" value="true"/>
			<attribute name="module" value="true"/>  <~~~~ remove that
		</attributes>
	</classpathentry>
	
	 * 
	 * */
}
