/**
 * 
 */
package hari.home.cxf.util;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

/**
 * @author hkumar3
 *
 */
public class CodeGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        WSDLToJava.main(new String[] {"-server","-d", "src/main/java","src/main/resources/sample.wsdl" });
        System.out.println("Done");


	}

}
