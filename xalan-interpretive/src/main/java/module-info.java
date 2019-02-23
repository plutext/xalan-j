/**
 * @author jharrop
 *
 */
module xalan_interpretive {
	
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

	requires java.desktop;
	requires java.naming;
	requires java.sql;
	requires java.xml;
	requires jdk.xml.dom;
	requires xalan_serializer;
	//requires xercesImpl;  
	/* could remove IncrementalSAXSource_Xerces so Xerces not required. Solves javax.xml coming from 2 modules
	The package org.w3c.dom is accessible from more than one module: java.xml, xercesImpl */
}
