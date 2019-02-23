/**
 * @author jharrop
 *
 */
module xalan_xsltc {
	
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
	
	requires bcel;
	requires java.xml;
	requires xalan_interpretive;
	requires xalan_serializer;
	
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
