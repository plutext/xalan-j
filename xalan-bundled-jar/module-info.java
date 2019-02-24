/**
 * @author jharrop
 *
 */
module docx4j_xalan_bundled_jar {

/*  To manually add this to the shaded jar:

$ javac --patch-module xalan_bundled_jar=target/xalan-bundled-jar-2.7.3-SNAPSHOT-shaded.jar module-info.java 

(but mvn will do this for you)

*/

/* xalan_serializer */

	exports org.docx4j.org.apache.xml.serializer;
	exports org.docx4j.org.apache.xml.serializer.dom3;
	exports org.docx4j.org.apache.xml.serializer.utils;

	opens org.docx4j.org.apache.xml.serializer; // resources
	
/* Xalan xalan_interpretive */

	exports org.docx4j.org.apache.xalan;
	exports org.docx4j.org.apache.xalan.xslt;
	exports org.docx4j.org.apache.xpath;
	exports org.docx4j.org.apache.xml.utils.res;
	exports org.docx4j.org.apache.xml.utils;
	exports org.docx4j.org.apache.xalan.transformer;
	exports org.docx4j.org.apache.xml.dtm.ref.dom2dtm;
	exports org.docx4j.org.apache.xml.dtm;
	exports org.docx4j.org.apache.xpath.compiler;
	exports org.docx4j.org.apache.xml.res;
	exports org.docx4j.org.apache.xpath.res;
	exports org.docx4j.org.apache.xalan.lib;
	exports org.docx4j.org.apache.xpath.objects;
	exports org.docx4j.org.apache.xalan.extensions;
	exports org.docx4j.org.apache.xalan.processor;
	exports org.docx4j.org.apache.xml.dtm.ref;
	exports org.docx4j.org.apache.xpath.patterns;
	exports org.docx4j.org.apache.xpath.operations;
	exports org.docx4j.org.apache.xpath.domapi;
	exports org.docx4j.org.apache.xalan.templates;
	exports org.docx4j.org.apache.xpath.functions;
	exports org.docx4j.org.apache.xml.dtm.ref.sax2dtm;
	exports org.docx4j.org.apache.xalan.res;
	exports org.docx4j.org.apache.xpath.jaxp;
	exports org.docx4j.org.apache.xalan.trace;
	exports org.docx4j.org.apache.xalan.client;
	exports org.docx4j.org.apache.xalan.lib.sql;
	exports org.docx4j.org.apache.xalan.serialize;
	exports org.docx4j.org.apache.xpath.axes;


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
