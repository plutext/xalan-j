/**
 * @author jharrop
 *
 */
module docx4j_xalan_interpretive {
	
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

	requires org.slf4j;
	
	requires java.desktop;
	requires java.naming;
	requires java.sql;
	requires java.xml;
	requires jdk.xml.dom;
	requires docx4j_xalan_serializer;
	//requires xercesImpl;  
	/* could remove IncrementalSAXSource_Xerces so Xerces not required. Solves javax.xml coming from 2 modules
	The package org.w3c.dom is accessible from more than one module: java.xml, xercesImpl */
}
