package org.docx4j.org.apache.xml.serializer.utils;

import java.io.IOException;

import org.docx4j.org.apache.xml.serializer.OutputPropertiesFactory;

public class ResourceUtils {

    public static java.io.InputStream getResource(String filename) throws java.io.IOException
    {
//    	log.debug("Attempting to load: " + filename);
    	
        // Try to load resource from jar.  
        ClassLoader loader = OutputPropertiesFactory.class.getClassLoader();
        
        java.net.URL url = loader.getResource(filename);
    	// For Java 9, the package must be open in module-info!  
        // See https://stackoverflow.com/questions/45166757/loading-classes-and-resources-in-java-9/45173837#45173837  
        /*
			non-class-file resources in a module are encapsulated by default, 
			and hence cannot be located from outside the module unless their effective package is open. 
			
			To load resources from your own module it’s best to use the resource-lookup methods 
			in Class or Module, which can locate any resource in your module, rather than those in ClassLoader, 
			which can only locate non-class-file resources in the open packages of a module.  
         */
        
		if (url == null
				&& System.getProperty("java.vendor").contains("Android")) {
			url = loader.getResource("assets/" + filename);
			if (url!=null) System.out.println("found " + filename + " in assets");
		}

        if (url == null) {
        	// this is convenient when trying to load a resource from an arbitrary path,
        	// since in IKVM you can setContextClassLoader to a URLClassLoader,
        	// which in turn can be configured at run time to search some dir.
//        	log.debug("Trying Thread.currentThread().getContextClassLoader()");
        	loader = Thread.currentThread().getContextClassLoader();
        	url = loader.getResource(filename);
        }
        
        if (url == null) {
//        	if (filename.contains("jaxb.properties")){
//        		log.debug("Not using MOXy, since no resource: " + filename);        		
//        	} else {
//        		log.warn("Couldn't get resource: " + filename);
//        	}
        	throw new IOException(filename + " not found via classloader.");
        }
        
        // Get the jar file
//      JarURLConnection conn = (JarURLConnection) url.openConnection();
        java.io.InputStream is = url.openConnection().getInputStream();
        return is;
    }    

}
