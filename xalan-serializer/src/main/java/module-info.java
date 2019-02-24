/**
 * @author jharrop
 *
 */
module xalan_serializer {
	exports org.apache.xml.serializer;
	exports org.apache.xml.serializer.dom3;
	exports org.apache.xml.serializer.utils;

	requires java.xml;
	
	opens org.docx4j.org.apache.xml.serializer; // resources	
}
